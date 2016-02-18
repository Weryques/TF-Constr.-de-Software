/**
 * 
 */
package br.com.mercadofacil.controlador;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.mercadofacil.jdbc.ComercianteDAO;
import br.com.mercadofacil.jdbc.FabricaConexao;
import br.com.mercadofacil.modelo.Comerciante;

/**
 * @author weryquessantos
 *
 */
@WebServlet(value = "/consultarcep")
public class ServletConsultaCEP extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requisicao = req.getParameter("cepProcura");
				
		if(requisicao == null){
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}
		else if(requisicao.equals("Procurar")){
			try {
				procurarSupermercado(req, resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else{
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}
	}
	
	private void procurarSupermercado(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException{
		FabricaConexao conn = new FabricaConexao();
		Connection conexao = null;
		
		conexao = conn.getConexao();
		
		conexao.setAutoCommit(false);
		
		try{
			List<?> supermercados = new ArrayList<Object>();
			ComercianteDAO comercianteDAO = new ComercianteDAO();
									
			supermercados = comercianteDAO.selectCEP(req.getParameter("cep"), conexao);
			
			HttpSession session = req.getSession(true);
			session.setAttribute("supermercados", supermercados);
			
			resp.sendRedirect("/mercadofacil/resultadobusca.jsp");
			
			conexao.commit();
			conexao.close();
		}
		catch(Exception e){
			conexao.rollback();
			e.printStackTrace();
		}		
	}
}

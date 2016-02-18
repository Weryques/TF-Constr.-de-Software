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

import br.com.mercadofacil.jdbc.ComercianteDAO;
import br.com.mercadofacil.jdbc.FabricaConexao;

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
		ComercianteDAO comerciante = new ComercianteDAO();
		ResultSet retornoSelect = null;
		List<String> supermercados = new ArrayList<String>();
		
		conexao = conn.getConexao();
		
		conexao.setAutoCommit(false);
		
		try{
			retornoSelect = comerciante.selectCEP(req.getParameter("cep"), conexao);
						
			if(retornoSelect != null){
				while(retornoSelect.next()){
					supermercados.add(retornoSelect.getString("nfEmpresa"));
				}
			}		
			
			resp.sendRedirect("/mercadofacil/resultadobusca.jsp");
			req.setAttribute("supermercados", supermercados);
			
			conexao.commit();
			conexao.close();
			retornoSelect.close();
		}
		catch(Exception e){
			conexao.rollback();
		}		
	}
}

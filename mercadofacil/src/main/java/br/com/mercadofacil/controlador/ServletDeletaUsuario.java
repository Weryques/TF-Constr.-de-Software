/**
 * 
 */
package br.com.mercadofacil.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.mercadofacil.jdbc.ComercianteDAO;
import br.com.mercadofacil.jdbc.ConsumidorDAO;
import br.com.mercadofacil.jdbc.FabricaConexao;
import br.com.mercadofacil.modelo.Comerciante;
import br.com.mercadofacil.modelo.Consumidor;

/**
 * @author weryquessantos
 *
 */
@WebServlet (value = "/deletaconta")
public class ServletDeletaUsuario extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String tipoRequisicao = req.getParameter("usuario");
		
		if(tipoRequisicao == null){
			req.getRequestDispatcher("/404.jsp").forward(req, res);
		}
		else if(tipoRequisicao.equals("consumidor")){
			try {
				deletarConsumidor(req, res);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(tipoRequisicao.equals("comerciante")){
			try {
				deletarComerciante(req, res);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(tipoRequisicao.equals("anunciante")){
			deletarAnunciante(req, res);
		}
		else{
			req.getRequestDispatcher("/404.jsp").forward(req, res);
		}
	}

	private void deletarAnunciante(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		
	}

	private void deletarComerciante(HttpServletRequest req, HttpServletResponse res) throws IOException, SQLException {
		HttpSession session = req.getSession();
		Comerciante comerciante = new Comerciante();
		ComercianteDAO comercianteDAO = new ComercianteDAO();
		FabricaConexao conn = new FabricaConexao();
		Connection conexao = conn.getConexao();
		
		comerciante = (Comerciante) session.getAttribute("comerciante");
		
		conexao.setAutoCommit(false);
		
		try {
			if(comercianteDAO.deletarDoBanco(comerciante, conexao) != 0){
				res.sendRedirect("/mercadofacil/loginpessoajuridica.jsp");
				
				conexao.commit();
				conexao.close();
			}
		} catch (Exception e) {
			conexao.rollback();
			res.sendError(0, "Erro ao deletar conta");
			e.printStackTrace();
		}		
	}

	private void deletarConsumidor(HttpServletRequest req, HttpServletResponse res) throws SQLException, IOException {
		HttpSession session = req.getSession();
		Consumidor consumidor = new Consumidor();
		ConsumidorDAO consumidorDAO = new ConsumidorDAO();
		FabricaConexao conn = new FabricaConexao();
		Connection conexao = conn.getConexao();
		
		consumidor = (Consumidor) session.getAttribute("consumidor");
		
		conexao.setAutoCommit(false);
		
		try {
			if(consumidorDAO.deletarDoBanco(consumidor, conexao) != 0){
				res.sendRedirect("/mercadofacil/supermercadounico/supermercadounico_home.jsp");
				
				conexao.commit();
				conexao.close();
			}
		} catch (Exception e) {
			conexao.rollback();
			res.sendError(0, "Erro ao deletar conta");
			e.printStackTrace();
		}
	}
}

/**
 * 
 */
package br.com.mercadofacil.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
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
@WebServlet(value = "/autenticar")
public class ServletAutenticacao extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String tipoLogin = req.getParameter("login");
		
		if(tipoLogin == null){
		}
		else if(tipoLogin.equals("comerciante")){
			try {
				entrarComoComerciante(req, resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else if(tipoLogin.equals("consumidor")){
			try {
				entrarComoConsumidor(req, resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else if(tipoLogin.equals("anunciante")){
			entrarComoAnunciante(req, resp);
		}
		else{
		}
	}
	
	private void entrarComoAnunciante(HttpServletRequest req, HttpServletResponse resp) {
		
	}

	private void entrarComoConsumidor(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		FabricaConexao conn = new FabricaConexao();
		Connection conexao = null;
		
		conexao = conn.getConexao();
		
		conexao.setAutoCommit(false);
		
		try{
			Consumidor consumidor = new Consumidor();
			ConsumidorDAO consumidorDAO = new ConsumidorDAO();
			
			consumidor.setEmail(req.getParameter("email"));
			consumidor.setSenha(req.getParameter("senha"));
			
			consumidor = consumidorDAO.selectTudo(consumidor, conexao);
			
			if(consumidor.getEmail() != null){
				//colocando consumidor na sessão
				HttpSession session = req.getSession(true);//retorna uma sessão caso exista, se não existe ele cria e retorna
				session.setAttribute("consumidor", consumidor);
				
				resp.sendRedirect("/mercadofacil/supermercadounico/supermercadounico_home_logado.jsp");//redireciona para página do perfil do consumidor
				
				conexao.commit();
				conexao.close();
			}
			else{
				resp.sendRedirect("/mercadofacil/supermercadounico/supermercadounico_loginpessoafisica.jsp");
			}
		}
		catch(Exception e){
			conexao.rollback();
		}
	}

	private void entrarComoComerciante(HttpServletRequest req, HttpServletResponse resp) throws SQLException{
		FabricaConexao conn = new FabricaConexao();
		Connection conexao = null;
		
		conexao = conn.getConexao();
		
		conexao.setAutoCommit(false);
		
		try{
			Comerciante comerciante = new Comerciante();
			ComercianteDAO comercianteDAO = new ComercianteDAO();
			
			comerciante.setEmail(req.getParameter("email"));
			comerciante.setSenha(req.getParameter("senha"));
			
			comerciante = comercianteDAO.selectTudo(comerciante, conexao);
			
			if(comerciante.getEmail() != null){ //então achou alguém
				//colocando comerciante na sessão
				HttpSession session = req.getSession(true);//retorna um sessão caso exista, se não existe ele cria e retorna
				session.setAttribute("comerciante", comerciante);
				
				resp.sendRedirect("/mercadofacil/comerciante/principal.jsp");//redireciona pra página do perfil do comerciante
				
				conexao.commit();
				conexao.close();
			}
			else{ //email ou senha errado ou não tem cadastro
				resp.sendRedirect("/mercadofacil/loginpessoajuridica.jsp");
			}
		}
		catch(Exception e){
			conexao.rollback();
			e.printStackTrace();
		}
	}
}

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
import br.com.mercadofacil.jdbc.FabricaConexao;
import br.com.mercadofacil.modelo.Comerciante;

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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(tipoLogin.equals("consumidor")){
			entrarComoConsumidor(req, resp);
		}
		else if(tipoLogin.equals("anunciante")){
			entrarComoAnunciante(req, resp);
		}
		else{
			
		}
	}
	
	private void entrarComoAnunciante(HttpServletRequest req, HttpServletResponse resp) {
		
	}

	private void entrarComoConsumidor(HttpServletRequest req, HttpServletResponse resp) {
		
	}

	private void entrarComoComerciante(HttpServletRequest req, HttpServletResponse resp) throws SQLException{
		FabricaConexao conn = new FabricaConexao();
		Connection conexao = null;
		
		conexao = conn.getConexao();
		
		conexao.setAutoCommit(false);
		
		try{
			ResultSet resultado = null;
			Comerciante comerciante = new Comerciante();
			ComercianteDAO comercianteDAO = new ComercianteDAO();
			
			comerciante.setEmail(req.getParameter("email"));
			comerciante.setSenha(req.getParameter("senha"));
			
			resultado = comercianteDAO.selectTudo(comerciante.getSenha(), comerciante.getEmail(), conexao);
			
			if(resultado.next()){ //se tem proximo, então achou alguém
				comerciante.setNomeCompleto(resultado.getString("nome"));
				comerciante.setCelular(resultado.getString("celular"));
				comerciante.setCnpjComerciante(resultado.getString("cnpj"));
				comerciante.setEmail(resultado.getString("email"));
				comerciante.setTelefone(resultado.getString("telefone"));
				comerciante.setTipoPerfil(resultado.getString("tipoPerfil"));
				
				//colocando comerciante na sessão
				HttpSession session = req.getSession(true);//retorna um sessão caso exista, se não existe ele cria e retorna
				session.setAttribute("comerciante", comerciante);
				
				resp.sendRedirect("/comerciante/principal.jsp");//redireciona pra página do perfil do comerciante
				
				conexao.commit();
				conexao.close();
				resultado.close();
			}
			else{ //email ou senha errado ou não tem cadastro
				//retornar erro
			}
		}
		catch(Exception e){
			conexao.rollback();
		}
	}
}

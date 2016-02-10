/**
 * 
 */
package br.com.mercadofacil.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author weryquessantos
 *
 */
@WebServlet(value = "/consultarcep")
public class ServletConsultaCEP extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requisicao = req.getParameter("cep");
		
		if(requisicao == null){
			req.getRequestDispatcher("../loja/index.jsp").forward(req, resp);
		}
		else if(requisicao.equals("Procurar")){
			
		}
		else{
			req.getRequestDispatcher("../loja/index.jsp").forward(req, resp);
		}
	}
}

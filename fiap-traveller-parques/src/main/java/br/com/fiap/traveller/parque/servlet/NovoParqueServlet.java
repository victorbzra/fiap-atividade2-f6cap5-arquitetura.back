package br.com.fiap.traveller.parque.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novoParque")
public class NovoParqueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nomeParque = request.getParameter("nome");
		String funcParque = request.getParameter("horarioFunc");
		String linkSite = request.getParameter("urlOfc");
		String sobrePq = request.getParameter("desc");
		String paramAvl = request.getParameter("avaliacao");
		Integer notaAvl = Integer.valueOf(paramAvl);

		
		Parques parque = new Parques();
		parque.setNome(nomeParque);
		parque.setHorarioFunc(funcParque);
		parque.setAvaliacao(notaAvl);
		parque.setUrlOfc(linkSite);
		parque.setDesc(sobrePq);
		
		
		Banco banco = new Banco();
		banco.adc(parque);
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println(nomeParque + " cadastrado com sucesso!");
		out.println("<a href=\"./listaParques\">Voltar a lista</a>");
		out.println("</body>");
		out.println("</html>");

		
		
		
	}

}

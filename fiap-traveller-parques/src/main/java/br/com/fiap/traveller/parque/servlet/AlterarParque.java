package br.com.fiap.traveller.parque.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/alterarParque")
public class AlterarParque extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		String nomeParque = request.getParameter("nome");
		String funcParque = request.getParameter("horarioFunc");
		String linkSite = request.getParameter("urlOfc");
		String sobrePq = request.getParameter("desc");
		String paramAvl = request.getParameter("avaliacao");
		Integer notaAvl = Integer.valueOf(paramAvl);

	
		Banco banco = new Banco();
		Parques parque = banco.findID(id);
        parque.setNome(nomeParque);
        parque.setHorarioFunc(funcParque);
        parque.setAvaliacao(notaAvl);
        parque.setUrlOfc(linkSite);
        parque.setDesc(sobrePq);
        response.sendRedirect("listaParques");

	
	}

}

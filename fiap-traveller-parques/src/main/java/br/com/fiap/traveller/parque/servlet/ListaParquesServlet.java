package br.com.fiap.traveller.parque.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listaParques")
public class ListaParquesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Banco banco = new Banco();
		List<Parques> listaParques = banco.getParques();
	
		request.setAttribute("listaparques", listaParques);
		
		RequestDispatcher rd = request.getRequestDispatcher("/formListaParques.jsp");
		rd.forward(request, response);
		
		
	}

}

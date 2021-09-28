package br.com.fiap.traveller.parque.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/showPq")
public class ShowDetalherPq extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String paramId = request.getParameter("id");
        final Integer id = Integer.valueOf(paramId);
        final Banco banco = new Banco();
        final Parques parque = banco.findID(id);
        request.setAttribute("parque", (Object)parque);
        
        final RequestDispatcher rd = request.getRequestDispatcher("/detalheParque.jsp");
        rd.forward((ServletRequest)request, (ServletResponse)response);
	}

}

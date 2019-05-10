package com.agenda.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;import com.agenda.model.Pessoa;
import com.agenda.service.CadastroUsuarioService;

@WebServlet("/excluir-contatos")

    public class ExcluirUsuarioServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		CadastroUsuarioService service = new CadastroUsuarioService();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(id);
		
		service.RemoverContato(pessoa);
		response.sendRedirect("busca-contatos");
	

	}

}

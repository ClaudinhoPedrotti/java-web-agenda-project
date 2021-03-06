package com.agenda.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;
import com.agenda.service.CadastroUsuarioService;

@WebServlet("/busca-contatos")
public class TabelaUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private CadastroUsuarioService service;

	public String execute(HttpServletRequest  request, HttpServletResponse response) throws Exception{
		this.service = new CadastroUsuarioService();
		List <Pessoa> contatos = this.service.buscaPessoas();
		request.setAttribute("contatos", contatos);
		return "tabela-contato.jsp";
	}
	
	@Override 
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		CadastroUsuarioService service = new CadastroUsuarioService();

		List<Pessoa> contatos = service.buscaPessoas();

		request.setAttribute("contatos", contatos);
		request.getRequestDispatcher("tabela-contato.jsp").forward(request, response);

	}

}

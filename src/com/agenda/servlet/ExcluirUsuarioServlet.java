package com.agenda.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.agenda.service.CadastroUsuarioService;

@WebServlet("/excluir-contatos")

public class ExcluirUsuarioServlet extends HttpServlet {

	private CadastroUsuarioService service;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("testando");
		
		CadastroUsuarioService service = new CadastroUsuarioService();
		
	

	}

}

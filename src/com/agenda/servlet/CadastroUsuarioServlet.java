package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;
import com.agenda.service.CadastroUsuarioService;

public class CadastroUsuarioServlet  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 /**	
		request.getParameter("exampleInputEmail1");
		System.out.println(request.getParameter("exampleInputEmail1"));
		request.getParameter("exampleInputPassword1");
		System.out.println(request.getParameter("exampleInputPassword1"));
		
		
		/** Calculadora 
		 */
		/**
		String numero1, numero2, resultado;
		
		numero1 = request.getParameter("numero1");
		numero2 = request.getParameter("numero2");
		resultado = numero1 + numero2;
		System.out.println(resultado);
		
		
		/** Calculadora 
		 */
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(request.getParameter("nome"));
		pessoa.setEndereco(request.getParameter("endereco"));
		pessoa.setEmail(request.getParameter("email"));
		pessoa.setSenha(request.getParameter("senha"));
		
		
		

	
		CadastroUsuarioService service = new CadastroUsuarioService();
		
		service.cadastra(pessoa);
	}
	
	
}

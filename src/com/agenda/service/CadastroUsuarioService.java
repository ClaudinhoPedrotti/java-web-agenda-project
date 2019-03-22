package com.agenda.service;

import com.agenda.model.Pessoa;

public class CadastroUsuarioService {

	public void cadastra(Pessoa pessoa) {
		
		System.out.println("nome: " + pessoa.getNome());
		System.out.println("email: " + pessoa.getEmail());
		System.out.println("endereço: " + pessoa.getEndereco());
		System.out.println("senha: " + pessoa.getSenha());
		
	}

}

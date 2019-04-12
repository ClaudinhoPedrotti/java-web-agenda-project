package com.agenda.service;

import com.agenda.dao.PessoaDao;
import com.agenda.model.Pessoa;

public class CadastroUsuarioService {

	public void cadastra(Pessoa pessoa) {
		PessoaDao userDAO = new PessoaDao();
		userDAO.adiciona(pessoa);

	}

}

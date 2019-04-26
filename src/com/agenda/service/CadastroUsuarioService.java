package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDao;
import com.agenda.model.Pessoa;

public class CadastroUsuarioService {

	public void cadastra(Pessoa pessoa) {
		PessoaDao userDAO = new PessoaDao();
		userDAO.adiciona(pessoa);
	}

	public List<Pessoa> buscaPessoas() {
		PessoaDao dao = new PessoaDao();
		return dao.buscaPessoas();
	}

}

package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDao;
import com.agenda.model.Pessoa;

public class CadastroUsuarioService {

	private PessoaDao dao = new PessoaDao();

	//public void cadastra(Pessoa pessoa) {
		//this.dao.adiciona(pessoa);
	//}

	public List<Pessoa> buscaPessoas() {
		return this.dao.buscaPessoas();
	}

	public void RemoverContato(Pessoa pessoa) {
		this.dao.deleteContatos(pessoa);
		
	}
	
	//public void alterarCadastro(Pessoa pessoa) {
		//this.dao.alterarCadastro(pessoa);
	//}
	
	public void cadastrarOuAlterar(Pessoa pessoa) {
		
		if (0 != pessoa.getId()) {
			this.dao.alterarCadastro(pessoa);
		} else {
			this.dao.adiciona(pessoa);
		}
	}
	

}

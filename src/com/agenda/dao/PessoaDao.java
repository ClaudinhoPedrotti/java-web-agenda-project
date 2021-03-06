package com.agenda.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import com.agenda.model.Pessoa;
import com.agenda.util.ConnectionFactory;

public class PessoaDao {
	private Connection connection;
	private PreparedStatement stmt;
	
	public PessoaDao() {
		this.connection = new ConnectionFactory().getConnection();
		
	}

	public void adiciona(Pessoa pessoa) {
		String SQL = "insert into pessoa (nome, email, endereco, senha, id) values (?, ?, ?, ?, ?)";

		try {
			
			this.connection.prepareStatement(SQL);
			this.stmt.setString(1, pessoa.getNome());
			this.stmt.setString(2, pessoa.getEmail());
			this.stmt.setString(3, pessoa.getEndereco());
			this.stmt.setString(4, pessoa.getSenha());
			this.stmt.setInt(5, pessoa.getId());

			this.stmt.execute();
			this.stmt.close();

			buscaPessoas();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Pessoa> buscaPessoas() {
		String SQL = "select * from pessoa";

		try {
			this.connection.prepareStatement(SQL);

			List<Pessoa> pessoas = new ArrayList<Pessoa>();

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Pessoa pessoa = new Pessoa();

				pessoa.setNome(rs.getString("nome"));
				pessoa.setEmail(rs.getString("email"));
				pessoa.setEndereco(rs.getString("endereco"));
				pessoa.setSenha(rs.getString("senha"));
				pessoa.setId(rs.getInt("id"));
				pessoas.add(pessoa);

			}

			this.stmt.close();
			this.connection.close();

			return pessoas;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void deleteContatos(Pessoa pessoa) {

		String SQL = "delete from pessoa where id=?";

		try {
			this.connection.prepareStatement(SQL);
			this.stmt.setInt(1, pessoa.getId());
			this.stmt.execute();
			this.stmt.close();

		} catch (SQLException e) {

			throw new RuntimeException(e);
		}
	}

	public void alterarCadastro(Pessoa pessoa) {

		String SQL = "update pessoa set " 
		+ "nome=?," 
		+ "email=?," 
		+ "endereco=?," 
		+ "senha=? " 
		+ "where id=?";
		
		try {
			this.connection.prepareStatement(SQL);

			this.stmt.setString(1, pessoa.getNome());
			this.stmt.setString(2, pessoa.getEmail());
			this.stmt.setString(3, pessoa.getEndereco());
			this.stmt.setString(4, pessoa.getSenha());
			this.stmt.setInt(5, pessoa.getId());

			this.stmt.execute();
			this.stmt.close();

			alterarCadastro(pessoa);

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

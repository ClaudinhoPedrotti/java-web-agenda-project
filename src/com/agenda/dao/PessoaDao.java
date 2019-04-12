package com.agenda.dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import com.agenda.model.Pessoa;
import com.agenda.util.ConnectionFactory;

public class PessoaDao {
	private Connection connection;

	public void adiciona(Pessoa pessoa) {
		String SQL = "insert into pessoa (nome, endereco, email, senha) values (?, ?, ?, ?)";

		try {
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = this.connection.prepareStatement(SQL);

			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getEmail());
			stmt.setString(3, pessoa.getEndereco());
			stmt.setString(4, pessoa.getSenha());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

package com.agenda.dao;

import java.sql.SQLException;

import com.agenda.model.Pessoa;
import com.mysql.jdbc.Connection;

public class pessoaDao {
	private Connection connection;
	
	public void adiciona(Pessoa pessoa) {
		String SQL = "insert into pessoas (nome, email, endereco, senha) values (?, ?, ?, ?)";
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}
}

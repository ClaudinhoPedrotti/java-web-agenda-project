<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Tabela Contatos</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="adiciona-contato.jsp">Register</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="index.html">Home</a></li>

			</ul>

		</div>
	</nav>
	<table class="table table-dark">
		<thead>
			<tr>

				<th scope="col">Nome</th>
				<th scope="col">Senha</th>
				<th scope="col">Email</th>
				<th scope="col">Endereço</th>
				<th scope="col">Ações</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="pessoa" items="${contatos}">
				<tr>

					<td>${pessoa.nome}</td>
					<td>${pessoa.senha}</td>
					<td>${pessoa.email}</td>
					<td>${pessoa.endereco}</td>
					<td><a href="excluir-contatos?id=${pessoa.id}" class="badge badge-danger">Excluir</a>
						<a href="adiciona-contato.jsp?id=${pessoa.id}&nome=${pessoa.nome}&senha=${pessoa.senha}&email=${pessoa.email}&endereco=${pessoa.endereco}" class="badge badge-success">Editar</a></td>


				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
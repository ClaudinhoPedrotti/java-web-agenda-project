
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

<title>Teste</title>
</head>
<body>
	<!--  
	<div class="dropdown">
		<button class="btn btn-secondary dropdown-toggle" type="button"
			id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
			aria-expanded="false">Menuzinho</button>
		<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
			<a class="dropdown-item" href="#">Meu usuÃ¡rio</a> <a
				class="dropdown-item" href="#">Meus lembretes</a> <a
				class="dropdown-item" href="#">Meus joguinhos</a>
		</div>
	</div>

	<br>
	<br>
	<br>
	<br>
	<br>
-->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">



		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="busca-contatos">Table <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="index.html">Home</a></li>

			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<div class="p-3 mb-2 bg-danger text-white"></div>
	<div class="p-3 mb-2 bg-warning text-dark"></div>
	<div class="p-3 mb-2 bg-info text-white"></div>

	<br>
	<div class="container-fluid">
		<form action="cadastro-usuario">
			<div class="form-group">
				<label for="exampleInputEmail1">Endereço de E-mail</label><input
					type="email" class="form-control" name="email"
					id="exampleInputEmail1" aria-describedby="emailHelp"
					placeholder="E-mail" value="${param.email}"> <small
					id="emailHelp" class="form-text text-muted">Nós nunca vamos
					compartilhar seu e-mail com mais ninguém.</small>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Senha</label> <input
					type="password" class="form-control" name="senha"
					id="exampleInputPassword1" value="${param.senha}"
					placeholder="Senha">
			</div>

			<div class="form-group">
			
			<input type="hidden" name="id" value="${param.id}">
			
			</div>
				<div class="row">
					<div class="col-sm-2"></div>
					<div class="col-sm-4">
						<label for="name"></label> <input type="text" class="form-control"
							name="nome" id="name" aria-describedby="name"
							value="${param.nome}" placeholder="Name">
					</div>


					<div class="col-sm-4">
						<label for="endereco"></label> <input type="text"
							class="form-control" name="endereco" id="endereco"
							aria-describedby="emailHelp" value="${param.endereco}"
							placeholder="Adress">
					</div>

				</div>

				<div class="text-center">
					<button type="submit" class="btn btn-primary">Enviar</button>
					<a class="btn btn-primary" href="index.html">Sair</a>
				</div>
		</form>
	</div>



	<div class="p-3 mb-2 bg-danger text-white"></div>
	<div class="p-3 mb-2 bg-warning text-dark"></div>
	<div class="p-3 mb-2 bg-info text-white"></div>

	<script src="js/jquery.js" type="text/javascript"></script>
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script src="js/inputMask.js"></script>
</body>
</html>
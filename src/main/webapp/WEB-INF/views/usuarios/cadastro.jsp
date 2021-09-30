<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<!-- About Container -->
<html>
<head>
<title>Clinica Veterinaria Arca de Noé</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Amatic+SC">
</head>
<style>
body, html {
	height: 100%
}

body, h1, h2, h3, h4, h5, h6 {
	font-family: 'Pacifico', cursiva;
}

.menu {
	display: none
}

.bgimg {
	background-repeat: no-repeat;
	background-size: cover;
	min-height: 70%;
}
</style>
</head>
<style>
body, html {
	height: 100%
}

body, h1, h2, h3, h4, h5, h6 {
	font-family: "Amatic SC", sans-serif
}

.menu {
	display: none
}

.bgimg {
	background-repeat: no-repeat;
	background-size: cover;
	background-image: url('clinica.jpg');
	min-height: 90%;
}
</style>
<body>


	<!-- Navbar (sit on top) -->
	<div class="w3-top w3-hide-small">
		<div class="w3-bar w3-xlarge w3-black w3-opacity w3-hover-opacity-off"
			id="myNavbar">
			<li class="nav-item"><span class="nav-link active">Cadastros</span></li>
			<a href="/cadastrarCliente" class="w3-bar-item w3-button">Cliente</a>
		    <a href="/cadastrarFuncionario" class="w3-bar-item w3-button">Funcionario</a>
		    <a href="/cadastrarExame" class="w3-bar-item w3-button">Exames</a>
			<a href="/cadastrarTratamento" class="w3-bar-item w3-button">Tratamento</a>
			<a href="/cadastrarEspecialidades" class="w3-bar-item w3-button">Especialidade</a>
			<a href="/cadastrarAnimal" class="w3-bar-item w3-button">Animal</a>
			<a href="/contato" class="w3-bar-item w3-button">Contato</a>

		</div>
	</div>
	<!-- Contact -->
	<div
		class="w3-container w3-padding-64 w3-white w3-grayscale-min w3-xlarge">
		<div class="w3-content">


			<h1 class="w3-center w3-jumbo" style="margin-bottom: 64px">Atendimento</h1>
			<p>
				<span>ATENÇÃO!</span> O tempo maxímo de tolerância de espera é de 20
				minutos. Caso ultrapasse o tempo, voçê terá que remarcar !
			</p>
			<p>Atendimento! Entre em contato pelo telefone ou envie-nos uma
				mensagem:
		</div>
		</p>
		<form action="/action_page.php" target="_blank">
			<p>
				<input class="form-control form-control-sm" type="text"
					placeholder="Nome">
			</p>

			<p>
				<input class="form-control form-control-sm" type="text"
					placeholder="CPF">
			</p>

			<p>
				<input class="form-control form-control-sm" type="text"
					placeholder="Endereço">
			</p>

			<p>
				<input class="form-control form-control-sm" type="text"
					placeholder="Telefone">
			</p>

			<p>
				<input class="form-control form-control-sm" type="text"
					placeholder="E-mail">
			</p>



			<p>
				<button class="w3-button w3-blue w3-block" type="submit">
					<a href="/cadastrar/salvar">ENVIAR 
				</button>
			</p>
			</a>
		</form>
	</div>
	<script>
		// Tabbed Menu
		function openMenu(evt, menuName) {
			var i, x, tablinks;
			x = document.getElementsByClassName("menu");
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			tablinks = document.getElementsByClassName("tablink");
			for (i = 0; i < x.length; i++) {
				tablinks[i].className = tablinks[i].className.replace(
						" w3-red", "");
			}
			document.getElementById(menuName).style.display = "block";
			evt.currentTarget.firstElementChild.className += " w3-red";
		}
		document.getElementById("myLink").click();
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	font-family: "Amatic SC", sans-serif
}

.menu {
	display: none
}

.bgimg {
	background-repeat: no-repeat;
	background-size: cover;
	background-image: url('pizza1.jpeg');
	min-height: 100%;
}

p {
	style ="color: Gainsboro;
}
</style>
</head>
<body bgcolor="Black">

	<!-- Navbar (sit on top) -->
	<div class="w3-top w3-hide-small">
		<div class="w3-bar w3-xlarge w3-black w3-opacity w3-hover-opacity-off"
			id="myNavbar">
			<a href="../Index.html" class="w3-bar-item w3-button">Home </a> <a
				href="CadastroCliente.html" class="w3-bar-item w3-button">Cliente</a>
			<a href="CadastroFuncionario.html" class="w3-bar-item w3-button">Funcionario</a>
			<a href="CadastroExames.html" class="w3-bar-item w3-button">Exames</a>
			<a href="CadastroTratamento.html" class="w3-bar-item w3-button">Tratamento</a>
			<a href="CadastroEspecialidade.html" class="w3-bar-item w3-button">Especialidade</a>
			<a href="CadastroAnimal.html" class="w3-bar-item w3-button">Animal</a>
			<a href="Contato.html" class="w3-bar-item w3-button">Contato</a>

		</div>
	</div>
	</div>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>

	<center>
		<h1 style="color: Red;">
			<font size="20px"><b>Horario de Funcionamento</b>
		</h1>
		</font>

		<div class="w3-row">
			<div class="w3-col s6">
				<p>
				<h1 style="color: Gainsboro;">
					<b>Segunda & Sexta Aberto 
				</h1>
				</p>
				<p>
				<h1 style="color: Gainsboro;">
					<b>Quarta 09:00 horas - 22.00 
				</h1>
				</p>
				<p>
				<h1 style="color: Gainsboro;">
					<b>Quarta 09:00 horas - 22.00 
				</h1>
				</p>
				<p>
				<h1 style="color: Gainsboro;">
					<b>Telefone: (11) 12365478 
				</h1>
				</p>
			</div>
			<div class="w3-col s6">
				<p>
				<h1 style="color: Gainsboro;">
					<b>Sexta 10:00 horas - 00:00 
				</h1>
				</p>
				<p>
				<h1 style="color: Gainsboro;">
					<b>Sábado 08:00 horas - 01:00 
				</h1>
				</p>
				<p>
				<h1 style="color: Gainsboro;">
					<b>Domingo Fechado 
				</h1>
				</p>
			</div>
		</div>

		</div>
		</div>
	</center>

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
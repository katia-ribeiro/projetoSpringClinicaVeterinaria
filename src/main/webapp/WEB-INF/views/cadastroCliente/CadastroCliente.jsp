<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- About Container -->

<html xmlns="http://www.w3.org/1999/xhtml"
    xmlns:th="http://www.thymeleaf.org"
    xmlns:sec="http://www.thymeleaf.org">
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
	background-image: url('clinica.jpg');
	min-height: 90%;
}
</style>
</head>
<body>
	<!-- Navbar (sit on top) -->
	<div class="w3-top w3-hide-small">
		<div class="w3-bar w3-xlarge w3-black w3-opacity w3-hover-opacity-off"
			id="myNavbar">
			    <a href="/" class="w3-bar-item w3-button">Home</a>
				<a href="/cadastrarCliente" class="w3-bar-item w3-button">Cliente</a>
			    <a href="/cadastrarFuncionario" class="w3-bar-item w3-button">Funcionario</a>
			    <a href="/cadastrarExame" class="w3-bar-item w3-button">Exames</a>
				<a href="/cadastrarTratamento" class="w3-bar-item w3-button">Tratamento</a>
				<a href="/cadastrarMedicamentos" class="w3-bar-item w3-button">Medicamentos</a>
				<a href="/cadastrarEspecialidades" class="w3-bar-item w3-button">Especialidade</a>
				<a href="/cadastrarAnimal" class="w3-bar-item w3-button">Animal</a>
				<a href="/contato" class="w3-bar-item w3-button">Contato</a>
		</div>
	</div>
	<!-- Contact -->
	<div
		class="w3-container w3-padding-64 w3-blue-grey w3-grayscale-min w3-xlarge">
		<div class="w3-content">
			<h1 class="w3-center w3-jumbo" style="margin-bottom: 64px">Cadastro
				Clientes</h1>
			<p>Faca sua Consultas com gente!</p>
			<p><span class="w3-tag">ATENÇÃO</span> O tempo maxímo de tolerencia de espera é de 20 minutos. Caso ultrapasse o tempo, voçê tera que remarcar !</p>
			<p class="w3-xxlarge"><strong>Atendimento</strong>, Entre em contato pelo telefone ou envie-nos uma mensagem:</p>
			<form class="container" method="post">
			<p><input class="w3-input w3-padding-16 w3-border" type="text"placeholder="Nome" required name="Nome"></p>
			<p><input class="w3-input w3-padding-16 w3-border" type="text"placeholder="Endereço" required name="Endereco"></p>
			<p><input class="w3-input w3-padding-16 w3-border" type="tel"placeholder="Telefone" required name="Telefone"></p>
			<p><input class="w3-input w3-padding-16 w3-border" type="number"placeholder="CPF" required name="Cpf"></p>
			<p><button class="w3-button w3-light-grey w3-block" type="submit">Cadastrar</button></p>
			</form>
		</div>
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
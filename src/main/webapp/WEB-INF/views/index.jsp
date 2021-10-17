
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- About Container -->
<html>
<head> 
<title>Clinica Veterinaria Arca de Noé</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Amatic+SC">
</head>
<style>
body, html {height: 100%}
body,h1,h2,h3,h4,h5,h6 {font-family: "Amatic SC", sans-serif}
.menu {display: none}
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
  <div class="w3-bar w3-xlarge w3-black w3-opacity w3-hover-opacity-off" id="myNavbar">
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
	<section class="layout-content">

			<nav class="navbar navbar-expand-md bg-light">
				<div class="collapse navbar-collapse" id="navbarsExampleDefault">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item active"><i class="oi oi-caret-right"></i>

						</li>
					</ul>
				</div>
</nav>
	
			</nav>

			<div class="container">
				<div class="card" style="width: 50rem;">
					<img
						src="https://www.acritica.com/uploads/news/image/732823/show_SickDog.jpg"
						alt="Card image cap">
					<div class="card-body"></div>
				</div>
			</div>
	</div>
	</div>
	</div>

	</section>

	</div>
	<footer class="layout-footer">
		<div class="container">
			<span class="footer-copy">&copy; Arca de Noé 2021.</span>
		</div>
	</footer>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/jquery-mask-plugin/dist/jquery.mask.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript">
	    
		$(function() {
			$('[data-toggle="popover"]').popover();
		});
		
		$(document).ready(function(){
		    $(".navbar-toggle").click(function(){
		        $(".sidebar").toggleClass("sidebar-open");
		    })
		});

	</script>
</body>
</html>
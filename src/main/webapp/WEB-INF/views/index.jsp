<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Clinica Veterinária Arca de Noé</title>
<spring:url value="agendamento/" var="agendamento"></spring:url>
<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="styLesheet">
<link href="/webjars/open-iconic/font/css/open-iconic-bootstrap.min.css" rel="stylesheet" >

<!-- Custom styles for this template -->
<link href="/css/style.css" rel="stylesheet" />

</head>

<body>
	<header>
		<nav
			class="navbar navbar-inverse navbar navbar-dark bg-dark fixed-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="btn btn-dark navbar-toggle pull-left">
						<i class="oi oi-menu"></i>
					</button>
					<a class="navbar-brand " href="#">Painel Administrativo da
						Clinica</a>
				</div>
			</div>
		</nav>
	</header>

	<div class="layout-main">

		<aside>
			<nav class="sidebar sidebar-open">
				<ul class="nav nav-pills">
					<li class="nav-item"><a class="nav-link " href="/"> <i
							class="oi oi-home"></i> <span></span>
					</a></li>
				</ul>

				<ul class="nav nav-pills">
					<li class="nav-item"><span class="nav-link active">Usuários</span></li>
					<li class="nav-item"><a class="nav-link" href="/usuarios/novo">
							<i class="oi oi-plus"></i> <span>Agendamentos </span>
					</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/usuarios/listar"> <i class="oi oi-spreadsheet"></i> <span>Listas
						</span>
					</a></li>
				</ul>
			</nav>
		</aside>

		<section class="layout-content">

			<nav class="navbar navbar-expand-md bg-light">
				<div class="collapse navbar-collapse" id="navbarsExampleDefault">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item active"><i class="oi oi-caret-right"></i>

						</li>
					</ul>
				</div>
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
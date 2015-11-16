
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="JCristobal">
    <!-- Bootstrap core CSS -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<!-- Custom styles for this template -->
	<link href="css/main.css" rel="stylesheet">
</head>
<body>	

<div class="container">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
				
					
					
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
							<h4 class="centrado"> Registrar usuario</h4>
								<form  action="ListaCorreosServlet" method="post" role="form" style="display: block;">
									<div class="form-group">
										<input type="text" name="nombre" id="nombre" tabindex="1" class="form-control" placeholder="Nombre" value="">
									</div>
									<div class="form-group">
										<input type="text" name="apellido" id="apellido" tabindex="2" class="form-control" placeholder="Apellido" value="">
									</div>
									<div class="form-group">
										<input type="email" name="email" id="email" tabindex="3" class="form-control" placeholder="Email" value="">
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="hidden" name="action" value="insertar"/>
												<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Registrar">
											</div>
										</div>
									</div>
								</form>
								
								<h4 class="centrado" id="titulo"> Busqueda de usuario</h4>
								<form  action="ListaCorreosServlet" method="post" role="form" style="display: block;">
								<div  >	
									<div class="form-group" style="display: inline-block; margin: 0px 10px -15px 0px; width: 340px;">
									<div >
										<input type="text" name="email" id="email" tabindex="5" class="form-control" placeholder="Email" value="">
									</div>
									</div>
									    <div class="form-group" style="display: inline-block;">
										<div  >
											<div >
												<input type="hidden" name="action" value="seleccionarUsuario"/>
												<input type="submit" name="login-submit" id="login-submit" tabindex="6" class="form-control btn btn-login" value="Buscar usuario"  >
											</div>
										</div>
									</div>
									<br> </br>
									<div class="form-group">
										<c:if test="${not empty usuarios}">
										
											<div class="panel panel-default" >
											  <div class="panel-body" style="padding: 7px 15px;">
											    <p> Nombre : <c:out value="${buscado.getNombre()}" />	</p>		
											    <p> Apellido : <c:out value="${buscado.getApellido()}" />   </p>
											  </div>
											</div>

										</c:if>
									</div>
								</div>	
								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


<div id ="tabla" class="panel panel-primary">
<div class="panel-heading"><h4 class="centrado" >Lista de usuarios</h4></div>

<c:if test="${not empty usuarios}">
	<table class="table table-striped">
		<thead>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Email</th>
		</thead>
		<tbody>
			<c:forEach var="u" items="${usuarios}">
				<tr>
					<form action="ListaCorreosServlet" method="post">
						<td>
							<input type="text" name="nombre" value="${u.getNombre()}"/>
						</td>
						<td>
							<input type="text" name="apellido" value="${u.getApellido()}"/>
						</td>
						<td>
							<input type="text" name="email" value="${u.getEmail()}" readonly/>								
						</td>
						<td>
							<input type="hidden" name="action" value="actualizar"/>
							<input type="submit" value="Actualizar" class="btn btn-warning"/>
						</td>
					</form>
					<td>							
						<form action="ListaCorreosServlet" method="post">
							<input type="hidden" name="action" value="eliminar"/>
							<input type="hidden" name="email" value="${u.getEmail()}"/>
							<input type="submit" value="Eliminar" class="btn btn-danger" />
						</form>
					</td>
				</tr>	
			</c:forEach>
		</tbody>
	</table>
</c:if>
</div>			

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script>
    $(function() {

        $('#login-form-link').click(function(e) {
    		$("#login-form").delay(100).fadeIn(100);
     		$("#register-form").fadeOut(100);
    		$('#register-form-link').removeClass('active');
    		$(this).addClass('active');
    		e.preventDefault();
    	});
    	$('#register-form-link').click(function(e) {
    		$("#register-form").delay(100).fadeIn(100);
     		$("#login-form").fadeOut(100);
    		$('#login-form-link').removeClass('active');
    		$(this).addClass('active');
    		e.preventDefault();
    	});

    });
    </script>
</body>
</html>

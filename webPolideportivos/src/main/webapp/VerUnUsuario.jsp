<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="clases.Usuario"%>

<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Ver un usuario</title>
</head>
<body>
	<%Usuario usuario = (Usuario) request.getAttribute("usuario");%>
	<h1>Usuario elegido</h1>
	
	<h4>ID:</h4>
	<p><%=usuario.getId()%></p>
	
	<h4>Nombre:</h4>
	<p><%=usuario.getNombre()%></p>
	
	<h4>Contraseña:</h4>
	<p><%=usuario.getContrasena()%></p>
	<br>
	<button type="button" class="btn btn-secondary">
		<a style="color: white; text-decoration: none"
		href="ControladorVerUsuarios">Volver</a>
	</button>

</body>
</html>
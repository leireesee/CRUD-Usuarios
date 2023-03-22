<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="clases.Usuario"%>
<%@page import="controlador.ControladorInsertarUsuario"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Insertar Usuario</title>
</head>
<body>
	<br>
	<h2>Inserta los datos del nuevo usuario</h2>
	<br>
	<form method="post" action="ControladorInsertarUsuario" style="width:35%">
	  <div class="mb-3">
	    <label for="exampleInputName" class="form-label">Nombre</label>
	    <input type="text" class="form-control" id="exampleInputName" aria-describedby="name" name="nombre">
	  </div>
	  
	  <button type="submit" class="btn btn-primary"><a style="color:white; text-decoration:none">Submit</a></button>
	</form>
	
</body>
</html>
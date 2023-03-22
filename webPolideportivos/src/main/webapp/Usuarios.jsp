<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="clases.Usuario"%>
<%@page import="controlador.ControladorEliminarUsuario"%>
<%@page import="controlador.ControladorVerUsuarios"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Usuarios</title>


</head>
<body>


	<br>

	<div style="width: 100%; display: flex; justify-content: space-between">
		<h1>USUARIOS DEL POLIDEPORTIVO:</h1>
		<button type="button" class="btn btn-primary">
			<a style="color: white; text-decoration: none"
				href="ControladorInsertarUsuario">INSERTAR UN USUARIO</a>
		</button>
	</div>

	<br>

	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Nombre y Apellidos</th>
				<th scope="col">Contraseña</th>
				<th scope="col">Opciones</th>
			</tr>
		</thead>
		<tbody>

			<%
			ArrayList<Usuario> usuarios = (ArrayList<Usuario>) request.getAttribute("usuarios");
			for (Usuario usuario : usuarios) {
			%>

			<tr>
				<th scope="row"><%=usuario.getId()%></th>
				<td><%=usuario.getNombre()%></td>
				<td><%=usuario.getContrasena()%></td>
				<td>
					<button type="button" class="btn btn-success">
						<a style="color: white; text-decoration: none"
							href="ControladorModificarUsuario?id=<%=usuario.getId()%>">Modificar</a>
					</button>
					<button type="button" class="btn btn-danger">
						<a style="color: white; text-decoration: none"
							href="ControladorEliminarUsuario?id=<%=usuario.getId()%>">Eliminar</a>
					</button>
				</td>
			</tr>

			<%
			}
			%>

		</tbody>
	</table>
	<br>



</body>
</html>
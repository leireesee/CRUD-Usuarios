<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login correcto!</title>
</head>
<body>
	<form action="ControladorFormulario" method="post" style="border: 3px solid grey; width: 400px; padding-left: 15px; padding-bottom: 15px;">
		<h1>Login</h1>
		<label for="username">Usuario<span style="color: red;">*</span>:</label>
	    <input type="text" id="username" name="username" required>
	    <br>
	    <br>
	    <label for="pwd">Password<span style="color: red;">*</span>:</label>
	    <input type="text" id="pws" name="pwd" required>
	    <br>
	    <br>
	    <input type="submit">
	    <br>
	    <p style="color: green">Login correcto!</p>
    </form>
</body>
</html>
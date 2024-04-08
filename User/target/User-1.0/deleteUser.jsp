<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Eliminar Usuario</title>
</head>
<body>
    <h1>Eliminar Usuario</h1>
    
    <form action="DeleteUser" method="post">
        <!-- Campo para ingresar el nombre de usuario del usuario a eliminar -->
        <label for="username">Nombre de Usuario:</label><br>
        <input type="text" id="username" name="username" required><br>
        
        <!-- Botón para enviar el formulario y eliminar al usuario -->
        <input type="submit" value="Eliminar Usuario">
    </form>

    <br>
    <a href="index.html">Volver al Menú Principal</a>
</body>
</html>
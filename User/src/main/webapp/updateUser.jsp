<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="Servlets.User" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Actualizar Usuario</title>
</head>
<body>
    <h1>Actualizar Usuario</h1>
    
    <form action="UpdateUser" method="post">
        <!-- Campo para ingresar el nombre de usuario a actualizar -->
        <label for="username">Nombre de Usuario:</label><br>
        <input type="text" id="username" name="username" required><br>
        
        <!-- Campos para ingresar los nuevos datos del usuario -->
        <label for="newName">Nuevo Nombre:</label><br>
        <input type="text" id="newName" name="newName" required><br>
        
        <label for="newEmail">Nuevo Correo Electrónico:</label><br>
        <input type="email" id="newEmail" name="newEmail" required><br>
        
        <label for="newPassword">Nueva Contraseña:</label><br>
        <input type="password" id="newPassword" name="newPassword" required><br>
        
        <!-- Botón para enviar el formulario y actualizar el usuario -->
        <input type="submit" value="Actualizar Usuario">
    </form>

    <br>
    <a href="index.html">Volver al Menú Principal</a>
</body>
</html>
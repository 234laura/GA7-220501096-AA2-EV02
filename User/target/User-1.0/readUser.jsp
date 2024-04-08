<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="Servlets.User" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Usuarios</title>
    <style>
        /* Aplicar estilos a la tabla */
        table {
            width: 100%; /* Ocupar todo el ancho del contenedor */
            border-collapse: collapse; /* Colapsar los bordes de la tabla */
        }
        th, td {
            padding: 8px; /* Agregar relleno a las celdas */
            text-align: left; /* Alinear texto a la izquierda */
            border-bottom: 1px solid #ddd; /* Agregar borde inferior a las celdas */
        }
        th {
            background-color: #f2f2f2; /* Fondo gris claro para las celdas de encabezado */
        }
        tr:hover {
            background-color: #f5f5f5; /* Fondo gris claro al pasar el mouse */
        }
    </style>
</head>
<body>
    <h1>Lista de Usuarios</h1>
    
    <%
        // Obtener la lista de usuarios del contexto de la aplicación
        List<User> userList = (List<User>) getServletContext().getAttribute("userList");
        
        // Verificar si hay usuarios en la lista
        if (userList == null || userList.isEmpty()) {
    %>
            <p>No hay usuarios registrados.</p>
    <%
        } else {
    %>
            <table>
                <tr>
                    <th>Nombre</th>
                    <th>Correo Electrónico</th>
                    <th>Contraseña</th>
                </tr>
    <%
            for (User user : userList) {
    %>
                <tr>
                    <td><%= user.getName() %></td>
                    <td><%= user.getEmail() %></td>
                    <td><%= user.getPassword() %></td>
                </tr>
    <%
            }
    %>
            </table>
    <%
        }
    %>

    <br>
    <a href="index.html">Volver al menú principal</a>
</body>
</html>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Crear Usuario</title>
</head>
<body>
    <h1>Crear Usuario</h1>
    <form action="CreateUser" method="post">
        <!-- Campo para ingresar el nombre de usuario -->
        <label for="username">Usuario:</label><br>
        <input type="text" id="username" name="username" required><br>
        
        <!-- Campo para ingresar el correo electrónico -->
        <label for="email">Correo:</label><br>
        <input type="email" id="email" name="email" required><br>
        
        <!-- Campo para ingresar la contraseña -->
        <label for="password">Contraseña:</label><br>
        <input type="password" id="password" name="password" required><br>
        
        <!-- Botón para enviar el formulario y crear el usuario -->
        <input type="submit" value="Crear Usuario">
    </form>
</body>
</html>
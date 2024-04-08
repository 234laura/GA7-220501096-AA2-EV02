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
        
        <!-- Campo para ingresar el correo electr�nico -->
        <label for="email">Correo:</label><br>
        <input type="email" id="email" name="email" required><br>
        
        <!-- Campo para ingresar la contrase�a -->
        <label for="password">Contrase�a:</label><br>
        <input type="password" id="password" name="password" required><br>
        
        <!-- Bot�n para enviar el formulario y crear el usuario -->
        <input type="submit" value="Crear Usuario">
    </form>
</body>
</html>
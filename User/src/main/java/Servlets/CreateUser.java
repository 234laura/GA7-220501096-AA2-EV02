/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lau
 */
@WebServlet(name = "CreateUser", urlPatterns = {"/CreateUser"})
public class CreateUser extends HttpServlet {

    // Lista para almacenar todos los usuarios creados
    private final List<User> userList = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Crear un nuevo objeto User y establecer sus atributos
        User newUser = new User();
        newUser.setName(username);
        newUser.setEmail(email);
        newUser.setPassword(password);

        // Agregar el nuevo usuario a la lista
        userList.add(newUser);

        // Almacenar la lista de usuarios en el contexto de la aplicación
        ServletContext context = getServletContext();
        context.setAttribute("userList", userList);

        // Construir el mensaje de éxito con el enlace al menú principal en HTML
        String successMessage = "Usuario registrado<br><a href='index.html'>Volver al menú principal</a>";

        // Establecer el tipo de contenido de la respuesta
        response.setContentType("text/html");

        // Escribir el mensaje de éxito en el cuerpo de la respuesta
        response.getWriter().write(successMessage);
    }

}

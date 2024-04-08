/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@WebServlet(name = "DeleteUser", urlPatterns = {"/DeleteUser"})
public class DeleteUser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtain the username of the user to be deleted from the request parameters
        String username = request.getParameter("username");

        // Obtain the list of users from the application context
        List<User> userList = (List<User>) getServletContext().getAttribute("userList");

        // Use an iterator to safely remove the user from the list
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getName().equals(username)) {
                iterator.remove();
                // Show a success message in the HTTP response
                response.getWriter().write("Usuario eliminado");
                // Construir el mensaje de éxito con el enlace al menú principal en HTML
                String successMessage = "<br><a href='index.html'>Volver al menú principal</a>";

                // Establecer el tipo de contenido de la respuesta
                response.setContentType("text/html");

                // Escribir el mensaje de éxito en el cuerpo de la respuesta
                response.getWriter().write(successMessage);
                return;
            }
        }

        // If the user was not found, show an error message in the HTTP response
        response.getWriter().write("Usuario no encontrado");
        // Construir el mensaje de éxito con el enlace al menú principal en HTML
        String successMessage = "<br><a href='index.html'>Volver al menú principal</a>";

        // Establecer el tipo de contenido de la respuesta
        response.setContentType("text/html");

        // Escribir el mensaje de éxito en el cuerpo de la respuesta
        response.getWriter().write(successMessage);

    }
}

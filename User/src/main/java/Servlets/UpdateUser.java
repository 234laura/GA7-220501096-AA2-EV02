/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Servlets.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UpdateUser", urlPatterns = {"/UpdateUser"})
public class UpdateUser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String username = request.getParameter("username");
        String newName = request.getParameter("newName");
        String newEmail = request.getParameter("newEmail");
        String newPassword = request.getParameter("newPassword");

        // Obtener la lista de usuarios del contexto de la aplicación
        List<User> userList = (List<User>) getServletContext().getAttribute("userList");

        // Verificar si la lista de usuarios está vacía
        if (userList == null || userList.isEmpty()) {
            // Mostrar un mensaje de error y redirigir a la página principal
            response.sendRedirect("index.html?error=No hay usuarios registrados");
            return;
        }

        // Buscar el usuario a actualizar por su nombre de usuario
        User updateUser = null;
        for (User user : userList) {
            if (user.getName().equals(username)) {
                updateUser = user;
                break;
            }
        }

        // Si el usuario existe, actualizar sus datos
        if (updateUser != null) {
            updateUser.setName(newName);
            updateUser.setEmail(newEmail);
            updateUser.setPassword(newPassword);

            // Mostrar un mensaje de éxito en la respuesta HTTP
            response.getWriter().write("Usuario actualizado");
        } else {
            // Mostrar un mensaje de error y redirigir a la página principal
            response.sendRedirect("index.html?error=Usuario no encontrado");
        }
    }
}
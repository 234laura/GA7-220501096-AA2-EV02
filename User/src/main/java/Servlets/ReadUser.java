
package Servlets;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ReadUser", urlPatterns = {"/ReadUser"})
public class ReadUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Establecer el tipo de contenido de la respuesta
        response.setContentType("text/html;charset=UTF-8");
        
        // Obtener el escritor de la respuesta
        PrintWriter out = response.getWriter();
        
        // Obtener la lista de usuarios del contexto de la aplicación
        List<User> userList = (List<User>) getServletContext().getAttribute("userList");
        
        // Escribir el inicio del HTML
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>List of Users</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>List of Users</h1>");
        
        // Verificar si hay usuarios en la lista
        if (userList == null || userList.isEmpty()) {
            out.println("<p>Usuario no registrado</p>");
        } else {
            // Si hay usuarios en la lista, mostrarlos
            out.println("<table border='1'>");
            out.println("</th><th>Name</th><th>Email</th><th>Password</th></tr>");
            for (User user : userList) {
                out.println("</td><td>" + user.getName() + "</td><td>" + user.getEmail() + "</td><td>" + user.getPassword() + "</td></tr>");
            }
            out.println("</table>");
        }
        
        // Agregar un enlace para volver al menú principal
        out.println("<br><a href='index.html'>Back to Main Menu</a>");
        
        // Escribir el final del HTML
        out.println("</body>");
        out.println("</html>");
    }
}
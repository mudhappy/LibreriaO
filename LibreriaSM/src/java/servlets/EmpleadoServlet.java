
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.EmpleadoService;



@WebServlet(name = "EmpleadoServlet", urlPatterns = {"/EmpleadoServlet","/AddEmpleado"})
public class EmpleadoServlet extends HttpServlet {

    private EmpleadoService es;

    @Override
    public void init() throws ServletException {
        es = new EmpleadoService();
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if (path.equals("/AddEmpleado")) {
            addEmpleado(request, response);
        } 

    }

    private void addEmpleado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         try {
      // Datos
      String nombre = request.getParameter("nombre");
      String dni = request.getParameter("dni");
      String apellidopa = request.getParameter("apellidopa");
      String apellidoma = request.getParameter("apellidoma");
      int idcar = Integer.parseInt(request.getParameter("idcar"));
      String email = request.getParameter("email");
      String telefono = request.getParameter("telefono");
      String celular = request.getParameter("celular");
      String usuario = request.getParameter("usuario");
      String clave = request.getParameter("clave");
      int estado = Integer.parseInt(request.getParameter("estado"));
      //Proceso
      es.addEmpleado(nombre, dni, apellidopa, apellidoma, idcar, email, telefono, celular, usuario, clave);
      // Salida
      request.setAttribute("msg", "Proceso ok.");
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
    }
        // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("articulo.jsp");
    rd.forward(request, response);
    }
}

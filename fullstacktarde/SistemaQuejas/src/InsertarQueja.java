
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class InsertarQueja extends HttpServlet {

    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {

        //1 proceso
        HttpSession sesion = peticion.getSession(true);

        String sexo = peticion.getParameter("sexo");
        String tipo_queja = peticion.getParameter("tipo_queja");
        String descripcion = peticion.getParameter("descripcion");
        String x = peticion.getParameter("x");
        String y = peticion.getParameter("y");
        String id_distrito = (String) sesion.getAttribute("id_distrito");

        //Conectar a la BD
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/sistema_de_quejas", "root", "");
            System.out.println("Conectados a sistema de quejas");

        } catch (SQLException sqe) {
            System.out.println("No se pudo conectar" + sqe.getMessage());
        }

        //Insertar en BD
        PreparedStatement pst = null;

        //2 salida
        respuesta.setContentType("text/html");
        //creamos canal de salida
        PrintWriter pw = respuesta.getWriter();
        
        pw.println("<HTML>");
        pw.println("<HEAD>");
        pw.println("</HEAD>");
        pw.println("<BODY>");

        //Insertar en base de datos
        try {
            pst = con.prepareStatement("insert into quejas values(null,?,?,?,?,?,?)");
            //darle valor a las ?
            pst.setString(1, sexo);
            pst.setString(2, tipo_queja);
            pst.setString(3, descripcion);
            pst.setString(4, x);
            pst.setString(5, y);
            pst.setString(6, id_distrito);

            //ejecutar la sentencia
            pst.executeUpdate();
            pw.println("<H1>QUEJA AÑADIDA CORRECTAMENTE, EN BREVE NOS PONDREMOS EN CONTACTO, MUCHAS GRACIAS</H1>");

        } catch (SQLException sqe) {
            pw.println("<H1>NO SE PUDO AÑADIR LA QUEJA</H1>");
            System.out.println(sqe.getMessage());
        }
        
        pw.println("<META HTTP-EQUIV=\"REFRESH\" CONTENT=\"2;URL=http://localhost:8080/sistema_quejas/sistema_quejas.html\">");
        pw.println("</BODY>");
        pw.println("</HTML>");

        //Desconectar
        try {
            con.close();
            System.out.println("Desconectados de Sistema de Quejas");
        } catch (SQLException sqe) {
            System.out.println("No se pudo desconectar" + sqe.getMessage());
        }

    }

}

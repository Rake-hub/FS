
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FormularioQueja extends HttpServlet {

    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {

        //1 proceso
        HttpSession sesion = peticion.getSession(true);
        String id_distrito = (String) sesion.getAttribute("id_distrito");
        String nombre_distrito = (String) sesion.getAttribute("nombre_distrito");

        //2 salida
        respuesta.setContentType("text/html");
        //creamos canal de salida
        PrintWriter pw = respuesta.getWriter();
        pw.println("<HTML>");
        pw.println("<HEAD>");
        pw.println(" <style>\n"
                + "\n"
                + "        h2{\n"
                + "            color: black;\n"
                + "            font-size: 50px;\n"
                + "        }\n"
                + "\n"
                + "    </style>");
        pw.println("</HEAD>");
        pw.println("<BODY>");

        pw.println("<H1>Tus datos:</H1>");

        pw.println("<form action=\"http://localhost:8080/examples/servlets/servlet/InsertarQueja\">\n"
                + "    Sexo: \n"
                + "    <select name=\"sexo\" id=\"sexo\">\n"
                + "        <option value=\"m\">Masculino</option>\n"
                + "        <option value=\"f\">Femenino</option>\n"
                + "    </select>\n"
                + "    <br>\n"
                + "    Tipo:\n"
                + "    <select name=\"tipo_queja\" id=\"sexo\">\n"
                + "        <option value=\"a\">Ambiental</option>\n"
                + "        <option value=\"s\">Social</option>\n"
                + "        <option value=\"c\">Conflictiva</option>\n"
                + "    </select>\n"
                + "    <br>\n"
                + "    <br>\n"
                + "    <div  style=\"vertical-align: top;\">Descripcion:</div> \n"
                + "    <textarea style=\"height:50px; width: 500px; display: inline;\" name=\"descripcion\"><textarea>\n"
                + "    <br>\n"
                + "    <br>\n");
        pw.println("<input type='hidden' name='x' value='" + peticion.getParameter("mimapa.x") + "' size='20'>");
        pw.println("<input type='hidden' name='y' value='" + peticion.getParameter("mimapa.y") + "' size='20'>");
        pw.println("<input type='submit' value='Enviar Queja'>");
        pw.println("</FORM>");
        pw.println("<DIV style=\" position:absolute;top:70px;left:1200px\">");
        pw.println("<h2>" + id_distrito + " | " + nombre_distrito + "</h2>");
        pw.println("</BODY>");
        pw.println("</HTML>");

    }

}

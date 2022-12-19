
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class MarcarQueja extends HttpServlet {

    String drv;
    

    public void init(ServletConfig conf) throws ServletException {

        super.init(conf);//si queremos usar conf 
        drv = conf.getInitParameter("driver");

        try {
            Class.forName(drv);
            System.out.println("Driver cargado");
        } catch (ClassNotFoundException cne) {
            System.out.println("Driver no cargado " + cne.getMessage());
        }
    }

    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {

        //1 proceso
        HttpSession sesion = peticion.getSession(true);
        String id_distrito = (String) sesion.getAttribute("id_distrito");
        String nombre_distrito = (String) sesion.getAttribute("nombre_distrito");
        
        //Conectar a la BD
        Statement st=null;
        Statement st2=null;
        ResultSet rs=null;
    
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/sistema_de_quejas", "root", "");
            System.out.println("Conectados a sistema_de_quejas");
            st = con.createStatement();

        } catch (SQLException sqe) {
            System.out.println("No se pudo conectar" + sqe.getMessage());
        }

        //2 salida
        respuesta.setContentType("text/html");
        //creamos canal de salida
        PrintWriter pw = respuesta.getWriter();
        pw.println("<HTML>");
        pw.println("<HEAD>");
        pw.println(" <style>\n"
                + "\n"
                + "        .cabecera{\n"
                + "            width: 100%;\n"
                + "            height: 70px;\n"
                + "            background: rgb(9, 9, 74);\n"
                + "        }\n"
                + "        \n"
                + "        h1{\n"
                + "            color: white;\n"
                + "            font-size: 50px;\n"
                + "        }\n"
                + "        h2{\n"
                + "            color: black;\n"
                + "            font-size: 50px;\n"
                + "        }\n"
                + "\n"
                + "    </style>");
        
        pw.println("</HEAD>");
        pw.println("<BODY>");
        pw.println("<DIV style=\" position:absolute;top:70px;left:1200px\">");
        pw.println("<h2>" + id_distrito + " | " + nombre_distrito + "</h2>");
        pw.println("</DIV>");
      

        try {
            
            String sql = "select mapa_distrito from distritos where id_distrito="+id_distrito;
            rs=st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("Consulta realizada correctamente");
                System.out.println(rs.getString(1));

                pw.println("<FORM action=\"http://localhost:8080/examples/servlets/servlet/FormularioQueja\">");
                pw.println("<input type=\"image\" name=\"mimapa\" src=\"/sistema_quejas/img/" + rs.getString(1) + "\" height=\"800px\">");
                pw.println("</FORM>");
            } else {
                System.out.println("Registro no encontrado");
            }

        } catch (SQLException sqe) {
            System.out.println(sqe.getMessage());
        }
        
        pw.println("</BODY>");   
        pw.println("</HMTL>");
        

        


        //Desconectar
        try {
            con.close();
            System.out.println("Desconectados de Equipos");
        } catch (SQLException sqe) {
            System.out.println("No se pudo desconectar" + sqe.getMessage());
        }

    }//doget

}

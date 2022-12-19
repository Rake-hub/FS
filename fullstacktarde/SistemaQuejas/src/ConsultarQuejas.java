
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.text.DecimalFormat;

public class ConsultarQuejas extends HttpServlet {

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
        float count_a = 0.0f;
        float count_s = 0.0f;
        float count_c = 0.0f;
        float total_quejas = 0.0f;
        float escala = 500.0f;
        String pattern = "#.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        //Conectar a la BD
        Statement st = null;
        Statement st2 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;

        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/sistema_de_quejas", "root", "");
            System.out.println("Conectados a sistema_de_quejas");
            st = con.createStatement();
            st2 = con.createStatement();

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
                + "        h2{\n"
                + "            color: black;\n"
                + "            font-size: 50px;\n"
                + "           margin:0px;padding=0px;\n"
                + "        }\n"
                + "\n"
                + "    </style>");

        pw.println("</HEAD>");
        pw.println("<BODY>");
        pw.println("<DIV style=\" position:absolute;top:5px;left:1200px\">");
        pw.println("<h2>" + id_distrito + " | " + nombre_distrito + "</h2>");
        pw.println("</DIV>");

        try {

            String sql = "select mapa_distrito from distritos where id_distrito=" + id_distrito;
            rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("Consulta realizada correctamente");
                System.out.println(rs.getString(1));

                pw.println("<img name=\"mimapa\" src=\"/sistema_quejas/img/" + rs.getString(1) + "\" height=\"800px\">");

            } else {
                System.out.println("Registro no encontrado");
            }

        } catch (SQLException sqe) {
            System.out.println(sqe.getMessage());
        }

        //PINTAR QUEJAS
        try {
            String sql2 = "select * from quejas where id_distrito=" + id_distrito;
            rs2 = st2.executeQuery(sql2);
            while (rs2.next()) {
                if (rs2.getString(3).equals("a")) {
                    count_a++;
                } else if (rs2.getString(3).equals("s")) {
                    count_s++;
                } else {
                    count_c++;
                }
                pw.println("<img style='position: absolute; left:" + (rs2.getInt(5) - 7) + ";top:" + (rs2.getInt(6) - 7) + "'src='/sistema_quejas/img/" + rs2.getString(3) + ".png' "
                        + "height='30px' alt='" + rs2.getString(4) + "' title='" + rs2.getString(4) + "'>");
            }
        } catch (SQLException sqe) {
            System.out.println(sqe.getMessage());
        }
        total_quejas = count_a + count_c + count_s;


        //PINTAR BARRAS
        pw.println("<div style=\"position:absolute;top:150px;left:1200px;height:600px\">\n"
                + "<table height=\"550px\" style=\"float:bottom\" >\n"
                + "    <tr height=\"500px\">\n"
                + "        <td align=\"center\"valign=\"bottom\"><div  style=\"background-color:#00b300; height: " + ((count_a) / total_quejas) * escala + "px; width: 30px;\"></div></td>\n"
                + "        <td align=\"center\"valign=\"bottom\"><div  style=\"background-color:#0900c8; height: " + ((count_s) / total_quejas) * escala + "px; width: 30px;\"></div></td>\n"
                + "        <td align=\"center\"valign=\"bottom\"><div  style=\"background-color: #a10017; height: " + ((count_c) / total_quejas) * escala + "px; width: 30px;\"></div></td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "        <td align=\"center\">"+decimalFormat.format((count_a*100/total_quejas))+"%</td>\n"
                + "        <td align=\"center\">"+decimalFormat.format((count_s*100/total_quejas))+"%</td>\n"
                + "        <td align=\"center\">"+decimalFormat.format((count_c*100/total_quejas))+"%</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "        <td align=\"center\">Ambientales</td>\n"
                + "        <td align=\"center\">Sociales</td>\n"
                + "        <td align=\"center\">Conflictivas</td>\n"
                + "    </tr>\n"
                + "</table>\n"
                + "</div>");

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

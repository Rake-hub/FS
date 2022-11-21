/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author tarde
 */
public class BaseDatosRef {
    static Connection con=null;
    static Statement st=null; //Representa una sentencia SQL
    
    public static void main(String[] args) {
        
            //1 cargar driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver cargado");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BaseDatosRef.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            //2 conectar
            try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/almacen","root","");
            System.out.println("Conectados a Almacen");
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatosRef.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
             String sql="insert into productos values('090-J','Cafetera termica',33,2.34);";
             
        try {
            st=con.createStatement();
            int n=st.executeUpdate(sql);
            //n-->-1  afecta a toda la tabla
            //n--> 0  ningun registro afectado
            //n-->num num de reg afectados
            
            if(n==1){
                System.out.println("Registro insertado");
            }else if(n>1) System.out.println("Registros borrados");
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatosRef.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            //3 desconectar
            try {
            con.close();
            System.out.println("Desonectados de Almacen");
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatosRef.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
           
        
        
    }
    
}

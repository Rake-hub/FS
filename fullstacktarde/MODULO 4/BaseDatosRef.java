package Ventanas;


import java.sql.*;


public class BaseDatosRef {
    
    public static void main(String[] args) {
        
        Connection con=null;
        Statement st=null;//representa una sentencia SQL
        // 1. cargar driver
        
        try{
            
           Class.forName ("com.mysql.jdbc.Driver");
            System.out.println("Driver cargado");
        }catch (ClassNotFoundException cne){
            System.out.println("Driver no cargado"+cne.getMessage());
        }
      
        //2.conectar 
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/almacen", "root", "");
            System.out.println("Conectados a Almacen de Marcos");
        } catch (SQLException sqe) {
            System.out.println("No se pudo conectar a Almacen" + sqe.getMessage());

        }
        
        // Insertar /borrar
        /*
        String sql = "delete from productos where cantidad=33";
        System.out.println(sql);
        try {
            st = con.createStatement();
            int n = st.executeUpdate(sql);
            // n -->-1 afecta a toda la tabla, 
            // n-->0 ningún registro afectado,
            // n-->número , número de reg afectados
            if (n == 1) {
                System.out.println("Registro borrado");
            } else if(n>1){
                System.out.println(n + " Registros borrados");
            }else{
                
                System.out.println("Registro no  borrado");
            }
        } catch (SQLException sqe) {
            System.out.println("Error al borrar " + sqe.getMessage());
        }
        //*************************************************************************
        
        */
        
        
        // sentencia precompilada
        
        //TRANSACCION
        
        try{
            con.setAutoCommit(false);
        }catch(SQLException ex){}
        
    
        
        PreparedStatement pst=null;
        String sql2 = "insert into productos values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql2);
            pst.setString(1, "000-Z");
            pst.setString(2, "Cámara Fotográfica");
            pst.setInt(3, 44);
            pst.setFloat(4, 235.78F);
            
            
            pst.executeUpdate();
            
            con.commit();
            con.setAutoCommit(true);
            System.out.println("Nivel de aislamiento: " 
                    +con.getTransactionIsolation());
            
        } catch (SQLException sqe) {
            System.out.println("Error:" + sqe.getMessage());

        }

        //  Mostrar registros
               ResultSet rs = null;
        try {
            String sql = "select  * from productos ";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next())
            { 
            System.out.println(rs.getString(1) + 
                    "\t"+rs.getString(2) + 
                    "\t"+rs.getString(3) + 
                    "\t"+rs.getString(4) +
                    "\t");        
            }
        } catch (SQLException sqe) {
        }

        //3. desconectar

         try {
            con.close();
            System.out.println("Desconectados a Almacen");
        } catch (SQLException sqe) {
            System.out.println("No se pudo desconectar a Almacen" + sqe.getMessage());
        }
    }
    
    
}

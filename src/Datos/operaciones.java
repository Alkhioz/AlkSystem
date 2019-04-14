package Datos;
import alksystem.tiempoexe;
   import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class operaciones {
    private Statement stmt;

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }
       
    public operaciones() throws SQLException{
    }
    
    public ResultSet ConsultaBase(String consulta) {
        ResultSet resultado=null;
        try {
            conexion conexion=new conexion();
            stmt = conexion.con.createStatement();
            resultado=stmt.executeQuery(consulta);
            conexion.con.close();
            
            return resultado;
        
        } catch (SQLException ex) {
            Logger.getLogger(operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
           return resultado;
    }
    
    
        public boolean InsercionBase(String consulta) {
            boolean respuesta=true;
        try {
            long timestamp = System.currentTimeMillis();
            long timestamp2;
            
            conexion conexion=new conexion();
            stmt = conexion.con.createStatement();
            respuesta=stmt.execute(consulta);
            conexion.con.close();
            timestamp2 = System.currentTimeMillis();
            System.out.println(timestamp2-timestamp);
            tiempoexe ejec = new tiempoexe(timestamp2-timestamp);
            ejec.setVisible(true);
            ejec.setLocationRelativeTo(null);
            return respuesta;
           
        } catch (SQLException ex) {
            Logger.getLogger(operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
        
         public boolean ActualizacionBase(String consulta) {
            boolean respuesta=true;
        try {
            long timestamp = System.currentTimeMillis();
            long timestamp2;
            
            conexion conexion=new conexion();
            stmt = conexion.con.createStatement();
            respuesta=stmt.execute(consulta);
            conexion.con.close();
            timestamp2 = System.currentTimeMillis();
            System.out.println(timestamp2-timestamp);
            tiempoexe ejec = new tiempoexe(timestamp2-timestamp);
            ejec.setVisible(true);
            ejec.setLocationRelativeTo(null);
            
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }       
        
}

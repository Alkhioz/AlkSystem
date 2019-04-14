//By JcarlosAd7
package Datos;
import java.sql.*;
public class conexion {
    
    //conexion con php myadmin
    private String driver="com.mysql.jdbc.Driver";
    private String connectString="jdbc:mysql://localhost/siscolegio";
    private String user="user";
    private String password="password";
    public Connection con;
        
    public conexion(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(connectString, user , password);
        }catch ( Exception e ){
            System.out.println("error: no se pudo conectar a la base de datos: "+e.getMessage());
        }
    }
    
}

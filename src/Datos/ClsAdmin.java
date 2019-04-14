package Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClsAdmin {
   
   /**Constructor*/
   public ClsAdmin(){
   }
  
/**Datos - Metodo para registrar persona*/
 public static int veradmin(String user,String pass){
    int idadmin = 0;
       
       try {
           //Para ejecutar la consulta
           operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
           ResultSet resultado=consulta.ConsultaBase("select id from admin where user = '" +user+"' and pass = '"+pass+"'");
           if(resultado.next()){
               
           idadmin=resultado.getInt(1);
           }else {
           idadmin=0;
           }
          
       } catch (SQLException ex) {
           Logger.getLogger(ClsAdmin.class.getName()).log(Level.SEVERE, null, ex);
       }
  
    return idadmin;
   
   }
   public static int verprofe(String user,String pass){
    int idprof = 0;
       
       try {
           //Para ejecutar la consulta
           operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
           ResultSet resultado=consulta.ConsultaBase("select Idprofesor from profesor where Email = '" +user+"' and Password = '"+pass+"'");
           if(resultado.next()){        
           idprof=resultado.getInt(1);
           }else {
           idprof=0;
           }
          
       } catch (SQLException ex) {
           Logger.getLogger(ClsAdmin.class.getName()).log(Level.SEVERE, null, ex);
       }
  
    return idprof;
   
   }
   public static int verest(String user,String pass){
    int idest = 0;
       
       try {
           //Para ejecutar la consulta
           operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
           ResultSet resultado=consulta.ConsultaBase("select Idalumno from alumno where Email = '" +user+"' and Password = '"+pass+"'");
           if(resultado.next()){
               
           idest=resultado.getInt(1);
           }else {
           idest=0;
           }
          
       } catch (SQLException ex) {
           Logger.getLogger(ClsAdmin.class.getName()).log(Level.SEVERE, null, ex);
       }
  
    return idest;
   
   }
}


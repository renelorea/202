
import Models.Connection_MySQL;
import java.sql.Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class PruebasConexION {
    
    public static void main( String args[] ){
        
        Connection_MySQL db = null;
        Connection conn      = null;
        
        try{
            
            db      = new Connection_MySQL();
            conn    = db.Getconnection();
            
            if( conn != null ){
                System.out.println("CONEXION CORRECTA");
                conn.close();
            }else{
                System.out.println("ERROR AL CONECTAR CON BD");
            }
            
            
        }catch( Exception e ){
            e.printStackTrace();
        }
        
    }
    
}

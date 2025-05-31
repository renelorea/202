package com.lospekes.persistances.coneccion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author armando
 */
public class ConeccionBaseDatos {
    public static Connection connectdatabase(){
        try {
            try{
                Class.forName("com.mysql.jdbc.Driver");
            }catch (ClassNotFoundException ex){
                System.out.println("Error al registrar el driver de mysql: "+ex);
            }
            Connection connection= null;
            connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3307/LosPekes",
                            "user1","admin1");
            boolean valif = connection.isValid(50000);
            System.out.println(valif? "Text ok":"Text fail");
            return connection;
        }catch(java.sql.SQLException sqle){
            System.out.println("Error: "+sqle);   
        } 
        return null;
    }
    public static void main(String[] args){
        ConeccionBaseDatos.connectdatabase();
    }
    
}

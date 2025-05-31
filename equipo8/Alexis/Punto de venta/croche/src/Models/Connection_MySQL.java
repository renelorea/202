
package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_MySQL {
private String database_name="joyeria_2";
private String user="enano";
private String password="papacalote12";
private String url = "jdbs:mysql://localhost:3306/"+database_name;

Connection conn = null;

public Connection Getconnection(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn=DriverManager.getConnection(url,user,password); 
    }catch(ClassNotFoundException e){
    System.err.println("Ha ocurrido un ClassNotFoundException:"+e.getMessage());
     }catch(SQLException e){
         System.err.println("Ha ocurrido un SQLException:"+e.getMessage());
     }
    
    return conn;
}
}

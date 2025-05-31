
package Dao;

import Models.Connection_MySQL;
import java.sql.Connection;
import Models.Employes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class EmployesDao {
//Instanciar Conexion
Connection_MySQL cn = new Connection_MySQL();
Connection conn;
PreparedStatement pst;
ResultSet rs; 

//Variables para dar datos entre interfaces
public static int id_user=0;
public static String nombre_user="";
public static String nombre_usuario_user ="";
public static String direccion_user ="";
public static String telefono_user ="";
public static String correo_user ="";
public static String rol_user ="";

//Metodo Login
public Employes LoginQuery(String user, String password) {
  String query = "SELECT * FROM empleados WHERE nombre_usuario = ? AND contrasena = ?";

    Employes employes = new Employes();

    conn = cn.Getconnection();
    if (conn == null) {
        JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        return null;
    }

    try {
        pst = conn.prepareStatement(query);
        pst.setString(1, user);
        pst.setString(2, password);

        rs = pst.executeQuery();

        if (rs.next()) {
            employes.setId(rs.getInt("id"));
            id_user = employes.getId();

            employes.setNombre(rs.getString("nombre"));
            nombre_user = employes.getNombre();

            employes.setNombre_usuario(rs.getString("nombre_usuario"));
            nombre_usuario_user = employes.getNombre_usuario();

            employes.setDireccion(rs.getString("direccion"));
            direccion_user = employes.getDireccion();

            employes.setTelefono(rs.getString("telefono"));
            telefono_user = employes.getTelefono();

            employes.setCorreo(rs.getString("correo"));
            correo_user = employes.getCorreo();

            employes.setRol(rs.getString("rol"));
            rol_user = employes.getRol();
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error SQL al obtener el empleado: " + e.getMessage());
        e.printStackTrace();
    }
    return employes;
}


//Registrar Empleado
public boolean registerEmployesQuery(Employes employe){ 
    String query = "INSERT INTO empleados (id,nombre,nombre_usuario,direccion,telefono,correo,contrasena,rol,crear,actualizar) VALUES (?,?,?,?,?,?,?,?,?,?)";
    
    Timestamp datetime = new Timestamp(new Date().getTime());
    
    try {  
        conn = cn.Getconnection();
         pst = conn.prepareStatement(query);
        
        pst.setInt(1, employe.getId());
        pst.setString(2, employe.getNombre());
        pst.setString(3, employe.getNombre_usuario());
        pst.setString(4, employe.getDireccion());
        pst.setString(5, employe.getTelefono());
        pst.setString(6, employe.getCorreo());
        pst.setString(7, employe.getContrasena());
        pst.setString(8, employe.getRol());
        
        pst.setTimestamp(9, datetime);
        pst.setTimestamp(10, datetime);
        
        pst.execute();
        
        return true;
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Eror al registrar empleado:"+e);
         System.out.println("ERROR UBICACIÓN  :" + Employes.class.getCanonicalName());
      System.out.println("ERROR MENSAJE    :" + e.getMessage());
      e.printStackTrace();
        return false;  
    }
 
}

//Listar Empleado
public List listEmplyesQuery(String value){
    List<Employes>list_employes=new ArrayList();
    String query ="SELECT * FROM empleados ORDER BY rol ASC";
    String query_search_employe = "SELECT * FROM empleados WHERE id LIKE '";
    
    try{
        conn=cn.Getconnection();
        if(value.equalsIgnoreCase("")){
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
        }else{
            pst =  conn.prepareStatement(query_search_employe);
            rs = pst.executeQuery();
        }
        while (rs.next()) {
            Employes employe = new Employes();
            
            employe.setId(rs.getInt("id"));
            employe.setNombre(rs.getString("nombre"));
            employe.setNombre_usuario(rs.getString("nombre_usuario"));
            employe.setDireccion(rs.getString("direccion"));
            employe.setTelefono(rs.getString("telefono"));
            employe.setCorreo(rs.getString("correo"));
            employe.setRol(rs.getString("rol"));
            
            list_employes.add(employe);
        }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e.toString());
            System.out.println("ERROR UBICACIÓN  :" + Employes.class.getCanonicalName());
      System.out.println("ERROR MENSAJE    :" + e.getMessage());
      e.printStackTrace();
       }
        return list_employes;
    }
    
//Modificar Empleado
public boolean updateEmployeQuery(Employes employe){
    String query = "UPDATE empleados SET nombre = ?, nombre_usuario = ?, direccion = ?, telefono = ?, correo = ?, rol = ?, actualizar = ? WHERE id = ?";
    
    Timestamp dateTime  = new Timestamp(new Date().getTime());
    
    try{
        conn =  cn.Getconnection();
        pst = conn.prepareStatement(query);
        pst.setString(1, employe.getNombre());
        pst.setString(2, employe.getNombre_usuario());
        pst.setString(3, employe.getDireccion());
        pst.setString(4, employe.getTelefono());
        pst.setString(5, employe.getCorreo());
        pst.setString(6, employe.getRol());
        pst.setTimestamp(7, dateTime);
        pst.setInt(8, employe.getId());
        
        pst.execute();
        return true;
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error el modificar datos de empleado"+e);
         System.out.println("ERROR UBICACIÓN  :" + Employes.class.getCanonicalName());
      System.out.println("ERROR MENSAJE    :" + e.getMessage());
      e.printStackTrace();
        return false;
        
    }
 }
 
//Eliminar Empleado
public boolean deleteEmployeQuery(int id){
    String query = "DELETE FROM empleados WHERE id = "+ id;
    try{
        conn = cn.Getconnection();
        pst = conn.prepareStatement(query);
        pst.execute();
        return true;
        
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"No se puede eliminar un empleado que tenga relacion con otra tabla" +e);
         System.out.println("ERROR UBICACIÓN  :" + Employes.class.getCanonicalName());
      System.out.println("ERROR MENSAJE    :" + e.getMessage());
      e.printStackTrace();
        return false;
    }
    
 }

//Cambiar password
public boolean deleteEmployePassword(Employes employe){
 String query = "UPDATE empleados SET contrasena = ? WHERE nombre_usuario = '"+ nombre_usuario_user+'"';   
 try{
     conn = cn.Getconnection();
     pst = conn.prepareStatement(query);
     pst.setString(1, employe.getContrasena());
     pst.executeUpdate();
     return true;     
  }catch(SQLException e){
      JOptionPane.showMessageDialog(null, "Ha ocurrido un error al querer modificar la contraseña:"
              + ""+e);
       System.out.println("ERROR UBICACIÓN  :" + Employes.class.getCanonicalName());
      System.out.println("ERROR MENSAJE    :" + e.getMessage());
      e.printStackTrace();
      return false;
  }
 }
}

    
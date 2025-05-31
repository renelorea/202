
package Dao;

import Models.Connection_MySQL;
import Models.Suplimers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class SuplimersDao {
     //Instancia Conexion
Connection_MySQL cn = new Connection_MySQL();
Connection conn;
PreparedStatement pst;
ResultSet rs;

//Registrar Proveedor
public boolean registerSuplimersQuery(Suplimers suplimer){
    String query = "INSERT INTO provedores (nombre, descripcion, direccion, telefono, correo, ciudad, crear, actualizar)VALUES(?,?,?,?,?,?,?,?)";
    Timestamp dateTime = new Timestamp(new Date().getTime());
    
    try{
        conn = cn.Getconnection();
        pst = conn.prepareStatement(query);
        pst.setString(1, suplimer.getNombre());
        pst.setString(2, suplimer.getDescripcion());
        pst.setString(3, suplimer.getDireccion());
        pst.setString(4, suplimer.getTelefono());
        pst.setString(5, suplimer.getCorreo()); 
        pst.setString(6, suplimer.getCiudad());
        pst.setTimestamp(7, dateTime);
       pst.setTimestamp(8, dateTime);
       
       pst.execute();
       return true;
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Error al registrar provedor:" +e);
        return false;
    }
}

//Listar Proveedor
public List listsuplimersQuery(String value){
    List<Suplimers>list_Suplimers = new ArrayList();
  String query = "SELEC * FROM provedores" ;
  String query_search_suplimers = "SELECT * FROM provedores WHERE nombre LIKE %'"+value+"%'" ;
  try{
        conn = cn.Getconnection();
        if(value.equalsIgnoreCase("")){
            pst = conn.prepareStatement(query);
        rs = pst.executeQuery();
    }else{
        pst = conn.prepareStatement(query_search_suplimers);
        rs = pst.executeQuery();
        }
        while(rs.next()){
           Suplimers suplimers = new Suplimers();
           suplimers.setId(rs.getInt("id"));
           suplimers.setNombre(rs.getString("nombre"));
           suplimers.setDescripcion(rs.getString("descripcion"));
           suplimers.setDireccion(rs.getString("direccion"));
           suplimers.setTelefono(rs.getString("telefono"));
           suplimers.setCorreo(rs.getString("correo"));
           suplimers.setCiudad(rs.getString("ciudad"));
           list_Suplimers.add(suplimers);
           
    }  
  }catch(SQLException e){
     JOptionPane.showMessageDialog(null, e.getMessage());
     
  } return list_Suplimers;
}

//Modificar Proveedor
public boolean updateSuplimersQuery(Suplimers suplimer){
    String query = "UPDATE provedores SET nombre =?, descripcion =?, direccion =?, telefono =?,correo =?, ciudad =?, actualizar =? WHERE id = ?";
    
    Timestamp dateTime = new Timestamp(new Date().getTime());
    try{
        conn = cn.Getconnection();
        pst = conn.prepareStatement(query);
        pst.setString(1, suplimer.getNombre());
        pst.setString(2, suplimer.getDescripcion());
        pst.setString(3, suplimer.getDireccion());
        pst.setString(4, suplimer.getTelefono());
        pst.setString(5, suplimer.getCorreo());
        pst.setString(6, suplimer.getCiudad());
        pst.setTimestamp(7, dateTime);
        pst.setInt(8, suplimer.getId());
        
        pst.execute();
        return true;
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Error al modificar datos del proveedor" + e);
        return false;
    }
}

//Eliminar Proveedor
public boolean deleteSuplimersQuery(int id){
 String query = "DELETE FROM provedores WHERE id ="+id;
 try{
     conn = cn.Getconnection();
     pst = conn.prepareStatement(query);
     pst.execute();
     return true;
     
  }catch(SQLException e){
      JOptionPane.showMessageDialog(null, "Error al eliminaer proveedor"+e);
      return false;
  }
 }
}
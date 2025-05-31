
package Dao;

import Models.Connection_MySQL;
import Models.Customers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CustomersDao {
    //Instancia Conexion
Connection_MySQL cn = new Connection_MySQL();
Connection conn;
PreparedStatement pst;
ResultSet rs;

//Registrar cliente
public boolean registerCustomersQuery(Customers customer){
  String query = "INSERT INTO clientes(id, nombre_completo,direccion, telefono, correo, crear, actualizar)VALUES(?,?,?,?,?,?,?)";
  
  Timestamp dateTime = new Timestamp(new Date().getTime());
  try{
      conn = cn.Getconnection();
      pst = conn.prepareStatement(query);
      pst.setInt(1, customer.getId());
      pst.setString(2, customer.getNombre_completo());
      pst.setString(3, customer.getDireccion());
      pst.setString(4, customer.getTelefono());
      pst.setString(5, customer.getCorreo());
      pst.setTimestamp(6, dateTime);
      pst.setTimestamp(7, dateTime);
      
      pst.execute();
      return true;
  }catch(SQLException e){
      JOptionPane.showMessageDialog(null, "Error al registrar cliente"+e);
      return false;
  }
  }

//Listar clientes
public List listCustomersQuery(String value){
    List<Customers>list_customers=new ArrayList();
    
    String query = "SELEC * FROM clientes";
    String query_search_customers = "SELECT * FROM clientes WHERE id LIKE '%"+value+"%'";
    try{
        conn = cn.Getconnection();
        if(value.equalsIgnoreCase("")){
            pst = conn.prepareStatement(query);
        rs = pst.executeQuery();
    }else{
        pst = conn.prepareStatement(query_search_customers);
        rs = pst.executeQuery();
        }
        while(rs.next()){
            Customers customer = new Customers();
            customer.setId(rs.getInt("id"));
            customer.setNombre_completo(rs.getString("nombre_completo"));
            customer.setDireccion(rs.getString("direccion"));
            customer.setTelefono(rs.getString("telefono"));
            customer.setCorreo(rs.getString("correo"));
            list_customers.add(customer);
            
        }
    }catch(SQLException e){
          JOptionPane.showMessageDialog(null, e.toString());
    }
    return list_customers;
 }

//Modificar clientes
public boolean updateCustomersQuery(Customers customer){
    String query = "UPDATE clientes SET nombre_completo=?,direccion=?,telefono=?,correo=?,actualizar=?";
    Timestamp dateTime = new Timestamp(new Date().getTime());
    try{
        conn = cn.Getconnection();
        pst = conn.prepareStatement(query);
        
        pst.setString(1, customer.getNombre_completo());
        pst.setString(2,customer.getDireccion());
        pst.setString(3, customer.getTelefono());
        pst.setString(4, customer.getCorreo());
        pst.setTimestamp(5, dateTime);
        pst.setInt(6, customer.getId());
        
        pst.execute();
        return true;
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Erro al modificar datos del cliente" +e);
        return false;
    }
}

//Eliminar cliente
public boolean deleteCustomersQuery(int id){
    String query = "DELET FROM clienetes WHERE id= "+ id;
    try{
        conn = cn.Getconnection();
        pst = conn.prepareStatement(query);
        
        pst.execute();
        return true;
    }catch(SQLException e){
        
        JOptionPane.showMessageDialog(null, "No se puede eliminar un cliente q tenga relacion von otra tabla "+e);
        return false;
    }
}
}

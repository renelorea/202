
package Dao;

import Models.Categorias;
import Models.Connection_MySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CategoriasDao {

    public CategoriasDao() {
    }
         //Instancia Conexion
Connection_MySQL cn = new Connection_MySQL();
Connection conn;
PreparedStatement pst;
ResultSet rs;

//Registrar categoria
public boolean registerCategoriasQuery(Categorias categorias){
    String query        = "INSERT INTO categorias (nombre, crear, actualizar)VALUES(?,?,?)";
    Timestamp dateTIme  = new Timestamp (new Date().getTime());
    
    try{
        conn = cn.Getconnection();
        pst = conn.prepareStatement(query);
        pst.setString(1, categorias.getNombre());
        pst.setTimestamp(2, dateTIme);
        pst.setTimestamp(3, dateTIme);
        pst.execute();
        return true;
        
    }catch(Exception e){
        System.out.println("ERROR ubicación :" + Categorias.class.getCanonicalName());
        System.out.println("ERROR metodo    :" + "registerCategoriasQuery");
        System.out.println("ERROR mensaje   :" + e.getMessage() );
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al registrar la categoria"+e);
        return false;
    }finally{
        if( conn != null ){
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CategoriasDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        conn        = null;
        query       = null;
        dateTIme    = null;
        
    }
    }

//Lista Categorias
public List listCategoriasQuery(String value ){
   List<Categorias>list_categorias = new ArrayList();  
    String query = "SELECT * FROM categorias";
    String query_search_categoria = "SELECT * FROM categorias WHERE name LIKE '%"+value+"%'";
    try{
        conn = cn.Getconnection();
        if(value.equalsIgnoreCase("")){
            pst = conn.prepareStatement(query);
        rs = pst.executeQuery();
    }else{
        pst = conn.prepareStatement(query_search_categoria);
        rs = pst.executeQuery();
        }
        while(rs.next()){
            Categorias categoria = new Categorias();
            categoria.setId(rs.getInt("id"));
            categoria.setNombre(rs.getString("nombre"));
            list_categorias.add(categoria);
    }
    return list_categorias;
}catch(SQLException e){
    JOptionPane.showMessageDialog(null, e.toString());
    System.out.println("ERROR UBICACIÓN  :" + CategoriasDao.class.getCanonicalName());
      System.out.println("ERROR MENSAJE    :" + e.getMessage());
      e.printStackTrace();
    return null;
}
    
}

//Modificar categoria
public boolean updateCategoriasQuery(Categorias categorias){
    String query = "UPDATE categorias SET nombre=?, crear=?, actualizar=NOW() WHERE id=?";
    Timestamp dateTIme = new Timestamp (new Date().getTime());
    
    try{
        conn = cn.Getconnection();
        pst = conn.prepareStatement(query);
        pst.setString(1, categorias.getNombre());
        //pst.setTimestamp(2, dateTIme);
        pst.setInt(3, categorias.getId());
        pst.execute();
        return true;
        
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error al modificar la categoria"+e);
         System.out.println("ERROR UBICACIÓN  :" + CategoriasDao.class.getCanonicalName());
      System.out.println("ERROR MENSAJE    :" + e.getMessage());
      e.printStackTrace();
        return false;
    }
    }

//Eliminar Categoria
public boolean deleteCAtegoriasQuery(int id){
 String query = "DELETE FROM categorias WHERE id ="+id;
 try{
     conn = cn.Getconnection();
     pst = conn.prepareStatement(query);
     pst.execute();
     return true;
     
  }catch(SQLException e){
      JOptionPane.showMessageDialog(null, "Error al eliminaer categoria"+e);
       System.out.println("ERROR UBICACIÓN  :" + CategoriasDao.class.getCanonicalName());
      System.out.println("ERROR MENSAJE    :" + e.getMessage());
      e.printStackTrace();
      return false;
  }
}
}

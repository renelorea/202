
package Dao;

import Models.Connection_MySQL;
import Models.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class ProductosDao {

//Instanciar Conexion
Connection_MySQL cn = new Connection_MySQL();
Connection conn;
PreparedStatement pst;
ResultSet rs;     

//Registrar Productos
public boolean registerProductosQuery(Productos producto) {
  String query = "insert into productos(codigo, nombre, descripcion, precio_unidad, crear, actualizar, id_categoria) values (?,?,?,?,?,?,?,?)";  
  Timestamp datetime = new Timestamp(new Date().getTime());
  try{
  conn = cn.Getconnection();
  pst = conn.prepareStatement(query);
  
  pst.setInt(1, producto.getCodigo());
  pst.setString(2, producto.getNombre());
  pst.setString(3, producto.getDescripcion());
  pst.setDouble(4, producto.getPrecio_unidad());
  pst.setTimestamp(5, datetime);
  pst.setTimestamp(6, datetime);
  pst.setInt(7, producto.getId_categoria());
  
  pst.execute();
  return true;
  }catch(SQLException e){
      JOptionPane.showMessageDialog(null, "Error al registrar el producto"+e);
      return false;
  }
 }

//Listar Productos
public List listProductosQuery(String value){
    List<Productos>list_productos=new ArrayList();
    String query = "select pro.*, ca.nombre AS nombre_categoria FROM productos pro, categorias ca WHERE pro.id_categoria = ca.id";
    String query_search_productos = "select pro.*, ca.nombre AS nombre_categoria FROM productos pro inner join categorias ca on pro.id_categoria = ca.id WHERE pro.nombre like '%"+value+"%'";
    
    try{
        conn = cn.Getconnection();
        if(value.equalsIgnoreCase("")){
            pst = conn.prepareStatement(query);
        rs = pst.executeQuery();
    }else{
        pst = conn.prepareStatement(query_search_productos);
        rs = pst.executeQuery();
        }
        while(rs.next()){
        Productos producto = new Productos();
        producto.setId(rs.getInt("id"));
        producto.setCodigo(rs.getInt("codigo"));
        producto.setNombre(rs.getString("nombre"));
        producto.setDescripcion(rs.getString("descripcion"));
        producto.setPrecio_unidad(rs.getDouble("precio_unidad"));
        producto.setCantidad(rs.getInt("cantidad"));
        producto.setNombre_categoria(rs.getString("nombre_categoria"));
        
        }
        
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.toString());
    }
    return list_productos;
}

//modificar producto
public boolean updateProductosQuery(Productos producto){
    String query = "UPDATE productos SET  codigo=?, nombre=?, descripcion=?, precio unitario=?, actualizar=?, id_categoria=?, WHERE id=?";
    Timestamp dateTime = new Timestamp (new Date().getTime());
    
    try{
        conn = cn.Getconnection();
        pst = conn.prepareStatement(query);
        
        pst.setInt(1, producto.getCodigo());
        pst.setString(2, producto.getNombre());
        pst.setString(3, producto.getDescripcion());
        pst.setDouble(4, producto.getPrecio_unidad());
        pst.setTimestamp(5, dateTime);
        
        pst.setInt(6, producto.getId());
        pst.setInt(7, producto.getId_categoria());
        
        pst.execute();
        return true;
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error al modificar el producto"+e);
        return false;
    }
}

//Eliminar Productos
public boolean deleteProductosQuery(int id){
    String query = "DELETE FROM productos WHERE id="+id;
    try{
        conn = cn.Getconnection();
                pst = conn.prepareStatement(query);
                
                pst.execute();
                return true;
                
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "No se puede eliminar el producto si tiene relacion con otra tabla"+e);
        return false;
    }
}

//Buscar Productos
public Productos searchProductos(int id){
    String query = "select pro.*,ca.nombre as nombre_categorias from productos pro inner join categorias ca on pro.id_categoria=ca.id where pro.id = ?";
    Productos producto = new Productos();
    
    try{
        conn = cn.Getconnection();
        pst = conn.prepareStatement(query);
        pst.setInt(1, id);
        rs = pst.executeQuery();
        if(rs.next()){
            producto.setId(rs.getInt("id"));
            producto.setCodigo(rs.getInt("codigo")); 
            producto.setNombre(rs.getString("nombre"));
            producto.setDescripcion("descripcion");
            producto.setPrecio_unidad(rs.getDouble("precio_unidad"));
            producto.setId_categoria(rs.getInt("id_categoria"));
            producto.setNombre_categoria(rs.getString("nombre_categortia"));
            
        }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    return producto;
}

//Buscar Producto por codigo
 public Productos searchCodigo(int codigo){
     String query = "select id, nombre from productos pro where codigo = 1";
     Productos producto = new Productos();
     try{
         conn = cn.Getconnection();
         pst = conn.prepareStatement(query);
         
         pst.setInt(1, codigo);
         rs = pst.executeQuery();
         if(rs.next()){
             producto.setId(rs.getInt("id"));
             producto.setNombre(rs.getString("nombre"));
         }
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, e.getMessage());
     }
     return producto;
 }
 
 //Traer la cantidad de productos
 public Productos searchId(int id){
     String query = "SELECT cantidad from productos pro where id = ?";
     Productos producto = new Productos();
     try{
         conn = cn.Getconnection();
         pst = conn.prepareStatement(query);
         pst.setInt(1, id);
         rs = pst.executeQuery();
         if(rs.next()){
             producto.setCantidad(rs.getInt("cantidad"));
         }
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, e.getMessage());
     }
     return producto;
 }
 
 public boolean updateStockQuery(int cantidad, int id_producto){
     String query = "update productos set cantidad = ? where id =?";
     try{
         conn = cn.Getconnection();
         pst = conn.prepareStatement(query);
         pst.setInt(1, cantidad);
         pst.setInt(2, id_producto);
         pst.execute();
         return true;
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, e.getMessage());
         return false;
     }
 }

}

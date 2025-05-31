
package Dao;

import Models.Connection_MySQL;
import java.sql.Connection;
import Models.Purchase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PurchaseDao {
//Instanciar Conexion
Connection_MySQL cn = new Connection_MySQL();
Connection conn;
PreparedStatement pst;
ResultSet rs; 

//Registro compras
public boolean registerPurchaseQuery(int provedor_id, int empleado_id, double total){
    String query = "INSERT INTO compras (provedor_id,empleado_id,total,crear)VALUES(?,?,?,?)";
    Timestamp dateTime = new Timestamp(new Date().getTime());
    try{
        conn = cn.Getconnection();
        pst = conn.prepareStatement(query);
        pst.setInt(1, provedor_id);
        pst.setInt(2, empleado_id);
        pst.setDouble(3, total);
        pst.setTimestamp(4, dateTime);
        pst.execute();
        return true;
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error al ingresar la compra"+e);
        return false;
    }
}

//Registrar detalles de compra
public boolean registerPurchaseQuery(int id_compra, double precio_compra, int monto_compra, double subtotal_compra, int id_producto){
    String query = "INSERT INTO detalles_de_compra(id_compra,precio_compra,monto_compra,subtotal_compra,fecha_compra,id_compra) VALUES (?,?,?,?,?,?)";
    Timestamp dateTime = new Timestamp(new Date().getTime());
    try{
        conn = cn.Getconnection();
        pst = conn.prepareStatement(query);
        pst.setInt(1, id_compra);
        pst.setDouble(2, precio_compra);
        pst.setInt(3, monto_compra);
        pst.setDouble(4, subtotal_compra);
        pst.setTimestamp(5, dateTime);
        pst.setInt(6, id_producto);
        
        pst.execute();
        return true;
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error al registrar la compra"+e);
        return false;
    }
    
}

//Obtener ID de la copmpra
public int PurchaseId(){
    int id=0;
    String query = "SELECT MAX(id) AS id FROM compras";
    try {
        conn = cn.Getconnection();
        pst = conn.prepareStatement(query);
        rs = pst.executeQuery();
        if(rs.next()){
            id=rs.getInt("id");
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
    return id;
}

//listar todas las compras realizadas
public List listAllPurchaseQuery(){
    List<Purchase>list_Purchases=new ArrayList();
    String query = "select compras.*, nombre as nombre_provedor from compras, provedores co where provedor_id = compras.id order by compras.id asc";
    try{
        conn = cn.Getconnection();
        pst = conn.prepareStatement(query);
        rs = pst.executeQuery();
        
        while(rs.next()){
            Purchase purchase = new Purchase();
            purchase.setId(rs.getInt("id"));
            purchase.setSupplier_nombre_producto(rs.getString("nombre_provedor"));
            purchase.setTotal(rs.getDouble("total"));
            purchase.setCrear(rs.getString("crear"));
            list_Purchases.add(purchase);
            
        }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    return list_Purchases;
}

//Listar compras para imprimir ticket
public  List listPurchaseDetailQuery(int id){
    List<Purchase>list_purchase = new ArrayList();
    String query = "select co.crear, dedeco.precio_compra, dedeco.monto_compra, dedeco.subtotal_compra, pro.nombre as nombre_provedor, pro.nombre as nombre_producto, em.nombre from compras co inner join detalles_de_compra dedeco on co.id = dedeco.compra_id inner join productos pro on  dedeco.producto_id = pro.id inner join provedores pr on co.provedor_id = co.id inner join empleados em on co.empleado_id = em.id where co.id = ?";
    try {
         conn = cn.Getconnection();
         pst = conn.prepareStatement(query);
         pst.setInt(1, id);
         rs = pst.executeQuery();
         
         while(rs.next()){
             Purchase purchase = new Purchase();
             purchase.setNombre_producto(rs.getString("nombre_producto"));
             purchase.setMonto_compra(rs.getInt("monto_compra"));
             purchase.setPrecio_compra(rs.getDouble("precio_compra"));
             purchase.setSubtotal_compra(rs.getDouble("subtotal_compra"));
             purchase.setSupplier_nombre_producto(rs.getString("nombre_provedor"));
             purchase.setCrear(rs.getString("crear"));
             purchase.setPurchase(rs.getString("nombre"));
             
             list_purchase.add(purchase);
         }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    return list_purchase; 
}
}

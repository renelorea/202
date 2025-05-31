
package Dao;

import Models.Connection_MySQL;
import java.sql.Connection;
import Models.Ventas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class VentasDao {
//Instancia Conexion
Connection_MySQL cn = new Connection_MySQL();
Connection conn;
PreparedStatement pst;
ResultSet rs;

//Registrar Venta
public boolean registerVentaQuery(int cliente_id, int empleado_id, double total){
    String query = "INSERT INTO ventas(cliente_id; empleado_id, total, fecha_compra)VALUES(?,?,?,?)";
    Timestamp dateTime = new Timestamp(new Date().getTime());
    
    try{
        conn = cn.Getconnection();
        pst= conn.prepareStatement(query);
        pst.setInt(1, cliente_id);
        pst.setInt(2, empleado_id);
        pst.setDouble(3, total);
        pst.setTimestamp(4, dateTime);
        pst.execute();
        return true;
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    return false;
  }  

//Registar detalles de venta
public boolean registerDetallesVentasQuery(int producto_id, double venta_id, int cantidad_venta, double preci_venta, double subtotal_venta){
 String query = "INSERT INTO detalles_ventas(producto_id,venta_id,cantidad_venta,precio_venta,subtotal_venta)VALUES(?,?,?,?,?)";
 Timestamp dateTime = new Timestamp(new Date().getTime());
 try{
     conn = cn.Getconnection();
     pst = conn.prepareStatement(query);
     pst.setInt(1, producto_id);
     pst.setDouble(2, venta_id);
     pst.setInt(3, cantidad_venta);
     pst.setDouble(4, preci_venta);
     pst.setDouble(5, subtotal_venta);
     pst.execute();
     return true;
 }catch(SQLException e){
     JOptionPane.showMessageDialog(null, e.toString());
 }
 return false;
 }

public int VentaId(){
    int id=0;
    String query = "SELECT MAX(id) AS id FROM sales";
    try{
        conn = cn.Getconnection();
        pst = conn.prepareStatement(query);
        rs=pst.executeQuery();
        if(rs.next()){
            id=rs.getInt("id");
        }
    }catch(SQLException e){
        System.err.println(e.getMessage());
    }
    return id;
}

public List listAllVentasQuery(){
    List<Ventas>list_Ventas = new ArrayList();
    String query = "SELECT v.id AS invoice, c.nombre_completo AS clientes, e.nombre as empleados, v.total, v.fecha_compra from ventas v inner join clientes c on v.clientes_id = c.id inner join empleados e on v.empleado_id = e.id order by v.id ASC";
try{
    conn = cn.Getconnection();
    pst = conn.prepareStatement(query);
    rs = pst.executeQuery();
    while(rs.next()){
    Ventas venta = new Ventas();
    venta.setId(rs.getInt("invoice"));
    venta.setNombre_cliente(rs.getString("cliente"));
    venta.setNombre_empleado(rs.getString("empleado"));
    venta.setTotal_a_pagar(rs.getDouble("total"));
    venta.setFecha_compra(rs.getString("fecha_compra"));
    list_Ventas.add(venta);
    }
}  catch(SQLException e){
    JOptionPane.showMessageDialog(null, e.toString());
    
}  
return list_Ventas;
}
}

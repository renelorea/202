package Dao;

import Models.Connection_MySQL;
import Models.Suplimers;
import Models.Supplier;
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
    // Instancia Conexion
    Connection_MySQL cn = new Connection_MySQL();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    // Registrar Proveedor
    public boolean registerSuplimersQuery(Suplimers suplimer) {
        String query = "INSERT INTO suplimers (name, description, address, telephone, email, city, crear, actualizar) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Timestamp dateTime = new Timestamp(new Date().getTime());

        try {
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

            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar proveedor:" + e);
            return false;
        }
    }

    // Listar Proveedor
    public List<Suplimers> listsuplimersQuery(String value) {
        List<Suplimers> list_Suplimers = new ArrayList<>();
        String query = "SELECT * FROM suplimers";
        String query_search_suplimers = "SELECT * FROM suplimers WHERE name LIKE ?";
        try {
            conn = cn.Getconnection();
            if (value == null || value.trim().isEmpty()) {
                pst = conn.prepareStatement(query);
            } else {
                pst = conn.prepareStatement(query_search_suplimers);
                pst.setString(1, "%" + value + "%");
            }
            rs = pst.executeQuery();
            while (rs.next()) {
                Suplimers suplimers = new Suplimers();
                suplimers.setId(rs.getInt("id"));
                suplimers.setNombre(rs.getString("name"));
                suplimers.setDescripcion(rs.getString("description"));
                suplimers.setDireccion(rs.getString("address"));
                suplimers.setTelefono(rs.getString("telephone"));
                suplimers.setCorreo(rs.getString("email"));
                suplimers.setCiudad(rs.getString("city"));
                list_Suplimers.add(suplimers);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return list_Suplimers;
    }

    // Modificar Proveedor
    public boolean updateSuplimersQuery(Suplimers suplimer) {
        String query = "UPDATE suplimers SET name=?, description=?, address=?, telephone=?, email=?, city=?, actualizar=? WHERE id = ?";

        Timestamp dateTime = new Timestamp(new Date().getTime());
        try {
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

            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar datos del proveedor" + e);
            return false;
        }
    }

    // Eliminar Proveedor
    public boolean deleteSuplimersQuery(int id) {
        String query = "DELETE FROM suplimers WHERE id =" + id;
        try {
            conn = cn.Getconnection();
            pst = conn.prepareStatement(query);
            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar proveedor" + e);
            return false;
        }
    }

    public boolean registerSuplimer(Supplier supplier) {
        String query = "INSERT INTO suplimers (name, address, telephone, email, description, city) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            conn = cn.Getconnection(); // Usar la conexión existente
            pst = conn.prepareStatement(query);
            pst.setString(1, supplier.getName());
            pst.setString(2, supplier.getAddress());
            pst.setString(3, supplier.getTelephone());
            pst.setString(4, supplier.getEmail());
            pst.setString(5, supplier.getDescription());
            pst.setString(6, supplier.getCity());
            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
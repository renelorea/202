package Dao;

import Models.Connection_MySQL;
import java.sql.Connection;
import Models.Employes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class EmployesDao {
    // Instanciar conexión
    Connection_MySQL cn = new Connection_MySQL();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    // Variables para intercambio de datos entre interfaces
    public static int id_user = 0;
    public static String nombre_user = "";
    public static String nombre_usuario_user = "";
    public static String direccion_user = "";
    public static String telefono_user = "";
    public static String correo_user = "";
    public static String rol_user = "";

    // Método Login
    public Employes LoginQuery(String user, String password) throws SQLException {
        String query = "SELECT * FROM empleados WHERE nombre_usuario = ? AND contraseña = ?";
        Employes employes = new Employes();

        try {
            conn = cn.Getconnection();
            pst = conn.prepareStatement(query);

            // Enviar parámetros
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
            JOptionPane.showMessageDialog(null, "Error al obtener el empleado: " + e);
        }
        return employes;
    }

    // Registrar Empleado
    public boolean registerEmployesQuery(Employes employe) {
        String query = "INSERT INTO empleados (id, nombre, nombre_usuario, direccion, telefono, correo, contraseña, rol) VALUES (?,?,?,?,?,?,?,?)";

        try {
            conn = cn.Getconnection();
            pst = conn.prepareStatement(query);

            pst.setInt(1, employe.getId());
            pst.setString(2, employe.getNombre());
            pst.setString(3, employe.getNombre_usuario());
            pst.setString(4, employe.getDireccion());
            pst.setString(5, employe.getTelefono());
            pst.setString(6, employe.getCorreo());
            pst.setString(7, employe.getContraseña());
            pst.setString(8, employe.getRol());

            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar empleado: " + e);
            return false;
        }
    }

    // Listar Empleados
    public List<Employes> listEmployesQuery(String value) {
        List<Employes> list_employes = new ArrayList<>();
        String query = "SELECT * FROM empleados ORDER BY rol ASC";
        String query_search_employe = "SELECT * FROM empleados WHERE id LIKE ?";

        try {
            conn = cn.Getconnection();
            if (value.isEmpty()) {
                pst = conn.prepareStatement(query);
            } else {
                pst = conn.prepareStatement(query_search_employe);
                pst.setString(1, value + "%");
            }
            rs = pst.executeQuery();

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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return list_employes;
    }

    // Modificar Empleado
    public boolean updateEmployeQuery(Employes employe) {
        String query = "UPDATE empleados SET nombre = ?, nombre_usuario = ?, direccion = ?, telefono = ?, correo = ?, rol = ? WHERE id = ?";

        try {
            conn = cn.Getconnection();
            pst = conn.prepareStatement(query);

            pst.setString(1, employe.getNombre());
            pst.setString(2, employe.getNombre_usuario());
            pst.setString(3, employe.getDireccion());
            pst.setString(4, employe.getTelefono());
            pst.setString(5, employe.getCorreo());
            pst.setString(6, employe.getRol());
            pst.setInt(7, employe.getId());

            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar datos de empleado: " + e);
            return false;
        }
    }

    // Eliminar Empleado
    public boolean deleteEmployeQuery(int id) {
        String query = "DELETE FROM empleados WHERE id = ?";

        try {
            conn = cn.Getconnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, id);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede eliminar un empleado que tenga relación con otra tabla: " + e);
            return false;
        }
    }

    // Cambiar contraseña
    public boolean updateEmployePassword(Employes employe) {
        String query = "UPDATE empleados SET contraseña = ? WHERE nombre_usuario = ?";

        try {
            conn = cn.Getconnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, employe.getContraseña());
            pst.setString(2, nombre_usuario_user);
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al querer modificar la contraseña: " + e);
            return false;
        }
    }
}

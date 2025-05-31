/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lospekes.persistances.dao;

import com.lospekes.persistances.coneccion.ConeccionBaseDatos;
import com.lospekes.persistances.model.Productos;
import com.lospekes.persistances.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author armando
 */
public class ProductosDao {
   
    CategoriaDao cd=new CategoriaDao();
    ProveedorDao pd=new ProveedorDao();
    
    public int guardarProductos (Productos p){
        boolean flag=false;
        int res = 0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement ("INSERT INTO Productos (nombre,caducidad,precio,codigo,id_categoria,id_provedor) VALUES (?,?,?,?,?,?)");
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getCaducidad());
            ps.setDouble(3, p.getPrecio());
            ps.setString(4, p.getCodigo());
            ps.setInt(5, 1);
            ps.setInt(6, 1);
            res = ps.executeUpdate();
            conn.close();
            return res;
        } catch (Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return res;
    }
 
    public List<Productos> findAll(){
        List<Productos> listaProductos= new ArrayList<Productos>();
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            Statement s = conn.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM Productos ");
            while(res.next()){
                Productos p=new Productos();
                p.setId(res.getInt(1));
                p.setNombre(res.getString(2));
                p.setCaducidad(res.getString(3));
                p.setPrecio(res.getDouble(4));
                p.setCodigo(res.getString(5));
                p.setCategoria(cd.findById(res.getInt(6)));
                p.setProveedor(pd.findById(res.getInt(7)));
                listaProductos.add(p);
            }
            conn.close();
            return listaProductos;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return null;
        }
        
    
    
    public List<Productos> findByNombre(String productos){
        List<Productos> listaProductos= new ArrayList<Productos>();
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement s = conn.prepareStatement("SELECT * fROM Productos WHERE nombre LIKE ?");
            s.setString(1, productos);
            ResultSet res = s.executeQuery();
            while(res.next()){
                Productos p=new Productos();
                p.setId(res.getInt(1));
                p.setNombre(res.getString(2));
                p.setCaducidad(res.getString(3));
                p.setPrecio(res.getDouble(4));
                p.setCodigo(res.getString(5));
                p.setCategoria(cd.findById(res.getInt(6)));
                p.setProveedor(pd.findById(res.getInt(7)));
                listaProductos.add(p);
            }
            conn.close();
            return listaProductos;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return null;
    }
    
    public int deleteProductos(Productos p){
        int res=0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Productos WHER");
            ps.setInt(1, p.getId());
            res = ps.executeUpdate();
            conn.close();
            return res;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return res;
    }
    
    public int updateProductos(Productos p){
        int res=0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement("UPDATE Productos SET nombres,caducidad,precio,codigo WHERE id=?");
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getCaducidad());
            ps.setDouble(3, p.getPrecio());
            ps.setString(4, p.getCodigo());
            res = ps.executeUpdate();
            conn.close();
            return res;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return res;
    }
    
}

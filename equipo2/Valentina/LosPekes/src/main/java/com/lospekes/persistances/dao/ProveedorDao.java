/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lospekes.persistances.dao;

import com.lospekes.persistances.coneccion.ConeccionBaseDatos;
import com.lospekes.persistances.model.Perfil;
import com.lospekes.persistances.model.Productos;
import com.lospekes.persistances.model.Proveedor;
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
public class ProveedorDao {
    
    public Proveedor findById(int id){
        Proveedor p= new Proveedor();
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement s = conn.prepareStatement("SELECT * fROM Proveedor WHERE id= ?");
            s.setInt(1, id);
            ResultSet res = s.executeQuery();
            while(res.next()){
                p.setId(res.getInt(1));
                p.setNombre(res.getString(2));
                
            }
            conn.close();
            return p;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return null;
      
    }
    
    public int guardarProveedor (Proveedor p){
        boolean flag=false;
        int res = 0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement ("INSERT INTO Proveedor (nombre) VALUES (?)");
            ps.setString(1, p.getNombre());
            res = ps.executeUpdate();
            conn.close();
            return res;
        } catch (Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return res;
    }
    
    public int deleteProveedor(Proveedor p){
        int res=0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Proveedor WHER");
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
    
    public List<Proveedor> findAll(){
        List<Proveedor> listaProveedor= new ArrayList<Proveedor>();
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            Statement s = conn.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM Proveedor ");
            while(res.next()){
                Proveedor p=new Proveedor();
                p.setId(res.getInt(1));
                p.setNombre(res.getString(2));
                listaProveedor.add(p);
            }
            conn.close();
            return listaProveedor;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return null;
        }
        
    
    
    public List<Proveedor> findByNombre(String proveedor){
        List<Proveedor> listaProveedor= new ArrayList<Proveedor>();
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement s = conn.prepareStatement("SELECT * fROM Proveedor WHERE nombre LIKE ?");
            s.setString(1, proveedor);
            ResultSet res = s.executeQuery();
            while(res.next()){
                Proveedor p=new Proveedor();
                p.setId(res.getInt(1));
                p.setNombre(res.getString(2));
                listaProveedor.add(p);
            }
            conn.close();
            return listaProveedor;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return null;
    }

    public int updateProveedor(Proveedor p){
        int res=0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement("UPDATE Proveedor SET nombre=? WHERE id=?");
            ps.setString(1, p.getNombre());
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

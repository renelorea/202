/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lospekes.persistances.dao;

import com.lospekes.persistances.coneccion.ConeccionBaseDatos;
import com.lospekes.persistances.model.Categoria;
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
public class CategoriaDao {
    
    public Categoria findById(int id){
        Categoria c= new Categoria();
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement s = conn.prepareStatement("SELECT * fROM Categoria WHERE id= ?");
            s.setInt(1, id);
            ResultSet res = s.executeQuery();
            while(res.next()){
                c.setId(res.getInt(1));
                c.setNombre(res.getString(2));
                
            }
            conn.close();
            return c;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return null;
      
    }
    
    public int guardarCategoria (Categoria c){
        boolean flag=false;
        int res = 0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement ("INSERT INTO Categoria (nombre) VALUES (?)");
            ps.setString(1, c.getNombre());
            res = ps.executeUpdate();
            conn.close();
            return res;
        } catch (Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return res;
    }
    
    public int deleteCategoria(Categoria c){
        int res=0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Categoria WHER");
            ps.setInt(1, c.getId());
            res = ps.executeUpdate();
            conn.close();
            return res;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return res;
    }

    public List<Categoria> findAll(){
        List<Categoria> listaCategoria= new ArrayList<Categoria>();
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            Statement s = conn.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM Categoria ");
            while(res.next()){
                Categoria c=new Categoria();
                c.setId(res.getInt(1));
                c.setNombre(res.getString(2));
                listaCategoria.add(c);
            }
            conn.close();
            return listaCategoria;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return null;
        }
        
    
    
    public List<Categoria> findByNombre(String categoria){
        List<Categoria> listaCategoria= new ArrayList<Categoria>();
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement s = conn.prepareStatement("SELECT * fROM Categoria WHERE nombre LIKE ?");
            s.setString(1, categoria);
            ResultSet res = s.executeQuery();
            while(res.next()){
                Categoria c=new Categoria();
                c.setId(res.getInt(1));
                c.setNombre(res.getString(2));
                listaCategoria.add(c);
            }
            conn.close();
            return listaCategoria;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return null;
    }
    public int updateCategoria(Categoria c){
        int res=0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement("UPDATE Categoria SET nombre=? WHERE id=?");
            ps.setString(1, c.getNombre());
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

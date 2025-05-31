/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lospekes.persistances.dao;

import com.lospekes.persistances.coneccion.ConeccionBaseDatos;
import com.lospekes.persistances.model.Categoria;
import com.lospekes.persistances.model.Perfil;
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
public class PerfilDao {
    
    public Perfil findById(int id){
        Perfil p= new Perfil();
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement s = conn.prepareStatement("SELECT * fROM Perfil WHERE id= ?");
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
    
    public int guardarPerfil(Perfil p){
        boolean flag=false;
        int res = 0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement ("INSERT INTO Perfil (nombre) VALUES (?)");
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
    
    public int deletePerfil(Perfil p){
        int res=0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Perfil WHER");
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
    
    public List<Perfil> findAll(){
        List<Perfil> listaPerfil= new ArrayList<Perfil>();
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            Statement s = conn.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM Perfil ");
            while(res.next()){
                Perfil p=new Perfil();
                p.setId(res.getInt(1));
                p.setNombre(res.getString(2));
                listaPerfil.add(p);
            }
            conn.close();
            return listaPerfil;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return null;
        }
        
    
    
    public List<Perfil> findByNombre(String perfil){
        List<Perfil> listaPerfil= new ArrayList<Perfil>();
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement s = conn.prepareStatement("SELECT * fROM Perfil WHERE nombre LIKE ?");
            s.setString(1, perfil);
            ResultSet res = s.executeQuery();
            while(res.next()){
                Perfil p=new Perfil();
                p.setId(res.getInt(1));
                p.setNombre(res.getString(2));
                listaPerfil.add(p);
            }
            conn.close();
            return listaPerfil;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return null;
    }
    public int updatePerfil(Perfil p){
        int res=0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement("UPDATE Perfil SET nombre=? WHERE id=?");
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

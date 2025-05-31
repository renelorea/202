/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lospekes.persistances.dao;

import java.sql.Connection;
import com.lospekes.persistances.coneccion.ConeccionBaseDatos;
import com.lospekes.persistances.model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author armando
 */
public class UsuarioDao {
    
    PerfilDao pd=new PerfilDao();
    
    public boolean validaUsuario (String usuario, String password){
        boolean flag=false;
        try{
            Connection conn = ConeccionBaseDatos.connectdatabase();
            Statement stmt = conn.createStatement();
            ResultSet rs;
            
            rs = stmt.executeQuery("SELECT * FROM Usuarios WHERE usuario='"+usuario+"'and password='"+password+"'");
            while ( rs.next() ){
                flag=true;
            }
            
            conn.close();
            return flag;
                   
            
        }catch(Exception e){
            System.err.println("Obtuvo una ecepcion");
            System.err.println(e.getMessage());
        }
        return flag;
    }
    public int guardarUsuario (Usuario usuario){
        boolean flag=false;
        int res = 0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement ("INSERT INTO Usuarios (usuario,password,id_perfil,nombre,aPaterno,aMaterno) VALUES (?,?,?,?,?,?)");
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getPassword());
            ps.setInt(3, 1);
            ps.setString(4, usuario.getNombre());
            ps.setString(5, usuario.getaPaterno());
            ps.setString(6, usuario.getaMaterno());
            res = ps.executeUpdate();
            conn.close();
            return res;
        } catch (Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return res;
    }
public int deleteUsuario(Usuario u){
        int res=0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Usuarios WHER");
            ps.setInt(1, u.getId());
            res = ps.executeUpdate();
            conn.close();
            return res;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return res;
    }
    
    public int updateUsuario(Usuario u){
        int res=0;
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement ps = conn.prepareStatement("UPDATE Usuarios SET usuario=?, password=?, nombre=?, aPaterno=?, aMaterno=? WHERE id=?");
            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getPassword());
            ps.setString(3, u.getNombre());
            ps.setString(4, u.getaPaterno());
            ps.setString(5, u.getaMaterno());
            ps.setInt(6, u.getId());
            res = ps.executeUpdate();
            conn.close();
            return res;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return res;
    }
        
        public List<Usuario> findAll(){
        List<Usuario> listaUsuario= new ArrayList<Usuario>();
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            Statement s = conn.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM Usuarios ");
            while(res.next()){
                Usuario u=new Usuario();
                u.setId(res.getInt(1));
                u.setUsuario(res.getString(2));
                u.setPassword(res.getString(3));
                u.setPerfil(pd.findById(res.getInt(4)));
                u.setNombre(res.getString(5));
                u.setaMaterno(res.getString(6));
                u.setaPaterno(res.getString(7));
                listaUsuario.add(u);
            }
            conn.close();
            return listaUsuario;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return null;
        }
        
    
    
    public List<Usuario> findByNombre(String usuario){
        List<Usuario> listaUsuario= new ArrayList<Usuario>();
        try {
            Connection conn = ConeccionBaseDatos.connectdatabase();
            PreparedStatement s = conn.prepareStatement("SELECT * fROM Usuarios WHERE nombre LIKE ?");
            s.setString(1, usuario);
            ResultSet res = s.executeQuery();
            while(res.next()){
                Usuario u=new Usuario();
                u.setId(res.getInt(1));
                u.setUsuario(res.getString(2));
                u.setPassword(res.getString(3));
                //u.setPerfil(res.getInt(4));
                listaUsuario.add(u);
            }
            conn.close();
            return listaUsuario;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return null;
      
    }

    
}


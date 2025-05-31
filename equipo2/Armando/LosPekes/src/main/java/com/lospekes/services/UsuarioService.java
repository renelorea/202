/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lospekes.services;

import com.lospekes.persistances.dao.UsuarioDao;
import com.lospekes.persistances.model.Usuario;
import java.util.List;

/**
 *
 * @author armando
 */
public class UsuarioService {
    
    UsuarioDao usuDao=new UsuarioDao();
    
    public boolean validaUsuario(String Usuario,String password){
        
        return usuDao.validaUsuario(Usuario, password);
        
    }
    public int GuardarUsuarios (String usuario, String password, int Perfil, String nombre, String aPaterno, String aMaterno){
        Usuario u=new Usuario();
        u.setUsuario(usuario);
        u.setPassword(password);
        u.setNombre(nombre);
        u.setaPaterno(aPaterno);
        u.setaMaterno(aMaterno);
        int res = usuDao.guardarUsuario(u);
        return res;   
    }
    public int deleteUsuario(int id){
        Usuario u=new Usuario();
        u.setId(id);
        int res=usuDao.deleteUsuario(u);
        return res;
    }
    
    public int updateUsuario(int id,String password,String usuario, String nombre, String aPaterno, String aMaterno){
        Usuario u=new Usuario();
        u.setId(id);
        u.setPassword(password);
        u.setUsuario(usuario);
        //u.setPerfil(Perfil);
        u.setNombre(nombre);
        u.setaPaterno(aPaterno);
        u.setaMaterno(aMaterno);
        int res=usuDao.updateUsuario(u);
        return res;
    }
    public List<Usuario> getAllCombo(){
        List<Usuario> lista = usuDao.findAll();
        return lista;
    }
    
    public List<Usuario> getUsuarioByNombre(String usuario){
        List<Usuario> lista = usuDao.findByNombre(usuario);
        return lista;
    }

}

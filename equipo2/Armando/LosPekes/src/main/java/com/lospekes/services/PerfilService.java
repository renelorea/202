/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lospekes.services;

import com.lospekes.persistances.dao.PerfilDao;
import com.lospekes.persistances.model.Categoria;
import com.lospekes.persistances.model.Perfil;
import java.util.List;

/**
 *
 * @author armando
 */
public class PerfilService {
    
    PerfilDao pd=new PerfilDao();
    
    public int guardarPerfil (String nombre){
        Perfil p=new Perfil();
        p.setNombre(nombre);
        int res = pd.guardarPerfil(p);
        return res;   
    }
    
    public int deletePerfil(int id){
        Perfil p=new Perfil();
        p.setId(id);
        int res=pd.deletePerfil(p);
        return res;
    }
    
    public List<Perfil> getAllCombo(){
        List<Perfil> lista = pd.findAll();
        return lista;
    }
    
    public List<Perfil> getUsuarioByNombre(String perfil){
        List<Perfil> lista = pd.findByNombre(perfil);
        return lista;
    }
    public int updatePerfil(int id,String nombre){
        Perfil p=new Perfil();
        p.setId(id);
        p.setNombre(nombre);
        int res=pd.updatePerfil(p);
        return res;
    }
    
}

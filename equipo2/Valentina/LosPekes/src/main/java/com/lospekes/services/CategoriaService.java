/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lospekes.services;

import com.lospekes.persistances.dao.CategoriaDao;
import com.lospekes.persistances.model.Categoria;
import com.lospekes.persistances.model.Productos;
import com.lospekes.persistances.model.Proveedor;
import com.lospekes.persistances.model.Usuario;
import java.util.List;

/**
 *
 * @author armando
 */
public class CategoriaService {
    
    CategoriaDao cd=new CategoriaDao();
    
    public int guardarCategoria (String nombre){
        Categoria c=new Categoria();
        c.setNombre(nombre);
        int res = cd.guardarCategoria(c);
        return res;   
    }
    
    public int deleteCategoria(int id){
        Categoria c=new Categoria();
        c.setId(id);
        int res=cd.deleteCategoria(c);
        return res;
    }
    
    public List<Categoria> getAllCombo(){
        List<Categoria> lista = cd.findAll();
        return lista;
    }
    
    public List<Categoria> getUsuarioByNombre(String categoria){
        List<Categoria> lista = cd.findByNombre(categoria);
        return lista;
    }
    
    public int updateCategoria(int id,String nombre){
        Categoria c=new Categoria();
        c.setId(id);
        c.setNombre(nombre);
        int res=cd.updateCategoria(c);
        return res;
    }
    
}

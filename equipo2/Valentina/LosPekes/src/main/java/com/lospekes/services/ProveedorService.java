/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lospekes.services;

import com.lospekes.persistances.dao.ProveedorDao;
import com.lospekes.persistances.model.Productos;
import com.lospekes.persistances.model.Proveedor;
import com.lospekes.persistances.model.Usuario;
import java.util.List;


/**
 *
 * @author armando
 */
public class ProveedorService {
    
    ProveedorDao pd=new ProveedorDao();
    
    public int guardarProveedor (String nombre){
        Proveedor p=new Proveedor();
        p.setNombre(nombre);
        int res = pd.guardarProveedor(p);
        return res;   
    }
    
    public int deleteProveedor(int id){
        Proveedor p=new Proveedor();
        p.setId(id);
        int res=pd.deleteProveedor(p);
        return res;
    }
    
    public List<Proveedor> getAllCombo(){
        List<Proveedor> lista = pd.findAll();
        return lista;
    }
    
    public List<Proveedor> getUsuarioByNombre(String proveedor){
        List<Proveedor> lista = pd.findByNombre(proveedor);
        return lista;
    }
    
    public int updateProveedor(int id,String nombre){
        Proveedor p=new Proveedor();
        p.setId(id);
        p.setNombre(nombre);
        int res=pd.updateProveedor(p);
        return res;
    }
    
}

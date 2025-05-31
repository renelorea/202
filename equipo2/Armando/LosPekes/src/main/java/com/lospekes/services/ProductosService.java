/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lospekes.services;

import com.lospekes.persistances.dao.ProductosDao;
import com.lospekes.persistances.model.Categoria;
import com.lospekes.persistances.model.Productos;
import com.lospekes.persistances.model.Usuario;
import java.util.List;

/**
 *
 * @author armando
 */
public class ProductosService {
    
    ProductosDao pd=new ProductosDao();
    
    public int GuardarProductos (String nombre, String caducidad, double precio, String codigo, int id_categoria, int id_proveedor ){
        Productos p=new Productos();
        p.setNombre(nombre);
        p.setCaducidad(caducidad);
        p.setPrecio(precio);
        p.setCodigo(codigo);
        int res = pd.guardarProductos(p);
        return res;   
    }
    
    public List<Productos> getAllCombo(){
        List<Productos> lista = pd.findAll();
        return lista;
    }
    
    public List<Productos> getUsuarioByNombre(String productos){
        List<Productos> lista = pd.findByNombre(productos);
        return lista;
    }
    
    public int deleteProductos(int id){
        Productos p=new Productos();
        p.setId(id);
        int res=pd.deleteProductos(p);
        return res;
    }
    
    public int updateProductos(int id,String nombre, String caducidad, double precio, String codigo ){
        Productos p=new Productos();
        p.setId(id);
        p.setNombre(nombre);
        p.setCaducidad(caducidad);
        p.setPrecio(precio);
        p.setCodigo(codigo);
        int res=pd.updateProductos(p);
        return res;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static Dao.EmployesDao.rol_user;
import Dao.ProductosDao;
import Models.DynamicComboBox;
import Models.Productos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import views.SystemViews;

public class ProductosController implements ActionListener, MouseListener, KeyListener {

    private Productos product;
    private ProductosDao productsDao;
    private SystemViews views;
    String rol = rol_user;
    DefaultTableModel model = new DefaultTableModel();

    public ProductosController(Productos product, ProductosDao productsDao, SystemViews views) {
        this.product = product;
        this.productsDao = productsDao;
        this.views = views;
        //Registrar
        this.views.btb_register_Productos.addActionListener(this);
     }

    @Override
    public void actionPerformed(ActionEvent e){
       if(e.getSource() == views.btb_register_Productos){
           if(views.txt_Productos_code.getText().equals("")
                   || views.txt_Productos_name.getText().equals("")
                   || views.txt_Productos_description.getText().equals("")
                   || views.txt_Productos_unit_price.getText().equals("")
                   || views.cmb_Product_category.getSelectedItem().toString().equals("")){
               JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
           }else{
               product.setCodigo(Integer.parseInt(views.txt_Productos_code.getText()));
               product.setNombre(views.txt_Productos_name .getText().trim());
               product.setDescripcion(views.txt_Productos_description.getText().trim());
               product.setPrecio_unidad(Double.parseDouble(views.txt_Productos_unit_price.getText()));
               DynamicComboBox category_id = (DynamicComboBox) views.cmb_Product_category.getSelectedItem();
               product.setId_categoria(category_id.getId());
               if(productsDao.registerProductosQuery(product)){
                   JOptionPane.showMessageDialog(null, "Producto registrado con éxito");
               }else{
                   JOptionPane.showMessageDialog(null,"Error al registrar producto");
               }
           }
       
       }
    }
    
    public void listAllProducts(){
        if(rol.equals("Administrador")|| rol.equals)
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}


package controller;

import javax.swing.JOptionPane;
import Dao.EmployesDao;
import static Dao.EmployesDao.id_user;
import static Dao.EmployesDao.rol_user;
import Models.Employes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import views.SystemViews;


public class EmployesControllers implements ActionListener, MouseListener, KeyListener{
       private Employes employe;
       private EmployesDao employeDao;
       private SystemViews views;
       String rol = rol_user;
       DefaultTableModel model = new DefaultTableModel();

    public EmployesControllers(Employes employe, EmployesDao employeDao, SystemViews views) {
        this.employe = employe;
        this.employeDao = employeDao;
        this.views = views;
        this.views.btn_register_Employes.addActionListener(this);
        this.views.Employes_table.addMouseListener(this);
        this.views.txt_search_Employes.addKeyListener(this);
        this.views.btn_update_Employes.addActionListener(this);
        this.views.btn_delete_Employed.addActionListener(this);
        this.views.btn_cancel_Employed.addActionListener(this);
    }
       
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== views.btn_register_Employes){
           if(views.txt_Employes_ID.getText().equals("")
                   || views.txt_Employes_fullname.getText().equals("")
                   || views.txt_Employes_username.getText().equals("")
                   ||views.txt_employes_address.getText().equals("")
                   ||views.txt_Employes_telephone.getText().equals("")
                   || views.txt_Employes_email.getText().equals("")
                   ||views.cmb_rol.getSelectedItem().toString().equals("")
                   || String.valueOf(views.txt_Employes_password.getPassword()).equals("")){
           JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
       }else{
               employe.setId(Integer.parseInt(views.txt_Employes_ID.getText().trim()));
               employe.setNombre(views.txt_Employes_fullname.getText().trim());
               employe.setNombre_usuario(views.txt_Employes_username.getText().trim());
               employe.setDireccion(views.txt_employes_address.getText().trim());
               employe.setTelefono(views.txt_Employes_telephone.getText().trim());
               employe.setCorreo(views.txt_Employes_email.getText().trim());
               employe.setContraseña(String.valueOf(views.txt_Employes_password.getText()));
               employe.setRol(views.cmb_rol.getSelectedItem().toString());
               
               if(employeDao.registerEmployesQuery(employe)){
                   CleanTable();
                   JOptionPane.showMessageDialog(null, "Empleado registrado con exito");
                   cleanFields();
                   listAllEmployes();
               }else{
                   JOptionPane.showMessageDialog(null,"Ocurrio un error al registrar empleado");
               }
           }
       }else if (e.getSource()== views.btn_update_Employes){
           if(views.txt_Employes_ID.equals("")){
               JOptionPane.showMessageDialog(null, "seleciona una fila de la tabla para continuar");
           }else{
               employe.setId(Integer.parseInt(views.txt_Employes_ID.getText().trim()));
               employe.setNombre(views.txt_Employes_fullname.getText().trim());
               employe.setNombre_usuario(views.txt_Employes_username.getText().trim());
               employe.setDireccion(views.txt_employes_address.getText().trim());
               employe.setTelefono(views.txt_Employes_telephone.getText().trim());
               employe.setCorreo(views.txt_Employes_email.getText().trim());
               employe.setContraseña(String.valueOf(views.txt_Employes_password.getPassword()));
               employe.setRol(views.cmb_rol.getSelectedItem().toString());
               if(employeDao.updateEmployeQuery(employe)){
                   CleanTable();
                   listAllEmployes();
                   views.btn_register_Employes.setEnabled(true);
                   JOptionPane.showMessageDialog(null, "Datos modificados exitosamente");
                   cleanFields();
               }else{
                   JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar empleado");
               }
               
          }
       }else if (e.getSource()== views.btn_delete_Employed){
           
                 
                
                  int row = views.Employes_table.getSelectedRow();
                   if(row == -1){
                     JOptionPane.showMessageDialog(null, "Debes selecionar un empleado para eliminarlo ");
                   }else if(views.Employes_table.getValueAt(row, 0 ).equals(id_user)){
                   JOptionPane.showMessageDialog(null, "no se puede eliminar el usuario autenticado");
                   }else{
                     
                   int respuesta = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar el registro");
                       System.out.println("OPTION:::"+ respuesta);
                       System.out.println("REGISTRO SELECCIONADO  :" + (  model.getValueAt(row, 0))   );  
                       System.out.println("row"+row);
                       int registro = (int) model.getValueAt(row, 0);
                       System.out.println("REGISTRO SELECCIONADO  :" + registro  );  
                                  if (respuesta==0 && employeDao.deleteEmployeQuery(registro)!=false){
               CleanTable();
               cleanFields();
               views.btn_register_Employes.setEnabled(true);
               views.txt_Employes_password.setEnabled(true);
               listAllEmployes();
               JOptionPane.showMessageDialog(null, "El usuario fue eliminado con exito ");
           }else if (e.getSource()== views.btn_cancel_Employed){
              cleanFields();
              views.btn_register_Employes.setEnabled(true);
              views.txt_Employes_password.setEnabled(true);
              views.txt_Employes_ID.setEnabled(true);
              views.txt_Employes_ID.setEditable(true);
           }
                   }//AQUI TERMINA ELSE
              }  else{
           //int id = Integer.parseInt(views.Employes_table.getValueAt(row, 0).toString());
           
           JOptionPane.showMessageDialog(null, "Opción no identificada");
//           int question = 1;
//                   JOptionPane.showMessageDialog(null, "En realidad quieres eliniar este empleado");
//           if (question==0 && employeDao.deleteEmployeQuery(id)!=false){
//               CleanTable();
//               cleanFields();
//               views.btn_register_Employes.setEnabled(true);
//               views.txt_Employes_password.setEnabled(true);
//               listAllEmployes();
//               JOptionPane.showMessageDialog(null, "El usuario fue eliminado con exito ");
//           }else if (e.getSource()== views.btn_cancel_Employed){
//              cleanFields();
//              views.btn_register_Employes.setEnabled(true);
//              views.txt_Employes_password.setEnabled(true);
//              views.txt_Employes_ID.setEnabled(true);
//              views.txt_Employes_ID.setEditable(true);
//           }
       }    
    }
public void listAllEmployes(){
    
    System.out.println("ROL::" + rol);
    
    if(rol.equals("ADMINISTRADOR")){
        List<Employes>list=employeDao.listEmplyesQuery(views.txt_search_Employes.getText());
        model = (DefaultTableModel) views.Employes_table.getModel();
        Object[]row=new Object[7];
        for(int i =0;i<list.size();i++){
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getNombre();
            row[2]=list.get(i).getNombre_usuario();
            row[3]=list.get(i).getDireccion();
            row[4]=list.get(i).getTelefono();
            row[5]=list.get(i).getCorreo();
            row[6]=list.get(i).getRol();
            model.addRow(row);
        }
    }
}
//Limpiar campos
public void cleanFields(){
    views.txt_Employes_ID.setText("");
    views.txt_Employes_ID.setEditable(true);
    views.txt_Employes_fullname.setText("");
    views.txt_Employes_username.setText("");
    views.txt_employes_address.setText("");
    views.txt_Employes_telephone.setText("");
    views.txt_Employes_email.setText("");
    views.txt_Employes_password.setText("");
    views.txt_Employes_password.setEditable(true);
    views.cmb_rol.setSelectedItem(0);
}
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==views.Employes_table){
    int row = views.Employes_table.rowAtPoint(e.getPoint());
    views.txt_Employes_ID.setText(views.Employes_table.getValueAt(row, 0).toString());
    views.txt_Employes_fullname.setText(views.Employes_table.getValueAt(row, 1).toString());
    views.txt_Employes_username.setText(views.Employes_table.getValueAt(row, 2).toString());
    views.txt_employes_address.setText(views.Employes_table.getValueAt(row, 3).toString());
    views.txt_Employes_telephone.setText(views.Employes_table.getValueAt(row, 4).toString());
    views.txt_Employes_email.setText(views.Employes_table.getValueAt(row, 5).toString());
    views.cmb_rol.setSelectedItem(views.Employes_table.getValueAt(row, 6).toString());
    
    views.txt_Employes_ID.setEditable(false);
    views.txt_Employes_password.setEnabled(false);
    views.btn_register_Employes.setEnabled(false);
        }
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
      if (e.getSource()==views.txt_search_Employes){
          CleanTable();
         listAllEmployes();
      }
    }
    public void CleanTable(){
         for (int i=0; i<model.getRowCount(); i++){
          model.removeRow(i);
          i=i-1;
         } 
    }
}

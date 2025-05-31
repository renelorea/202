

package controller;

import Dao.EmployesDao;
import Models.Employes;
import java.awt.event.ActionEvent;
import views.Loginviews;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import views.SystemViews;

public class LoginControllers implements ActionListener{
    
    //Encapsular variables
    private Employes employe;
    private EmployesDao employes_dao;
    private Loginviews login_view;

    public LoginControllers(Employes employe, EmployesDao employes_dao, Loginviews login_view) {
        this.employe = employe;
        this.employes_dao = employes_dao;
        this.login_view = login_view;
        this.login_view.btn_ent.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Obteniendo datos de la vista
        String user = login_view.txt_UserName.getText().trim();
        String pass = String.valueOf(login_view.txt_Contraseña.getPassword());
        if(e.getSource()== login_view.btn_ent){
            if(!user.equals("")||!pass.equals("")){
                 try {
                    employe = employes_dao.LoginQuery(user, pass);
                } catch (SQLException ex) {
                    Logger.getLogger(LoginControllers.class.getName()).log(Level.SEVERE, null, ex);
                }
                        if(employe.getNombre_usuario()!=null){
                            if(employe.getRol().equals("Administrador"));
                            SystemViews admin =  new SystemViews();
                            admin.setVisible(true);
                        }else{
                            SystemViews aux = new SystemViews();
                            aux.setVisible(true);
                        }
                        this.login_view.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o password incorrecto");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Los campos o uno de los campos esta vacio");
        }
  }
}

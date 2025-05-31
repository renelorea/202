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

public class EmployesControllers implements ActionListener, MouseListener, KeyListener {
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
        if (e.getSource() == views.btn_register_Employes) {
            if (views.txt_Employes_ID.getText().isEmpty() ||
                views.txt_Employes_fullname.getText().isEmpty() ||
                views.txt_Employes_username.getText().isEmpty() ||
                views.txt_employes_address.getText().isEmpty() ||
                views.txt_Employes_telephone.getText().isEmpty() ||
                views.txt_Employes_email.getText().isEmpty() ||
                views.cmb_rol.getSelectedItem() == null ||
                String.valueOf(views.txt_Employes_password.getPassword()).isEmpty()) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                employe.setId(Integer.parseInt(views.txt_Employes_ID.getText().trim()));
                employe.setNombre(views.txt_Employes_fullname.getText().trim());
                employe.setNombre_usuario(views.txt_Employes_username.getText().trim());
                employe.setDireccion(views.txt_employes_address.getText().trim());
                employe.setTelefono(views.txt_Employes_telephone.getText().trim());
                employe.setCorreo(views.txt_Employes_email.getText().trim());
                employe.setContraseña(String.valueOf(views.txt_Employes_password.getPassword()));
                employe.setRol(views.cmb_rol.getSelectedItem().toString());

                if (employeDao.registerEmployesQuery(employe)) {
                    CleanTable();
                    JOptionPane.showMessageDialog(null, "Empleado registrado con éxito");
                    cleanFields();
                    listAllEmployes();
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrió un error al registrar el empleado");
                }
            }

        } else if (e.getSource() == views.btn_update_Employes) {
            if (views.txt_Employes_ID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila de la tabla para continuar");
            } else {
                employe.setId(Integer.parseInt(views.txt_Employes_ID.getText().trim()));
                employe.setNombre(views.txt_Employes_fullname.getText().trim());
                employe.setNombre_usuario(views.txt_Employes_username.getText().trim());
                employe.setDireccion(views.txt_employes_address.getText().trim());
                employe.setTelefono(views.txt_Employes_telephone.getText().trim());
                employe.setCorreo(views.txt_Employes_email.getText().trim());
                employe.setContraseña(String.valueOf(views.txt_Employes_password.getPassword()));
                employe.setRol(views.cmb_rol.getSelectedItem().toString());

                if (employeDao.updateEmployeQuery(employe)) {
                    CleanTable();
                    listAllEmployes();
                    views.btn_register_Employes.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Datos modificados exitosamente");
                    cleanFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar el empleado");
                }
            }

        } else if (e.getSource() == views.btn_delete_Employed) {
            int row = views.Employes_table.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar un empleado para eliminarlo.");
            } else if (views.Employes_table.getValueAt(row, 0).toString().equals(String.valueOf(id_user))) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar el usuario autenticado.");
            } else {
                int id = Integer.parseInt(views.Employes_table.getValueAt(row, 0).toString());
                int confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar este empleado?",
                        "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    if (employeDao.deleteEmployeQuery(id)) {
                        CleanTable();
                        cleanFields();
                        views.btn_register_Employes.setEnabled(true);
                        views.txt_Employes_password.setEnabled(true);
                        listAllEmployes();
                        JOptionPane.showMessageDialog(null, "El usuario fue eliminado con éxito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ocurrió un error al eliminar el usuario.");
                    }
                }
            }

        } else if (e.getSource() == views.btn_cancel_Employed) {
            cleanFields();
            views.btn_register_Employes.setEnabled(true);
            views.txt_Employes_password.setEnabled(true);
            views.txt_Employes_ID.setEnabled(true);
            views.txt_Employes_ID.setEditable(true);
        }
    }

    public void listAllEmployes() {
        List<Employes> list = employeDao.listEmployesQuery(views.txt_search_Employes.getText());
        model = (DefaultTableModel) views.Employes_table.getModel();
        model.setRowCount(0);
        for (Employes emp : list) {
            model.addRow(new Object[]{emp.getId(), emp.getNombre(), emp.getNombre_usuario(),
                    emp.getDireccion(), emp.getTelefono(), emp.getCorreo(), emp.getRol()});
        }
    }

    public void cleanFields() {
        views.txt_Employes_ID.setText("");
        views.txt_Employes_fullname.setText("");
        views.txt_Employes_username.setText("");
        views.txt_employes_address.setText("");
        views.txt_Employes_telephone.setText("");
        views.txt_Employes_email.setText("");
        views.txt_Employes_password.setText("");
        views.cmb_rol.setSelectedIndex(0);
    }

    public void CleanTable() {
        model.setRowCount(0);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.Employes_table) {
            int row = views.Employes_table.getSelectedRow();
            if (row >= 0) {
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
    }

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txt_search_Employes) {
            CleanTable();
            listAllEmployes();
        }
    }
}

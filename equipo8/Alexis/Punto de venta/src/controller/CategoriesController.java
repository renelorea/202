package controller;

import Dao.CategoriasDao;
import static Dao.EmployesDao.rol_user;
import Models.Categorias;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import views.SystemViews;

public class CategoriesController implements ActionListener, MouseListener, KeyListener {

    private Categorias category;
    private CategoriasDao categoryDao;
    private SystemViews views;
    String rol = rol_user;
    DefaultTableModel model = new DefaultTableModel();

    public CategoriesController(Categorias category, CategoriasDao categoryDao, SystemViews views) {
        this.category = category;
        this.categoryDao = categoryDao;
        this.views = views;
        //Registrar
        this.views.btn_register_categoria.addActionListener(this);
        //Buscar
        this.views.txt_search_Categorias.addKeyListener(this);
        //Modificar
        this.views.btn_update_categaria.addActionListener(this);
        //Tabla
        this.views.Categorias_table.addMouseListener(this);
        //Eliminar
        this.views.btn_delete_Categorias.addActionListener(this);
        //Cancelar
        this.views.btn_cancel_category.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_register_categoria) {
            if (views.txt_Categorias_name.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "El campo de nombre es obligatorio");
            } else {
                category.setNombre(views.txt_Categorias_name.getText().trim());
                if (categoryDao.registerCategoriasQuery(category)) {
                    cleanTable();
                    cleanFields();
                    listAllCategories();
                    JOptionPane.showMessageDialog(null, "Categoria registrada con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error al registrar categoría");
                }
            }
        } else if (e.getSource() == views.btn_update_categaria) {
            if (views.txt_Categorias_ID.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila para continuar");
            } else {
                if (views.txt_Categorias_ID.getText().equals("")
                        || views.txt_Categorias_name.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                } else {
                    category.setId(Integer.parseInt(views.txt_Categorias_ID.getText()));
                    category.setNombre(views.txt_Categorias_name.getText().trim());
                    if (categoryDao.updateCategoriasQuery(category)) {
                        cleanTable();
                        cleanFields();
                        listAllCategories();
                        views.btn_register_categoria.setEnabled(true);
                    }
                }
            }
        } else if (e.getSource() == views.btn_delete_Categorias) {
            int row = views.Categorias_table.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona una categoría");
            } else {
                int id = Integer.parseInt(views.Categorias_table.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "¿En realidad quieres eliminar esta categoría?");
                if (question == 0 && categoryDao.deleteCAtegoriasQuery(id) != false) {
                    cleanTable();
                    cleanFields();
                    listAllCategories();
                    views.btn_register_categoria.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Categoria eliminada con éxito");
                }
            }
        }else if(e.getSource()== views.btn_cancel_category){
            cleanFields();
            views.btn_register_categoria.setEnabled(true);
        }
    }

    public void cleanFields() {
        views.txt_Categorias_ID.setText("");
        views.txt_Categorias_name.setText("");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.Categorias_table) {
            int row = views.Categorias_table.rowAtPoint(e.getPoint());
            views.txt_Categorias_ID.setText(views.Categorias_table.getValueAt(row, 0).toString());
            views.txt_Categorias_name.setText(views.Categorias_table.getValueAt(row, 1).toString());
            views.btn_register_categoria.setEnabled(false);
        }else if(e.getSource()== views.jLabelCategorias){
            if(rol.equals("Administrador")){
            }
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
        if (e.getSource() == views.txt_search_Categorias) {
            cleanTable();
            listAllCategories();
        }
    }

    public void cleanTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    public void listAllCategories() {
        if (rol.equals("Administrador")) {
            List<Categorias> list = categoryDao.listCategoriasQuery(views.txt_search_Categorias.getText());
            model = (DefaultTableModel) views.Categorias_table.getModel();
            Object[] row = new Object[2];
            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getId();
                model.addRow(row);
            }
            views.Categorias_table.setModel(model);
        }
    }

}

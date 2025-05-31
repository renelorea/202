package controller;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Dao.SuplimersDao;
import Models.Supplier; // Ensure this import matches the correct package path of the Supplier class
import views.SystemViews;
import Models.Suplimers;
import java.util.List;

public class SuppliersController {

    private SuplimersDao suplimersDao;

    public SuppliersController() {
        this.suplimersDao = new SuplimersDao();
    }

    public void registerSupplier(String name, String address, String telephone, String email, String description, String city) {
        if (name.isEmpty() || address.isEmpty() || telephone.isEmpty() || email.isEmpty() || description.isEmpty() || city.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            return;
        }

        Supplier supplier = new Supplier();
        supplier.setName(name);
        supplier.setAddress(address);
        supplier.setTelephone(telephone);
        supplier.setEmail(email);
        supplier.setDescription(description);
        supplier.setCity(city);

        if (suplimersDao.registerSuplimer(supplier)) { // Cambiar a registerSuplimer
            JOptionPane.showMessageDialog(null, "Proveedor registrado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar el proveedor");
        }
    }

    public void listAllSuppliers(SystemViews views) {
        DefaultTableModel model = (DefaultTableModel) views.suplimers_table.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos
        List<Suplimers> list = suplimersDao.listsuplimersQuery("");
        Object[] row = new Object[7];
        for (Suplimers suplimer : list) {
            row[0] = suplimer.getId();
            row[1] = suplimer.getNombre();
            row[2] = suplimer.getDescripcion();
            row[3] = suplimer.getDireccion();
            row[4] = suplimer.getTelefono();
            row[5] = suplimer.getCorreo();
            row[6] = suplimer.getCiudad();
            model.addRow(row);
        }
    }

}

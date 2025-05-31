/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import Dao.CategoriasDao;
import Dao.EmployesDao;
import Dao.ProductosDao;
import Models.Categorias;
import Models.Employes;
import Models.Productos;
import controller.CategoriesController;
import controller.EmployesControllers;
import controller.ProductosController;
import controller.SettingsControllers;
import controller.SuppliersController;

/**
 *
 * @author USER
 */
public class SystemViews extends javax.swing.JFrame {

    //Crear instancias
    Employes employe = new Employes();
    EmployesDao employesDao = new EmployesDao();
    //Categorias
    Categorias category = new Categorias();
    CategoriasDao categoriasDao = new CategoriasDao();
    //Productos
    Productos product = new Productos();
    ProductosDao productsDao = new ProductosDao();
    
    public SystemViews() {
        initComponents();
        setSize(1208,680);
        setResizable(false);
        setTitle("Panel de Administracion");
        setLocationRelativeTo(null);
        // Controlador de settings
        SettingsControllers setting = new SettingsControllers(this);
        this.repaint();
        // Controlador de empleados
        EmployesControllers employe_account = new EmployesControllers(employe, employesDao, this);
        employe_account.listAllEmployes();
        // Controlador de categorías
        CategoriesController category_section = new CategoriesController(category, categoriasDao, this);
        category_section.listAllCategories();
        // Controlador de productos
        ProductosController product_section = new ProductosController(product, productsDao, this);
        // Controlador de proveedores
        SuppliersController suppliersController = new SuppliersController();
        suppliersController.listAllSuppliers(this); // Listar proveedores en la tabla
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel40 = new javax.swing.JLabel();
        tb_productos = new javax.swing.JTabbedPane();
        tab_productos = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_Productos_code = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Productos_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Productos_unit_price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Productos_description = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmb_Product_category = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_Productos_ID = new javax.swing.JTextField();
        btb_register_Productos = new javax.swing.JButton();
        btb_update_Productos = new javax.swing.JButton();
        btb_cancel_Productos = new javax.swing.JButton();
        btn_delete_Productos = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_search_Productos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Productos_table = new javax.swing.JTable();
        btb_delete_Productos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_purchases_Productos_cout = new javax.swing.JTextField();
        txt_purchases_Productos_name = new javax.swing.JTextField();
        cmb_purchases_suplier = new javax.swing.JComboBox<>();
        txt_purchases_amount = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_purchases_price = new javax.swing.JTextField();
        txt_purchases_subtotal = new javax.swing.JTextField();
        txt_purchases_ID = new javax.swing.JTextField();
        txt_purchases_total_to_pay = new javax.swing.JTextField();
        btn_add_Productos_to_buy = new javax.swing.JButton();
        btn_confir_purchase = new javax.swing.JButton();
        btn_remove_purchase = new javax.swing.JButton();
        btn_new_purchase = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        purchase_table = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        txt_sale_product_code = new javax.swing.JTextField();
        txt_sale_product_name = new javax.swing.JTextField();
        txt_sale_quantitiy = new javax.swing.JTextField();
        txt_sale_total_to_pay = new javax.swing.JTextField();
        txt_sale_product_ID = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txt_sale_price = new javax.swing.JTextField();
        txt_sale_stok = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        btn_add_product_sale = new javax.swing.JButton();
        btn_confirm_sale = new javax.swing.JButton();
        btn_remove_sale = new javax.swing.JButton();
        btn_new_sale = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        sales_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_customer_ID = new javax.swing.JTextField();
        txt_customer_fullname = new javax.swing.JTextField();
        txt_customer_address = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_customer_telephone = new javax.swing.JTextField();
        txt_customer_email = new javax.swing.JTextField();
        btn_register_customer = new javax.swing.JButton();
        btn_update_customer = new javax.swing.JButton();
        btn_delete_customer = new javax.swing.JButton();
        btn_cancel_customer = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txt_search_customer = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        customer_table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_Employes_ID = new javax.swing.JTextField();
        txt_Employes_fullname = new javax.swing.JTextField();
        txt_Employes_username = new javax.swing.JTextField();
        txt_employes_address = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txt_Employes_telephone = new javax.swing.JTextField();
        txt_Employes_email = new javax.swing.JTextField();
        cmb_rol = new javax.swing.JComboBox<>();
        txt_Employes_password = new javax.swing.JPasswordField();
        btn_register_Employes = new javax.swing.JButton();
        btn_update_Employes = new javax.swing.JButton();
        btn_delete_Employed = new javax.swing.JButton();
        btn_cancel_Employed = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        txt_search_Employes = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        Employes_table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txt_Suplimers_name = new javax.swing.JTextField();
        txt_Suplimers_addres = new javax.swing.JTextField();
        txt_Suplimers_telephon = new javax.swing.JTextField();
        txt_Suplimers_email = new javax.swing.JTextField();
        txt_Suplimers_description = new javax.swing.JTextField();
        txt_Suplimers_ID = new javax.swing.JTextField();
        cmb_Suplimers_city = new javax.swing.JComboBox<>();
        btn_register_Suplimers = new javax.swing.JButton();
        btn_update_Suplimers = new javax.swing.JButton();
        btn_delete_Suplimers = new javax.swing.JButton();
        btn_cancel__Suplimers = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        txt_search_suplimers = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        suplimers_table = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txt_Categorias_ID = new javax.swing.JTextField();
        txt_Categorias_name = new javax.swing.JTextField();
        btn_register_categoria = new javax.swing.JButton();
        btn_update_categaria = new javax.swing.JButton();
        btn_delete_Categorias = new javax.swing.JButton();
        btn_cancel_category = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        txt_search_Categorias = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        Categorias_table = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_all_purchases = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        table_all_sales = new javax.swing.JTable();
        jLabel61 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        txt_ID_profile = new javax.swing.JTextField();
        txt_name_profile = new javax.swing.JTextField();
        txt_address_profile = new javax.swing.JTextField();
        txt_telephone_profile = new javax.swing.JTextField();
        txt_email_profile = new javax.swing.JTextField();
        txt_password_modify = new javax.swing.JPasswordField();
        txt_password_modify_confirm = new javax.swing.JPasswordField();
        btn_modify_data = new javax.swing.JButton();
        Menu = new javax.swing.JPanel();
        jPanelProductos = new javax.swing.JPanel();
        jLabelProductos = new javax.swing.JLabel();
        jPanelPutchase = new javax.swing.JPanel();
        jLabelPurchases = new javax.swing.JLabel();
        jPanelCustomers = new javax.swing.JPanel();
        jLabelCustomers = new javax.swing.JLabel();
        jPanelEmployes = new javax.swing.JPanel();
        jLabelEmployes = new javax.swing.JLabel();
        jPanelSuplimers = new javax.swing.JPanel();
        jLabelSuplimers = new javax.swing.JLabel();
        jPanelCategorias = new javax.swing.JPanel();
        jLabelCategorias = new javax.swing.JLabel();
        jPanelReportes = new javax.swing.JPanel();
        jLabelReportes = new javax.swing.JLabel();
        jPanelSetting = new javax.swing.JPanel();
        jLabelSetting = new javax.swing.JLabel();
        jPanelSales = new javax.swing.JPanel();
        jLabelSales = new javax.swing.JLabel();
        Logo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cabecera = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_photo = new javax.swing.JButton();
        btn_loginOut = new javax.swing.JButton();

        jLabel40.setText("jLabel40");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_productos.setBackground(new java.awt.Color(255, 255, 255));

        tab_productos.setBackground(new java.awt.Color(51, 51, 51));
        tab_productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText(" Codigo de Barras:");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));
        jPanel9.add(txt_Productos_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 165, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));
        jPanel9.add(txt_Productos_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 165, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Precio Venta:");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));
        jPanel9.add(txt_Productos_unit_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 165, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Descripcion:");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        txt_Productos_description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Productos_descriptionActionPerformed(evt);
            }
        });
        jPanel9.add(txt_Productos_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 165, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Categorias:");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jPanel9.add(cmb_Product_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 165, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("ID:");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        txt_Productos_ID.setEditable(false);
        txt_Productos_ID.setEnabled(false);
        jPanel9.add(txt_Productos_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 165, 30));

        btb_register_Productos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btb_register_Productos.setText("Registrar");
        btb_register_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_register_ProductosActionPerformed(evt);
            }
        });
        jPanel9.add(btb_register_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 100, 30));

        btb_update_Productos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btb_update_Productos.setText("Modificar");
        btb_update_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_update_ProductosActionPerformed(evt);
            }
        });
        jPanel9.add(btb_update_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 100, 30));

        btb_cancel_Productos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btb_cancel_Productos.setText("Cancelar");
        jPanel9.add(btb_cancel_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 100, 30));

        btn_delete_Productos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_delete_Productos.setText("Eliminar");
        jPanel9.add(btn_delete_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 100, 30));

        tab_productos.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 920, 270));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Buscar");
        tab_productos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 315, -1, -1));

        txt_search_Productos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        tab_productos.add(txt_search_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 160, 30));

        Productos_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Nombre", "Descripcion", "Precio Venta", "Cantidad", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Productos_table);

        tab_productos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 910, 150));

        btb_delete_Productos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btb_delete_Productos.setText("Eliminar");
        tab_productos.add(btb_delete_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 100, 30));

        tb_productos.addTab("Productos", tab_productos);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Codigo Producto");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Nombre Producto");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("Cantidad");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("Proveedor");

        txt_purchases_Productos_cout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_purchases_Productos_coutActionPerformed(evt);
            }
        });

        txt_purchases_Productos_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_purchases_Productos_nameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("Precio Compra");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setText("Subtotal");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setText("ID");

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setText("Total a Pagar");

        txt_purchases_subtotal.setEditable(false);

        txt_purchases_ID.setEditable(false);
        txt_purchases_ID.setEnabled(false);

        txt_purchases_total_to_pay.setEditable(false);

        btn_add_Productos_to_buy.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_add_Productos_to_buy.setText("Agregar");
        btn_add_Productos_to_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_Productos_to_buyActionPerformed(evt);
            }
        });

        btn_confir_purchase.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_confir_purchase.setText("Comprar");
        btn_confir_purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confir_purchaseActionPerformed(evt);
            }
        });

        btn_remove_purchase.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_remove_purchase.setText("Eliminar");

        btn_new_purchase.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_new_purchase.setText("Nuevo");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_purchases_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(35, 35, 35)
                            .addComponent(txt_purchases_Productos_cout, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(jLabel14)
                            .addGap(27, 27, 27)
                            .addComponent(txt_purchases_price, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(87, 87, 87)
                                .addComponent(txt_purchases_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(31, 31, 31)
                                .addComponent(txt_purchases_Productos_name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(82, 82, 82)
                                .addComponent(cmb_purchases_suplier, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel17)))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(txt_purchases_total_to_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(txt_purchases_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(60, 60, 60)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_new_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_Productos_to_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_confir_purchase)
                    .addComponent(btn_remove_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txt_purchases_Productos_cout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txt_purchases_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_Productos_to_buy))
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txt_purchases_Productos_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txt_purchases_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_confir_purchase)))
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txt_purchases_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_purchases_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_remove_purchase)))
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(cmb_purchases_suplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_purchases_total_to_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_new_purchase))))
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 310));

        purchase_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre Producto", "Cantidad", "Precion", "Subtotal", "Provedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(purchase_table);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 920, 170));

        tb_productos.addTab("Compras", jPanel2);

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N

        jLabel53.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel53.setText("Codigo Producto");

        jLabel54.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel54.setText("Nombre Producto");

        jLabel55.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel55.setText("Cantidad");

        jLabel56.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel56.setText("Total a Pagar");

        jLabel57.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel57.setText("ID");

        txt_sale_product_code.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_sale_product_name.setEditable(false);
        txt_sale_product_name.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_sale_quantitiy.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_sale_total_to_pay.setEditable(false);
        txt_sale_total_to_pay.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_sale_product_ID.setEditable(false);
        txt_sale_product_ID.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel58.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel58.setText("Precio");

        jLabel59.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel59.setText("Subtotal");

        jLabel60.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel60.setText("Stok");

        txt_sale_price.setEditable(false);
        txt_sale_price.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_sale_stok.setEditable(false);
        txt_sale_stok.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        btn_add_product_sale.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_add_product_sale.setText("Agregar");

        btn_confirm_sale.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_confirm_sale.setText("Vender");

        btn_remove_sale.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_remove_sale.setText("Eliminar");

        btn_new_sale.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_new_sale.setText("Nuevo");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_sale_quantitiy, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_total_to_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sale_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sale_price, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_confirm_sale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_remove_sale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_new_sale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(txt_sale_product_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_add_product_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(115, 115, 115))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(txt_sale_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_product_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)
                    .addComponent(txt_sale_product_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_confirm_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(txt_sale_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(txt_sale_quantitiy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_remove_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(txt_sale_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(txt_sale_total_to_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_new_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 315));

        sales_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre", "Cantidad", "Precio Venta", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(sales_table);

        jPanel16.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 910, 130));

        tb_productos.addTab("Ventas", jPanel16);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setText("Identificacion");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setText("Nombre");

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setText("Direccion");

        txt_customer_ID.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txt_customer_fullname.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txt_customer_address.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setText("Telefono");

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setText("Correo");

        txt_customer_telephone.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txt_customer_email.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txt_customer_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_customer_emailActionPerformed(evt);
            }
        });

        btn_register_customer.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_register_customer.setText("Registrar");

        btn_update_customer.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_update_customer.setText("Modificar");

        btn_delete_customer.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_delete_customer.setText("Eliminar");

        btn_cancel_customer.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_cancel_customer.setText("Cancelar");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(16, 16, 16)
                        .addComponent(txt_customer_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel21)
                        .addGap(22, 22, 22)
                        .addComponent(txt_customer_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_register_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_update_customer)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(55, 55, 55)
                        .addComponent(txt_customer_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(457, 457, 457)
                        .addComponent(btn_delete_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(44, 44, 44)
                        .addComponent(txt_customer_address, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel22)
                        .addGap(34, 34, 34)
                        .addComponent(txt_customer_email, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btn_cancel_customer))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel18))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txt_customer_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel21))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txt_customer_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btn_register_customer)
                        .addGap(24, 24, 24)
                        .addComponent(btn_update_customer)))
                .addGap(14, 14, 14)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txt_customer_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_delete_customer)))
                .addGap(4, 4, 4)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel20))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txt_customer_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22)
                    .addComponent(txt_customer_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_cancel_customer))))
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 920, 282));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel23.setText("Buscar");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 315, -1, -1));

        txt_search_customer.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jPanel3.add(txt_search_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 160, 30));

        customer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre", "Telefono", "Direccion", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(customer_table);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 920, 150));

        tb_productos.addTab("Clientes", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel24.setText("Identificacion");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel25.setText("Nombre");

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel26.setText("Usuario");

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel27.setText("Rol");

        txt_Employes_ID.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txt_Employes_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Employes_IDActionPerformed(evt);
            }
        });

        txt_Employes_fullname.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txt_Employes_username.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txt_employes_address.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel28.setText("Direccion");

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel29.setText("Telefono");

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel30.setText("Correo");

        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel31.setText("Contraseña");

        txt_Employes_telephone.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txt_Employes_email.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        cmb_rol.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cmb_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "GERENTE", "EMPLEADO" }));
        cmb_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_rolActionPerformed(evt);
            }
        });

        txt_Employes_password.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        btn_register_Employes.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_register_Employes.setText("Registrar");
        btn_register_Employes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_register_EmployesActionPerformed(evt);
            }
        });

        btn_update_Employes.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_update_Employes.setText("Modificar");

        btn_delete_Employed.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_delete_Employed.setText("Eliminar");
        btn_delete_Employed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_EmployedActionPerformed(evt);
            }
        });

        btn_cancel_Employed.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_cancel_Employed.setText("Cancelar");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(26, 26, 26)
                        .addComponent(txt_Employes_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel28)
                        .addGap(54, 54, 54)
                        .addComponent(txt_employes_address, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(btn_register_Employes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(65, 65, 65)
                        .addComponent(txt_Employes_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel29)
                        .addGap(62, 62, 62)
                        .addComponent(txt_Employes_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(btn_update_Employes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(71, 71, 71)
                        .addComponent(txt_Employes_username, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel30)
                        .addGap(74, 74, 74)
                        .addComponent(txt_Employes_email, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(btn_delete_Employed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(99, 99, 99)
                        .addComponent(cmb_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel31)
                        .addGap(43, 43, 43)
                        .addComponent(txt_Employes_password, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(btn_cancel_Employed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(txt_Employes_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(txt_employes_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_register_Employes))))
                .addGap(14, 14, 14)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(txt_Employes_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(txt_Employes_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_update_Employes))))
                .addGap(14, 14, 14)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(txt_Employes_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(txt_Employes_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete_Employed))))
                .addGap(24, 24, 24)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(cmb_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(txt_Employes_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel_Employed)))
        );

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 280));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel32.setText("Buscar");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 315, -1, -1));
        jPanel4.add(txt_search_Employes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 160, 30));

        Employes_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre", "Usuario", "Doreccion", "Telefono", "Correo", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(Employes_table);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 910, 150));

        tb_productos.addTab("Empleados", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel33.setText("Nombre");

        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel34.setText("Direccion");

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel35.setText("Telefono");

        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel36.setText("Correo");

        jLabel37.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel37.setText("Descripcion");

        jLabel38.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel38.setText("Ciudad");

        jLabel39.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel39.setText("ID");

        txt_Suplimers_name.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_Suplimers_addres.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_Suplimers_telephon.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_Suplimers_email.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_Suplimers_description.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_Suplimers_ID.setEditable(false);
        txt_Suplimers_ID.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_Suplimers_ID.setEnabled(false);

        cmb_Suplimers_city.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmb_Suplimers_city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CDMX", "Estado de Mexico", "Foraneo" }));

        btn_register_Suplimers.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_register_Suplimers.setText("Registrar");
        btn_register_Suplimers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_register_SuplimersActionPerformed(evt);
            }
        });

        btn_update_Suplimers.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_update_Suplimers.setText("Modificar");

        btn_delete_Suplimers.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_delete_Suplimers.setText("Eliminar");

        btn_cancel__Suplimers.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_cancel__Suplimers.setText("Cancelar");
        btn_cancel__Suplimers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel__SuplimersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Suplimers_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Suplimers_name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Suplimers_telephon, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(txt_Suplimers_addres, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Suplimers_description, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Suplimers_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_Suplimers_city, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_delete_Suplimers, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_register_Suplimers, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_update_Suplimers, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancel__Suplimers, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel37)
                    .addComponent(txt_Suplimers_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Suplimers_description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register_Suplimers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel38)
                    .addComponent(txt_Suplimers_addres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_Suplimers_city, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_Suplimers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel39)
                    .addComponent(txt_Suplimers_telephon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Suplimers_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_Suplimers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txt_Suplimers_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_cancel__Suplimers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))))
        );

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 270));

        jLabel41.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel41.setText("Buscar");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 315, -1, -1));

        txt_search_suplimers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_suplimersActionPerformed(evt);
            }
        });
        jPanel5.add(txt_search_suplimers, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 160, 30));

        suplimers_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Direccion", "Telefono", "Correo", "Ciudad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(suplimers_table);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 910, 150));

        tb_productos.addTab("Proveedores", jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel42.setText("    ID");

        jLabel43.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel43.setText("Nombre");

        btn_register_categoria.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_register_categoria.setText("Registrar");

        btn_update_categaria.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_update_categaria.setText("Modificar");

        btn_delete_Categorias.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_delete_Categorias.setText("Eliminar");
        btn_delete_Categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_CategoriasActionPerformed(evt);
            }
        });

        btn_cancel_category.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_cancel_category.setText("Cancelar");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Categorias_name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Categorias_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_update_categaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete_Categorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_register_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancel_category, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btn_register_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(txt_Categorias_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_update_categaria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete_Categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancel_category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(txt_Categorias_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 530, 270));

        jLabel44.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Buscar");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));
        jPanel6.add(txt_search_Categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 290, 30));

        Categorias_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(Categorias_table);

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 360, 200));

        tb_productos.addTab("Categorias", jPanel6);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel45.setText("Compras Realizadas");
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        table_all_purchases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proveedor", "Total Compra", "Fecha Compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(table_all_purchases);

        jPanel7.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 950, 190));

        table_all_sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empleado", "Total", "Fecha Venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(table_all_sales);

        jPanel7.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 930, 200));

        jLabel61.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel61.setText("Ventas Realizadas");
        jPanel7.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        tb_productos.addTab("Reportes", jPanel7);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Perfil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel46.setText("Identificacion");

        jLabel47.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel47.setText("Nombre");

        jLabel48.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel48.setText("Direccion");

        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel49.setText("Telefono");

        jLabel50.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel50.setText("Correo");

        jLabel51.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel51.setText("Nueva contraseña");

        jLabel52.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel52.setText("Confirmar Contraseña");

        txt_ID_profile.setEditable(false);
        txt_ID_profile.setEnabled(false);

        txt_name_profile.setEditable(false);
        txt_name_profile.setEnabled(false);

        txt_address_profile.setEditable(false);
        txt_address_profile.setEnabled(false);

        txt_telephone_profile.setEditable(false);
        txt_telephone_profile.setEnabled(false);

        txt_email_profile.setEditable(false);
        txt_email_profile.setEnabled(false);

        txt_password_modify.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        txt_password_modify_confirm.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        btn_modify_data.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_modify_data.setText("Modificar");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_password_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_password_modify_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(212, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_email_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_name_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addComponent(jLabel46)
                                    .addGap(20, 20, 20)
                                    .addComponent(txt_ID_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_address_profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telephone_profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_modify_data, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46)
                    .addComponent(txt_ID_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jLabel51)
                    .addComponent(txt_name_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txt_address_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modify_data, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel52)
                    .addComponent(txt_telephone_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password_modify_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 390));

        tb_productos.addTab("Perfil", jPanel8);

        getContentPane().add(tb_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1010, 580));

        Menu.setBackground(new java.awt.Color(51, 51, 51));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelProductos.setBackground(new java.awt.Color(255, 255, 255));

        jLabelProductos.setText("jLabel62");
        jPanelProductos.add(jLabelProductos);

        Menu.add(jPanelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 35));

        jPanelPutchase.setBackground(new java.awt.Color(255, 255, 255));

        jLabelPurchases.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelPurchases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/compras.jpg"))); // NOI18N
        jLabelPurchases.setText("Compras");
        jPanelPutchase.add(jLabelPurchases);

        Menu.add(jPanelPutchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 35));

        jPanelCustomers.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCustomers.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/clientes.jpg"))); // NOI18N
        jLabelCustomers.setText("Clientes");
        jPanelCustomers.add(jLabelCustomers);

        Menu.add(jPanelCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 35));

        jPanelEmployes.setBackground(new java.awt.Color(255, 255, 255));

        jLabelEmployes.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelEmployes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/empleados.jpg"))); // NOI18N
        jLabelEmployes.setText("Empleados");
        jPanelEmployes.add(jLabelEmployes);

        Menu.add(jPanelEmployes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 35));

        jPanelSuplimers.setBackground(new java.awt.Color(255, 255, 255));

        jLabelSuplimers.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelSuplimers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/provedores.jpg"))); // NOI18N
        jLabelSuplimers.setText("Proveedores");
        jPanelSuplimers.add(jLabelSuplimers);

        Menu.add(jPanelSuplimers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 200, 35));

        jPanelCategorias.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCategorias.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/categorias.jpg"))); // NOI18N
        jLabelCategorias.setText("Categorias");
        jPanelCategorias.add(jLabelCategorias);

        Menu.add(jPanelCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 35));

        jPanelReportes.setBackground(new java.awt.Color(255, 255, 255));

        jLabelReportes.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/reportes.jpg"))); // NOI18N
        jLabelReportes.setText("Reportes");
        jPanelReportes.add(jLabelReportes);

        Menu.add(jPanelReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 200, 35));

        jPanelSetting.setBackground(new java.awt.Color(255, 255, 255));

        jLabelSetting.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/configuracion.jpg"))); // NOI18N
        jLabelSetting.setText("Configuracion");
        jPanelSetting.add(jLabelSetting);

        Menu.add(jPanelSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 200, 35));

        jPanelSales.setBackground(new java.awt.Color(255, 255, 255));

        jLabelSales.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Ventas_1.jpg"))); // NOI18N
        jLabelSales.setText("   Ventas");

        javax.swing.GroupLayout jPanelSalesLayout = new javax.swing.GroupLayout(jPanelSales);
        jPanelSales.setLayout(jPanelSalesLayout);
        jPanelSalesLayout.setHorizontalGroup(
            jPanelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSalesLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabelSales, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelSalesLayout.setVerticalGroup(
            jPanelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        Menu.add(jPanelSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 35));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 580));

        Logo.setBackground(new java.awt.Color(204, 204, 255));
        Logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logo_3.png"))); // NOI18N
        Logo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        Cabecera.setBackground(new java.awt.Color(51, 51, 51));
        Cabecera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Joyeria piel morena");
        Cabecera.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 340, 100));

        btn_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/personal_1.jpg"))); // NOI18N
        Cabecera.add(btn_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 80, 65));

        btn_loginOut.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_loginOut.setText("Salir");
        btn_loginOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginOutActionPerformed(evt);
            }
        });
        Cabecera.add(btn_loginOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 35, -1, 30));

        getContentPane().add(Cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1010, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btb_register_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_register_ProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btb_register_ProductosActionPerformed

    private void btb_update_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_update_ProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btb_update_ProductosActionPerformed

    private void txt_Productos_descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Productos_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Productos_descriptionActionPerformed

    private void txt_purchases_Productos_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_purchases_Productos_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_purchases_Productos_nameActionPerformed

    private void btn_add_Productos_to_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_Productos_to_buyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_add_Productos_to_buyActionPerformed

    private void btn_confir_purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confir_purchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_confir_purchaseActionPerformed

    private void txt_purchases_Productos_coutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_purchases_Productos_coutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_purchases_Productos_coutActionPerformed

    private void txt_customer_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_customer_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_emailActionPerformed

    private void btn_delete_EmployedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_EmployedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_delete_EmployedActionPerformed

    private void txt_Employes_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Employes_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Employes_IDActionPerformed

    private void btn_register_SuplimersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_register_SuplimersActionPerformed
    SuppliersController suppliersController = new SuppliersController();
    suppliersController.registerSupplier(
        txt_Suplimers_name.getText(),
        txt_Suplimers_addres.getText(),
        txt_Suplimers_telephon.getText(),
        txt_Suplimers_email.getText(),
        txt_Suplimers_description.getText(),
        cmb_Suplimers_city.getSelectedItem().toString()
    );
}//GEN-LAST:event_btn_register_SuplimersActionPerformed

    private void btn_cancel__SuplimersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel__SuplimersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancel__SuplimersActionPerformed

    private void txt_search_suplimersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_suplimersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search_suplimersActionPerformed

    private void btn_loginOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginOutActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==btn_loginOut){
            dispose();
            Loginviews login = new Loginviews();
            login.setVisible(true);
        }
    }//GEN-LAST:event_btn_loginOutActionPerformed

    private void btn_register_EmployesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_register_EmployesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_register_EmployesActionPerformed

    private void cmb_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_rolActionPerformed

    private void btn_delete_CategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_CategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_delete_CategoriasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SystemViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemViews().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabecera;
    public javax.swing.JTable Categorias_table;
    public javax.swing.JTable Employes_table;
    private javax.swing.JPanel Logo;
    private javax.swing.JPanel Menu;
    public javax.swing.JTable Productos_table;
    public javax.swing.JButton btb_cancel_Productos;
    public javax.swing.JButton btb_delete_Productos;
    public javax.swing.JButton btb_register_Productos;
    public javax.swing.JButton btb_update_Productos;
    public javax.swing.JButton btn_add_Productos_to_buy;
    public javax.swing.JButton btn_add_product_sale;
    public javax.swing.JButton btn_cancel_Employed;
    public javax.swing.JButton btn_cancel__Suplimers;
    public javax.swing.JButton btn_cancel_category;
    public javax.swing.JButton btn_cancel_customer;
    public javax.swing.JButton btn_confir_purchase;
    public javax.swing.JButton btn_confirm_sale;
    public javax.swing.JButton btn_delete_Categorias;
    public javax.swing.JButton btn_delete_Employed;
    private javax.swing.JButton btn_delete_Productos;
    public javax.swing.JButton btn_delete_Suplimers;
    public javax.swing.JButton btn_delete_customer;
    public javax.swing.JButton btn_loginOut;
    public javax.swing.JButton btn_modify_data;
    public javax.swing.JButton btn_new_purchase;
    public javax.swing.JButton btn_new_sale;
    private javax.swing.JButton btn_photo;
    public javax.swing.JButton btn_register_Employes;
    public javax.swing.JButton btn_register_Suplimers;
    public javax.swing.JButton btn_register_categoria;
    public javax.swing.JButton btn_register_customer;
    public javax.swing.JButton btn_remove_purchase;
    public javax.swing.JButton btn_remove_sale;
    public javax.swing.JButton btn_update_Employes;
    public javax.swing.JButton btn_update_Suplimers;
    public javax.swing.JButton btn_update_categaria;
    public javax.swing.JButton btn_update_customer;
    public javax.swing.JComboBox<Object> cmb_Product_category;
    public javax.swing.JComboBox<String> cmb_Suplimers_city;
    public javax.swing.JComboBox<String> cmb_purchases_suplier;
    public javax.swing.JComboBox<String> cmb_rol;
    public javax.swing.JTable customer_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelCategorias;
    public javax.swing.JLabel jLabelCustomers;
    public javax.swing.JLabel jLabelEmployes;
    private javax.swing.JLabel jLabelProductos;
    public javax.swing.JLabel jLabelPurchases;
    public javax.swing.JLabel jLabelReportes;
    public javax.swing.JLabel jLabelSales;
    public javax.swing.JLabel jLabelSetting;
    public javax.swing.JLabel jLabelSuplimers;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JPanel jPanelCategorias;
    public javax.swing.JPanel jPanelCustomers;
    public javax.swing.JPanel jPanelEmployes;
    public javax.swing.JPanel jPanelProductos;
    public javax.swing.JPanel jPanelPutchase;
    public javax.swing.JPanel jPanelReportes;
    public javax.swing.JPanel jPanelSales;
    public javax.swing.JPanel jPanelSetting;
    public javax.swing.JPanel jPanelSuplimers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JTable purchase_table;
    public javax.swing.JTable sales_table;
    public javax.swing.JTable suplimers_table;
    public javax.swing.JPanel tab_productos;
    public javax.swing.JTable table_all_purchases;
    public javax.swing.JTable table_all_sales;
    private javax.swing.JTabbedPane tb_productos;
    public javax.swing.JTextField txt_Categorias_ID;
    public javax.swing.JTextField txt_Categorias_name;
    public javax.swing.JTextField txt_Employes_ID;
    public javax.swing.JTextField txt_Employes_email;
    public javax.swing.JTextField txt_Employes_fullname;
    public javax.swing.JPasswordField txt_Employes_password;
    public javax.swing.JTextField txt_Employes_telephone;
    public javax.swing.JTextField txt_Employes_username;
    private javax.swing.JTextField txt_ID_profile;
    public javax.swing.JTextField txt_Productos_ID;
    public javax.swing.JTextField txt_Productos_code;
    public javax.swing.JTextField txt_Productos_description;
    public javax.swing.JTextField txt_Productos_name;
    public javax.swing.JTextField txt_Productos_unit_price;
    public javax.swing.JTextField txt_Suplimers_ID;
    public javax.swing.JTextField txt_Suplimers_addres;
    public javax.swing.JTextField txt_Suplimers_description;
    public javax.swing.JTextField txt_Suplimers_email;
    public javax.swing.JTextField txt_Suplimers_name;
    public javax.swing.JTextField txt_Suplimers_telephon;
    private javax.swing.JTextField txt_address_profile;
    public javax.swing.JTextField txt_customer_ID;
    public javax.swing.JTextField txt_customer_address;
    public javax.swing.JTextField txt_customer_email;
    public javax.swing.JTextField txt_customer_fullname;
    public javax.swing.JTextField txt_customer_telephone;
    private javax.swing.JTextField txt_email_profile;
    public javax.swing.JTextField txt_employes_address;
    private javax.swing.JTextField txt_name_profile;
    private javax.swing.JPasswordField txt_password_modify;
    private javax.swing.JPasswordField txt_password_modify_confirm;
    public javax.swing.JTextField txt_purchases_ID;
    public javax.swing.JTextField txt_purchases_Productos_cout;
    public javax.swing.JTextField txt_purchases_Productos_name;
    public javax.swing.JTextField txt_purchases_amount;
    public javax.swing.JTextField txt_purchases_price;
    public javax.swing.JTextField txt_purchases_subtotal;
    public javax.swing.JTextField txt_purchases_total_to_pay;
    public javax.swing.JTextField txt_sale_price;
    public javax.swing.JTextField txt_sale_product_ID;
    public javax.swing.JTextField txt_sale_product_code;
    public javax.swing.JTextField txt_sale_product_name;
    public javax.swing.JTextField txt_sale_quantitiy;
    public javax.swing.JTextField txt_sale_stok;
    public javax.swing.JTextField txt_sale_total_to_pay;
    public javax.swing.JTextField txt_search_Categorias;
    public javax.swing.JTextField txt_search_Employes;
    public javax.swing.JTextField txt_search_Productos;
    public javax.swing.JTextField txt_search_customer;
    public javax.swing.JTextField txt_search_suplimers;
    private javax.swing.JTextField txt_telephone_profile;
    // End of variables declaration//GEN-END:variables
}

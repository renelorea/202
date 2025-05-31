
package Models;


public class Purchase {
    private int id;
    private int code;
    private String nombre_producto;
    private int monto_compra;
    private double precio_compra;
    private double subtotal_compra;
    private double total;
    private String crear;
    private String compra;
    private String supplier_nombre_producto;

    public Purchase() {
    }

    public Purchase(int id, int code, String nombre_producto, int monto_compra, double precio_compra, double subtotal_compra, double total, String crear, String compra, String supplier_nombre_producto) {
        this.id = id;
        this.code = code;
        this.nombre_producto = nombre_producto;
        this.monto_compra = monto_compra;
        this.precio_compra = precio_compra;
        this.subtotal_compra = subtotal_compra;
        this.total = total;
        this.crear = crear;
        this.compra = compra;
        this.supplier_nombre_producto = supplier_nombre_producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getMonto_compra() {
        return monto_compra;
    }

    public void setMonto_compra(int monto_compra) {
        this.monto_compra = monto_compra;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getSubtotal_compra() {
        return subtotal_compra;
    }

    public void setSubtotal_compra(double subtotal_compra) {
        this.subtotal_compra = subtotal_compra;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCrear() {
        return crear;
    }

    public void setCrear(String crear) {
        this.crear = crear;
    }

    public String getCompra() {
        return compra;
    }

    public void setCompra(String compra) {
        this.compra = compra;
    }

    public String getSupplier_nombre_producto() {
        return supplier_nombre_producto;
    }

    public void setSupplier_nombre_producto(String supplier_nombre_producto) {
        this.supplier_nombre_producto = supplier_nombre_producto;
    }

    public void setPurchase(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

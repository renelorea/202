
package Models;


public class Ventas {
    //Variables
    private int id;
    private String fecha_compra;
    private double total_a_pagar;
    private int cliente_id;
    private String nombre_cliente;
    private int provedor_id;
    private String nombre_empleado;

    public Ventas() {
    }

    public Ventas(int id, String fecha_compra, double total_a_pagar, int cliente_id, String nombre_cliente, int provedor_id, String nombre_empleado) {
        this.id = id;
        this.fecha_compra = fecha_compra;
        this.total_a_pagar = total_a_pagar;
        this.cliente_id = cliente_id;
        this.nombre_cliente = nombre_cliente;
        this.provedor_id = provedor_id;
        this.nombre_empleado = nombre_empleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public double getTotal_a_pagar() {
        return total_a_pagar;
    }

    public void setTotal_a_pagar(double total_a_pagar) {
        this.total_a_pagar = total_a_pagar;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getProvedor_id() {
        return provedor_id;
    }

    public void setProvedor_id(int provedor_id) {
        this.provedor_id = provedor_id;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }
    
    
}

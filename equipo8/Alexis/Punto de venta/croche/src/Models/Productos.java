
package Models;



public class Productos {
    private int id;
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio_unidad;
    private int cantidad;
    private String crear;
    private String actualizar;
    private int id_categoria;
    private String nombre_categoria;

    public Productos() {
    }

        public Productos(int id, int codigo, String nombre, String descripcion, double precio_unidad, int cantidad, String crear, String actualizar, int id_categoria, String nombre_categoria) {
            this.id = id;
            this.codigo = codigo;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio_unidad = precio_unidad;
            this.cantidad = cantidad;
            this.crear = crear;
            this.actualizar = actualizar;
            this.id_categoria = id_categoria;
            this.nombre_categoria = nombre_categoria;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(double precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCrear() {
        return crear;
    }

    public void setCrear(String crear) {
        this.crear = crear;
    }

    public String getActualizar() {
        return actualizar;
    }

    public void setActualizar(String actualizar) {
        this.actualizar = actualizar;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }
}

   
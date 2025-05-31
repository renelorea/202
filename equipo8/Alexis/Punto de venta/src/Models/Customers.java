
package Models;


public class Customers {
    private int id;
    private String nombre_completo;
    private String direccion;
    private String telefono;
    private String correo;
    private String crear;
    private String actualizar;
    
    public Customers(){   
    }

    public Customers(int ID, String nombre_completo, String direccion, String telefono, String correo, String crear, String actualizar) {
        this.id = ID;
        this.nombre_completo = nombre_completo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.crear = crear;
        this.actualizar = actualizar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
    
}


package Models;

public class Employes {
private int id;
private String nombre;
private String nombre_usuario;
private String direccion;
private String telefono;
private String correo;
private String contraseña;
private String rol;
private String fecha;
private String actualizar;

    public Employes() {
    }

    public Employes(int id, String nombre, String nombre_usuario, String direccion, String telefono, String correo, String contraseña, String rol, String fecha, String actualizar) {
        this.id = id;
        this.nombre = nombre;
        this.nombre_usuario = nombre_usuario;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
        this.fecha = fecha;
        this.actualizar = actualizar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getActualizar() {
        return actualizar;
    }

    public void setActualizar(String actualizar) {
        this.actualizar = actualizar;
    }

}

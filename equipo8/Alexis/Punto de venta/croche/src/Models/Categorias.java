
package Models;

public class Categorias {
    
    private int id;
    private String nombre;
    private String crear;
    private String actualizar;

    public Categorias() {
    }

    public Categorias(int id, String nombre, String crear, String actualizar) {
        this.id = id;
        this.nombre = nombre;
        this.crear = crear;
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

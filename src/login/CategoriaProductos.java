
package login;


public class CategoriaProductos {
    private String nombre;
    private String demanda;
    private String descripcion;
    private int IDCategoria;
    private boolean disponibilidad;

    public CategoriaProductos(String nombre, String demanda, String descripcion, int IDCategoria, boolean disponibilidad) {
        this.nombre = nombre;
        this.demanda = demanda;
        this.descripcion = descripcion;
        this.IDCategoria = IDCategoria;
        this.disponibilidad = disponibilidad;
    }

    // Getters y Setters para todos los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDemanda() {
        return demanda;
    }

    public void setDemanda(String demanda) {
        this.demanda = demanda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIDCategoria() {
        return IDCategoria;
    }

    public void setIDCategoria(int IDCategoria) {
        this.IDCategoria = IDCategoria;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}

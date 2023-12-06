package login;

public class ProductoElectrónico {
    private String nombre;
    private String proveedor;
    private int codigo;
    private double precio;
    private String categoria;

    public ProductoElectrónico(String nombre, String proveedor, int codigo, double precio, String categoria) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.codigo = codigo;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    public String toString() {
        return "Nombre: " + nombre + ", Proveedor: " + proveedor + ", Código: " + codigo + ", Precio: " + precio + ", Categoría: " + categoria;
    }
}

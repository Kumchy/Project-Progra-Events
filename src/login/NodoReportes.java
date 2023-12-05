package login;

public class NodoReportes {
    private String fecha; 
    private int codigo; 
    private String producto; 
    private String proveedor;
    private String descripcion;
    public NodoReportes aptSiguiente;
    
    public NodoReportes(String w, int x, String z, String y, String c){
        this(w, x, z, y, c, null);
    }
    public NodoReportes(String f, int c, String p, String pe, String d, NodoReportes N){
        this.fecha = f;
        this.codigo = c; 
        this.producto = p; 
        this.proveedor = pe;
        this.descripcion = d;
        this.aptSiguiente = N;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String valor2) {
        this.fecha = valor2;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int valor3) {
        this.codigo = valor3;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String valor4) {
        this.producto = valor4;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public NodoReportes getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(NodoReportes aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }
}

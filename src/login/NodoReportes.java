package login;



public class NodoReportes {
    private String fecha; 
    private int codigo; 
    private String contenido; 
    public NodoReportes aptSiguiente;
    
    public NodoReportes(String w, int x, String z){
        this(w, x, z, null);
    }
    public NodoReportes(String f, int c, String cn, NodoReportes N){
        this.fecha = f;
        this.codigo = c; 
        this.contenido = cn; 
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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String valor4) {
        this.contenido = valor4;
    }

    public NodoReportes getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(NodoReportes aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }
}

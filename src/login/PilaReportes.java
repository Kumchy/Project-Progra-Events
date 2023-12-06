package login;

import javax.swing.JOptionPane;

public class PilaReportes {
    public NodoReportes PilaReportes;
    
    public PilaReportes(){
        PilaReportes = null;
    } 
    public void push(String fecha,int codigo, String producto, String proveedor, String descripcion){
        NodoReportes nuevo = new NodoReportes(fecha,codigo,producto,proveedor,descripcion );
        if(PilaReportes == null){
            PilaReportes = nuevo; 
        }
        else{
            NodoReportes aux = PilaReportes; 
            
            while(aux.getAptSiguiente() != null){
                aux = aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
            
        }
    }

    public void pop(){
        NodoReportes aux = PilaReportes; 
        if( PilaReportes == null){
            System.out.print("La pila esta vacia. ");
        } else{
            if(aux.getAptSiguiente() == null){
               PilaReportes = null; 
            } else{
                PilaReportes = aux.getAptSiguiente(); 
            }
        }
    }

    public void modificarUltimo(String nuevaFecha, int nuevoCodigo, String nuevoProducto, String nuevoProveedor, String nuevaDescripcion) {
        if (PilaReportes == null) {
            System.out.println("No hay informes registrados. No se puede modificar el último reporte.");
        } else {
            NodoReportes aux = PilaReportes;
            while (aux.getAptSiguiente() != null) {
                aux = aux.getAptSiguiente();
            }
            aux.setFecha(nuevaFecha);
            aux.setCodigo(nuevoCodigo);
            aux.setProducto(nuevoProducto);
            aux.setProveedor(nuevoProveedor);
            aux.setDescripcion(nuevaDescripcion);
            
        }
    }
}

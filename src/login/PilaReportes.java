package login;




public class PilaReportes {
    public NodoReportes PilaReportes; 
    
    public PilaReportes(){
        PilaReportes = null; 
    } 
    public void push(String f,int c, String p, String pe, String d){
        NodoReportes nuevo = new NodoReportes(f,c,p,pe,d );
        if(PilaReportes == null){
            PilaReportes = nuevo; 
        }
        else{
            NodoReportes aux = PilaReportes; 
            
            while(aux.getAptSiguiente() != null){
                aux = aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
            
        }//else 
    } // push
    
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
            System.out.println("Primer elemento eliminado. "); 
        }//else 
    }
    
    public String buscar(){
        String buscado = "";
        NodoReportes aux = PilaReportes;
        int idReporte = BuscarInformeIFrm.BuscarCola;
        int comparado;
        int posicion = 1;
        if(PilaReportes == null){
            buscado = "El inventario esta vacio";
        } else {
            while(true){
                if(aux == null){ 
                    buscado = "No hay coincidencias";  
                    break;
                }
                comparado = aux.getCodigo();
                if(idReporte == comparado){ 
                    buscado = "Producto afectado: "+ aux.getProducto()+ "\nProveedor responsable: " + aux.getProveedor() + "\nDetalles del reporte: " + aux.getDescripcion();
                    break;
                }
                posicion ++;
                aux = aux.getAptSiguiente();
            }
            
        }return buscado;
    }
}

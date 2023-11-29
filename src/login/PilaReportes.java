package login;



public class PilaReportes {
    public NodoReportes PilaReportes; 
    
    public PilaReportes(){
        PilaReportes = null; 
    } 
    
    public void push(String f,int c, String cn){
        NodoReportes nuevo = new NodoReportes(f,c, cn );
        
        
        if(PilaReportes == null){
            PilaReportes = nuevo; 
        }else{
            NodoReportes aux = PilaReportes; 
            PilaReportes = nuevo; 
            nuevo.setAptSiguiente(aux);
            
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
}

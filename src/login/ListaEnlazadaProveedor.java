
package login;


import java.util.List;
import java.util.ArrayList;

public class ListaEnlazadaProveedor {
    private NodoProveedor cabeza;

    public ListaEnlazadaProveedor() {
        this.cabeza = null;
    }

    public void agregarProveedor(Proveedor proveedor) {
        NodoProveedor nuevoNodo = new NodoProveedor(proveedor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoProveedor temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public NodoProveedor getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoProveedor cabeza) {
        this.cabeza = cabeza;
    }
    
    public List<Proveedor> getProveedores() {
        List<Proveedor> proveedores = new ArrayList<>();
        NodoProveedor temp = cabeza;
        while (temp != null) {
            proveedores.add(temp.proveedor);
            temp = temp.siguiente;
        }
        return proveedores;
    }
}

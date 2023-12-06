package login.Modelo;

import login.Modelo.Proveedor;
import java.util.List;
import java.util.ArrayList;

public class ListaProveedor {
    private NodoProveedor cabeza;

    public ListaProveedor() {
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
    

    public Proveedor buscarProveedorPorNombre(String nombre) {
        NodoProveedor nodoActual = cabeza;

        while (nodoActual != null) {
            if (nodoActual.proveedor.getNombreProveedor().equals(nombre)) {
                return nodoActual.proveedor;
            }
            nodoActual = nodoActual.siguiente;
        }

        return null;
    }
    
        public Proveedor obtenerProveedorPorIndice(int indiceProveedor) {
        NodoProveedor nodoActual = cabeza;
        int contador = 0;

        while (nodoActual != null) {
            if (contador == indiceProveedor) {
                return nodoActual.proveedor;
            }
            nodoActual = nodoActual.siguiente;
            contador++;
        }

        return null;
    }

    public boolean eliminarProveedor(String nombre) {
        if (cabeza == null) {
            return false; 
        }

        if (cabeza.proveedor.getNombreProveedor().equalsIgnoreCase(nombre)) {
            cabeza = cabeza.siguiente;
            return true;
        }

        NodoProveedor temp = cabeza;
        while (temp.siguiente != null) {
            if (temp.siguiente.proveedor.getNombreProveedor().equalsIgnoreCase(nombre)) {
                temp.siguiente = temp.siguiente.siguiente;
                return true; 
            }
            temp = temp.siguiente;
        }
        return false; 
    }

}

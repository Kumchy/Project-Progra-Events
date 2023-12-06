/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

// Clase ListaEnlazadaProveedor

import java.util.List;
import java.util.ArrayList;

public class ListaEnlazadaProveedor {
    private NodoProveedor cabeza;

    // Constructor
    public ListaEnlazadaProveedor() {
        this.cabeza = null;
    }

    // Método para agregar un proveedor al final de la lista
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

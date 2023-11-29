/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

// Clase ListaEnlazadaProveedor

import java.util.List;
import java.util.ArrayList;

public class ListaEnlazadaProveedor {
    private NodoProveedor inicio;
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
            NodoProveedor actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    // Método para imprimir la lista de proveedores
    public void imprimirLista() {
        NodoProveedor actual = cabeza;
        while (actual != null) {
            System.out.println("Nombre del proveedor: " + actual.getProveedor().getNombreProveedor());
            System.out.println("Teléfono: " + actual.getProveedor().getTelefono());
            // Imprimir otros detalles del proveedor si es necesario
            actual = actual.getSiguiente();
        }
    }
    
    public List<Proveedor> obtenerListaProveedores() {
        List<Proveedor> listaProveedores = new ArrayList<>();
        NodoProveedor actual = inicio;
        while (actual != null) {
            listaProveedores.add(actual.getProveedor());
            actual = actual.getSiguiente();
        }
        return listaProveedores;
    }
}

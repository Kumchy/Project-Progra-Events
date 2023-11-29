/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

// Clase NodoProveedor
public class NodoProveedor {
    private Proveedor proveedor;
    private NodoProveedor siguiente;

    // Constructor que toma un proveedor como argumento
    public NodoProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
        this.siguiente = null;
    }

    // Métodos getter y setter
    public Proveedor getProveedor() {
        return proveedor;
    }

    public NodoProveedor getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoProveedor siguiente) {
        this.siguiente = siguiente;
    }
}

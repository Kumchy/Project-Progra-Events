/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

// Clase NodoProveedor
public class NodoProveedor {
    Proveedor proveedor;
    NodoProveedor siguiente;

    public NodoProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
        this.siguiente = null;
    }
}

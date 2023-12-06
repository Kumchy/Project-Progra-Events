
package login.Modelo;

import login.Modelo.Proveedor;

public class NodoProveedor {
    Proveedor proveedor;
    NodoProveedor siguiente;

    public NodoProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
        this.siguiente = null;
    }
}

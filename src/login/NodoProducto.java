
package login;

public class NodoProducto {
    ProductoElectrónico producto;
    NodoProducto siguiente;

    public NodoProducto(ProductoElectrónico producto) {
        this.producto = producto;
        this.siguiente = null;
    }
}

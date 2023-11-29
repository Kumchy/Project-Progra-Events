
package login;
import java.util.ArrayList;
import java.util.List;

public class ListaProductos {
        private NodoProducto cabeza;

    public ListaProductos() {
        this.cabeza = null;
    }

    public void agregarProducto(ProductoElectrónico producto) {
        NodoProducto nuevoNodo = new NodoProducto(producto);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoProducto temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }
 
        public NodoProducto getCabeza() {
        return cabeza;
    }
    
    public List<ProductoElectrónico> getProductos() {
        List<ProductoElectrónico> productos = new ArrayList<>();
        NodoProducto temp = cabeza;
        while (temp != null) {
            productos.add(temp.producto);
            temp = temp.siguiente;
        }
        return productos;
    }
}

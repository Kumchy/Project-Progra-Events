package login.Vista;
import login.Modelo.ProductoElectrónico;
import java.util.ArrayList;
import java.util.List;

public class ModeloListaProducto {
    private ModeloNodoProducto cabeza;

    public ModeloListaProducto() {
        this.cabeza = null;
    }

    public void agregarProducto(ProductoElectrónico producto) {
        ModeloNodoProducto nuevoNodo = new ModeloNodoProducto(producto);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            ModeloNodoProducto temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }
    
    public ProductoElectrónico buscarProductoPorCodigo(int codigo) {
    ModeloNodoProducto nodoActual = cabeza;

    while (nodoActual != null) {
        if (nodoActual.producto.getCodigo() == codigo) {
            return nodoActual.producto;
        }
        nodoActual = nodoActual.siguiente;
    }

    return null;
    }
    
        public ProductoElectrónico obtenerProductoPorIndice(int indiceProducto) {
        ModeloNodoProducto nodoActual = cabeza;
        int contador = 0;

        while (nodoActual != null) {
            if (contador == indiceProducto) {
                return nodoActual.producto;
            }
            nodoActual = nodoActual.siguiente;
            contador++;
        }

        return null;
    }
 
    public ModeloNodoProducto getCabeza() {
        return cabeza;
    }

    public void setCabeza(ModeloNodoProducto cabeza) {
        this.cabeza = cabeza;
    }
    
    public List<ProductoElectrónico> getProductos() {
        List<ProductoElectrónico> productos = new ArrayList<>();
        ModeloNodoProducto temp = cabeza;
        while (temp != null) {
            productos.add(temp.producto);
            temp = temp.siguiente;
        }
        return productos;
    }
    
    
}

    

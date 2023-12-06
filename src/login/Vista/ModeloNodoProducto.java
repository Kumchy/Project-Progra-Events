
package login.Vista;

import login.Modelo.ProductoElectrónico;

public class ModeloNodoProducto {
    ProductoElectrónico producto;
    ModeloNodoProducto siguiente;

    public ModeloNodoProducto(ProductoElectrónico producto) {
        this.producto = producto;
        this.siguiente = null;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

// Clase Proveedor
public class Proveedor {
    private String nombreProveedor;
    private String contacto;
    private int telefono;
    private String correoElectronico;
    private String productosSuministrados;

    // Constructor
    public Proveedor(String nombreProveedor, String contacto, int telefono, String correoElectronico, String productosSuministrados) {
        this.nombreProveedor = nombreProveedor;
        this.contacto = contacto;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.productosSuministrados = productosSuministrados;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getProductosSuministrados() {
        return productosSuministrados;
    }

    public void setProductosSuministrados(String productosSuministrados) {
        this.productosSuministrados = productosSuministrados;
    }

    
}

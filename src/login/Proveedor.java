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

    // Métodos getter y setter para el atributo "telefono"
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // Métodos getter y setter para el atributo "nombreProveedor"
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    // Otros métodos getter y setter para los atributos restantes si es necesario
}

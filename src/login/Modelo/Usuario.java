package login.Modelo;

public class Usuario {
    private String Usuario;
    private String Password;
    private String Correo;
    private String Rol;
    private String Edad;

    public Usuario(String Usuario, String Password, String Correo, String Rol, String Edad) {
        this.Usuario = Usuario;
        this.Password = Password;
        this.Correo = Correo;
        this.Rol = Rol;
        this.Edad = Edad;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    
    
}

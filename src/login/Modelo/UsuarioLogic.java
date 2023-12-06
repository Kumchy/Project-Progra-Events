package login.Modelo;

import login.Modelo.UsuarioReg;
import login.Modelo.Usuario;

public class UsuarioLogic {
    private static UsuarioReg usuarioReg = new UsuarioReg();  
    
    public static boolean autentificar(String usuario, String password) {
        if (usuario.equals("admin") && password.equals("123")) {
            return true;
        }

        if (obtener(usuario) != null) {
            Usuario usuarioConsulta = obtener(usuario);
            return usuarioConsulta.getUsuario().equals(usuario) && usuarioConsulta.getPassword().equals(password);
        } else {
            return false;
        }
    }
    
    public static boolean insertar(Usuario usuario){
        return usuarioReg.insertar(usuario);
    }
    
    public static boolean modificar(Usuario usuario){
        return usuarioReg.modificar(usuario);
        
    }
    
    public static boolean eliminar(String usuario){
        return usuarioReg.eliminar(usuario);
        
    }
    
    public static Usuario obtener(String usuario){
        return usuarioReg.obtener(usuario);
        
    }
    public static Usuario buscar(String usuario){
        return usuarioReg.buscarlo(usuario);
}
}

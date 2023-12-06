package login.Modelo;

import java.util.ArrayList;
import java.util.List;
import login.Modelo.Usuario;

public class UsuarioReg {
     private List<Usuario> usuarios;

    public UsuarioReg() {
        usuarios = new ArrayList<>();  
    }
    
    public int buscar(String usuario){
        int n= -1;
        for(int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getUsuario().equals(usuario)){
                n=i;
            }
        }
        return n;
    }
    
    public Usuario buscarlo(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsuario().equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }
    
    public boolean insertar(Usuario usuario){
        if (buscar(usuario.getUsuario())==-1){
            usuarios.add(usuario);
            return true;
        } else{
            return false;
        }
    }
    
    public boolean modificar(Usuario usuario){
        //-1 significa que si se ha encontrado el usuario
        if (buscar(usuario.getUsuario())!=-1){
            Usuario usuarioaux= obtener (usuario.getUsuario());
            
            usuarioaux.setPassword(usuario.getPassword());
            usuarioaux.setCorreo(usuario.getCorreo());
            usuarioaux.setRol(usuario.getRol());
            usuarioaux.setEdad(usuario.getEdad());
            
            return true;
        } else{
            return false;
        }    
    }
    
    public boolean eliminar(String usuario){
        if (buscar(usuario)!=-1){
            usuarios.remove(buscar(usuario));
            
            return true;
        } else{
            return false;
        }
    }
    
    public Usuario obtener(String usuario){
        if (buscar(usuario)!=-1){
            return usuarios.get(buscar(usuario));
        }else{
            return null;
        }
    }
}

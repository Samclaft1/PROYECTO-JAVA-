
package controlador;

import bd.Conexion;
import clases.Usuario;
import dao.UsuarioD;
import java.util.List;

/**
 *
 * @author scamp
 */
public class UsuarioC {
    
    private final UsuarioD usuarioD;
    
    public UsuarioC() throws Exception {
        this.usuarioD = new UsuarioD(new Conexion().obtenerConexionOracle());
    }
    
    public List<Usuario> listar() {
        return usuarioD.listar();
    }
    
     public List<Usuario> listar(String categoriaUsuario) {
        return usuarioD.listar(categoriaUsuario);
    }
     
     public List<Usuario> listar(String nombreUsuario, String password) {
        return usuarioD.listar(nombreUsuario, password);
    }
    
     public void guardar(Usuario usuario) {
       usuarioD.guardar(usuario);
    }
     
     public int actualizar(Integer idUsuario, String nombreUsuario,
            String categoriaUsuario, String password) {
        return usuarioD.actualizar(idUsuario, nombreUsuario, categoriaUsuario, password);
    }
     
     public int eliminar(Integer IdUsuario) {
        return usuarioD.eliminar(IdUsuario);
    }
    
}

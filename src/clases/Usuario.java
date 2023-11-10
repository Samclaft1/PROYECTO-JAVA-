
package clases;

/**
 *
 * @author scamp
 */
public class Usuario {
    private String nombre;
    private String password;

    //CONSTRUCTORES
    public Usuario() {
    }

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }
    
    //GETTERYSETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", password=" + password + '}';
    }
    
    
    
}

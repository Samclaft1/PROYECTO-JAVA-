
package clases;

/**
 *
 * @author scamp
 */
public class Reserva {
    private String idreserva;
    private String nombre;
    private String apellido;
    private String correo;
    private int precio;

    //COSNTRUCTORES
    public Reserva() {
    }

    public Reserva(String idreserva, String nombre, String apellido, String correo, int precio) {
        this.idreserva = idreserva;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.precio = precio;
    }
    
    //GETTER Y SETTERS

    public String getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(String idreserva) {
        this.idreserva = idreserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return "Reserva{" + "idreserva=" + idreserva + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", precio=" + precio + '}';
    }
    
    
    
    
}


package clases;

/**
 *
 * @author scamp
 */
public class Huesped extends Reserva {
    private String nombre;
    private String apellido;
    private int celular;

    public Huesped() {
    }

    public Huesped(String nombre, String apellido, int celular, String idreserva, String checkin, String checkout, String precio, boolean desayuno, boolean vip, int nrocamas) {
        super(idreserva, checkin, checkout, precio, desayuno, vip, nrocamas);
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Huesped{" + "nombre=" + nombre + ", apellido=" + apellido + ", celular=" + celular + '}';
    }
    
    
    
    
}

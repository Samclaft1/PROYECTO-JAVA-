
package clases;

/**
 *
 * @author scamp
 */
public class Reserva {
    private String idreserva;
    private String checkin;
    private String checkout;
    private String precio;

    public Reserva() {
    }

    public Reserva(String idreserva, String checkin, String checkout, String precio) {
        this.idreserva = idreserva;
        this.checkin = checkin;
        this.checkout = checkout;
        this.precio = precio;
    }

    public String getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(String idreserva) {
        this.idreserva = idreserva;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idreserva=" + idreserva + ", checkin=" + checkin + ", checkout=" + checkout + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
}


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
    private boolean desayuno;
    private boolean vip;
    private int nrocamas;

    //CONSTRUCTORES
    public Reserva() {
    }

    public Reserva(String idreserva, String checkin, String checkout, String precio, boolean desayuno, boolean vip, int nrocamas) {
        this.idreserva = idreserva;
        this.checkin = checkin;
        this.checkout = checkout;
        this.precio = precio;
        this.desayuno = desayuno;
        this.vip = vip;
        this.nrocamas = nrocamas;
    }
    
    //GETTER Y SETTERS

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

    public boolean isDesayuno() {
        return desayuno;
    }

    public void setDesayuno(boolean desayuno) {
        this.desayuno = desayuno;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getNrocamas() {
        return nrocamas;
    }

    public void setNrocamas(int nrocamas) {
        this.nrocamas = nrocamas;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Reserva{" + "idreserva=" + idreserva + ", checkin=" + checkin + ", checkout=" + checkout + ", precio=" + precio + ", desayuno=" + desayuno + ", vip=" + vip + ", nrocamas=" + nrocamas + '}';
    }
    
    
    
    
    
    
    

    
    
    
    
    
    
}

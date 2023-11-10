
package clases;
/**
 *
 * @author scamp
 */
public class Habitacion {
    private int numerohab;
    private boolean disponible;
    private int nrocamas;

    //CONSTRUCTOR
    public Habitacion() {
    }

    public Habitacion(int numerohab, boolean disponible, int nrocamas) {
        this.numerohab = numerohab;
        this.disponible = disponible;
        this.nrocamas = nrocamas;
    }

    //GETTER Y SETTERS
    public int getNumerohab() {
        return numerohab;
    }

    public void setNumerohab(int numerohab) {
        this.numerohab = numerohab;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getNrocamas() {
        return nrocamas;
    }

    public void setNrocamas(int nrocamas) {
        this.nrocamas = nrocamas;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numerohab=" + numerohab + ", disponible=" + disponible + ", nrocamas=" + nrocamas + '}';
    }
    
    

    
    
    
    
}

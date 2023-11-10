
package clases;

/**
 *
 * @author scamp
 */
public class HabitacionSimple extends Habitacion {
        private int nroadulto;
        private int nroniño;

        //CONSTRUCTOR
    public HabitacionSimple() {
    }

    public HabitacionSimple(int nroadulto, int nroniño, int numerohab, boolean disponible, int nrocamas) {
        super(numerohab, disponible, nrocamas);
        this.nroadulto = nroadulto;
        this.nroniño = nroniño;
    }

    //GETTER Y SETTERS
    public int getNroadulto() {
        return nroadulto;
    }

    public void setNroadulto(int nroadulto) {
        this.nroadulto = nroadulto;
    }

    public int getNroniño() {
        return nroniño;
    }

    public void setNroniño(int nroniño) {
        this.nroniño = nroniño;
    }

    //TO STRING
    @Override
    public String toString() {
        return "HabitacionSimple{" + "nroadulto=" + nroadulto + ", nroni\u00f1o=" + nroniño + '}';
    }
    
    
                
    
    

    
    
}

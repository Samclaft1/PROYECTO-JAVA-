
package clases;

/**
 *
 * @author scamp
 */
public class HabitacionVip extends Habitacion{
    private boolean jacuzzi;
    private boolean desayuno;

    //CONSTRUCTORES
    public HabitacionVip() {
    }

    public HabitacionVip(boolean jacuzzi, boolean desayuno, int numerohab, boolean disponible, int nrocamas) {
        super(numerohab, disponible, nrocamas);
        this.jacuzzi = jacuzzi;
        this.desayuno = desayuno;
    }

    //GETTER Y SETTERS
    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public boolean isDesayuno() {
        return desayuno;
    }

    public void setDesayuno(boolean desayuno) {
        this.desayuno = desayuno;
    }

    //TO STRING
    @Override
    public String toString() {
        return "HabitacionVip{" + "jacuzzi=" + jacuzzi + ", desayuno=" + desayuno + '}';
    }
    
    

    
    
    
    
}

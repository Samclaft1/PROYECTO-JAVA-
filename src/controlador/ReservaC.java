
package controlador;

import bd.Conexion;
import clases.Reserva;
import dao.HuespedD;
import dao.ReservaD;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author scamp
 */
public class ReservaC {
    
   private final ReservaD reservaD;
   
   public ReservaC() throws Exception {
        this.reservaD = new ReservaD(new Conexion().obtenerConexionOracle());
    }
   
    public List<Reserva> listar() {
        return reservaD.listar();
    }
    
     public List<Reserva> listar(String idReserva) {
        return reservaD.listar(idReserva);
    }
     
     public void guardar(Reserva reserva) {
        reservaD.guardar(reserva);
    }
     
     public int actualizar(String idReserva, Date fechaEntrada,
            Date fechaSalida, double valorReserva, String formaPago) {
        return reservaD.actualizar(idReserva, fechaEntrada, fechaSalida, valorReserva, formaPago);
    }
     
    
    
    
    
    
    
    
}

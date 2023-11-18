
package controlador;

import bd.Conexion;
import clases.Huesped;
import dao.HuespedD;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author scamp
 */
public class HuespedC {
    
    private final HuespedD huespedD;
    
    public HuespedC() throws Exception {
        this.huespedD = new HuespedD(new Conexion().obtenerConexionOracle());
    }
    
    public List<Huesped> listar() {
        return huespedD.listar();
    }
    
     public List<Huesped> listar(String apellido) {
        return huespedD.listar(apellido);
    }
     
     public void guardar(Huesped huesped, String idReserva) {
        huesped.setIdReserva(idReserva);
        huespedD.guardar(huesped);
    }
     
     public int actualizar(Integer idHuesped, String nombre, String apellido, Date fechaNacimiento,
            String nacionalidad, String telefono) {
        return huespedD.actualizar(idHuesped, nombre, apellido, fechaNacimiento, nacionalidad, telefono);
    }
     
     public int eliminar(Integer idHuesped, String idReserva) {
        return huespedD.eliminar(idHuesped, idReserva);
    }
     
    
    
    
}

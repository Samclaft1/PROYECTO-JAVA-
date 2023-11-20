
package validaciones;

import clases.Usuario;
import com.toedter.calendar.JDateChooser;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

/**
 *
 * @author scamp
 */
public class Validacion {

   
    
    public static boolean HuespedValido(String nombre,
            String apellido, JDateChooser fechaNac, String tel) {
        String regexNombre = "^(?=.{3,25}$)([A-ZÁÉÍÓÚ][a-záéíóúñ]+(?:[\\s]{1}[A-ZÁÉÍÓÚ][a-záéíóúñ]+)*)$";
        String regexTel = "^([\\d]{2}[\\-]){4}[\\d]{2}$";
        Pattern patternNombre = Pattern.compile(regexNombre);
        Pattern patternTelefono = Pattern.compile(regexTel);
        Matcher matchNombre = patternNombre.matcher(nombre);
        Matcher matchApellido = patternNombre.matcher(apellido);
        Matcher matchTelefono = patternTelefono.matcher(tel);
        if (!matchNombre.find()) {
            desplegarMensajeError(
                    "Nombre inválido",
                    "1. El nombre debe contener la primer letra mayúscula:\n"
                    + "John\n"
                    + "2. De igual forma si es un nombre compuesto:\n"
                    + "John Doe\n"
                    + "3. Si es un sólo nombre verifique que no hayan espacios en blanco antes o después."
            );
            return false;
        } else if (!matchApellido.find()) {
            desplegarMensajeError(
                    "Apellido inválido.",
                    "1. El apellido debe contener la primer letra mayúscula:\n"
                    + "Reyes\n"
                    + "2. De igual forma si es un apellido compuesto:\n"
                    + "Reyes Hernández\n"
                    + "3. Si es un sólo apellido verifique que no hayan espacios en blanco antes o después."
            );
            return false;
        } else if ((fechaNac.getDate() == null)) {
            desplegarMensajeError("Fecha inválida.", "El campo fecha está vacío.");
            return false;
        } else if (esMayorDeEdad(fechaNac.getDate())) {
            desplegarMensajeError("Fecha inválida", "Es menor de edad.");
            return false;
        } else if (!matchTelefono.find()) {
            desplegarMensajeError(
                    "Teléfono inválido.",
                    "El formato admitido debe contener 10 dígitos,\n"
                    + "incluyendo la clave teléfonica del estado, separados por guiones(-):\n"
                    + "55-43-22-22-43"
            );
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean ReservaValido(JDateChooser fechaEntrada,
            JDateChooser fechaSalida, String valor, JComboBox<String> formaPago) {
        if ((fechaEntrada.getDate() == null) && (fechaSalida.getDate() == null)) {
            desplegarMensajeError("Fechas inválidas.",
                    "Por favor, seleccione las fechas de entrada y salida.\n"
                    + "Puede escribir la fecha manualmente si cumple con el siguiente formato:\n"
                    + "dd/mm/yyyy"
            );
            return false;
        } else if (valor.equals("0.0")) {
            desplegarMensajeError(
                    "Valor de reserva en cero.",
                    "Por favor, seleccione las fechas de entrada y salida\n"
                    + "para efectuar el total monetario de la reserva.");
            return false;
        } else if (formaPago.getSelectedIndex() == 0) {
            desplegarMensajeError("Selección de pago inválida.", "Por favor, seleccione una forma de pago.");
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean UsuarioValido(String nombreUsuario,
            JComboBox<String> categoriaUsuario, JPasswordField password) {
        if (nombreUsuario.isEmpty()) {
            desplegarMensajeError(
                    "Nombre de Usuario inválido.",
                    "El campo nombre de usuario está vacío."
            );
            return false;
        } else if (categoriaUsuario.getSelectedIndex() == 0) {
            desplegarMensajeError(
                    "Categoría de Usuario inválida.",
                    "Seleccione una categoría de usuario."
            );
            return false;
        } else if (password.getPassword().length == 0) {
            desplegarMensajeError("Contraseña inválida.",
                    "El campo contraseña está vacío.");
            return false;
        } else if (password.getPassword().length > 30) {
            desplegarMensajeError("Contraseña inválida.",
                    "La contraseña es demadiado larga, sólo\n"
                    + "debe tener 30 carácteres.");
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean esUsuarioCorrecto(Usuario usuario, String nombreUsuario, JPasswordField password) {
        if (!nombreUsuario.equals(usuario.getNombreUsuario())) {
            desplegarMensajeError("Usuario incorrecto.",
                    "El usuario ingresado es incorrecto."
            );
            return false;
        } else if (String.valueOf(password.getPassword()).equals(usuario.getPassword())) {
            desplegarMensajeError("Contraseña incorrecta.",
                    "La contraseña ingresada es incorrecta."
            );
            return false;
        } else {
            return true;
        }
    }

    private static void desplegarMensajeError(String fecha_inválida, String el_campo_fecha_está_vacío) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static boolean esMayorDeEdad(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

   
    
    
}

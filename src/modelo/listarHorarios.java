package modelo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.table.DefaultTableModel;
import static modelo.Horarios.*;
import static view.tutorview.tablaJuan;



/**
 *
 * @author Juanes
 */
public class listarHorarios {

   public static boolean validarHora(String horaTexto) {
        try {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime.parse(horaTexto.trim(), formato);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    
    public static void cargarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) tablaJuan.getModel(); //Lo que hago es obtener el modelo de la tablaUsu que son el nombre apellido y cedula
        modelo.setRowCount(0);
        for (int i = 0; i < contadorHorario; i++) {
            modelo.addRow(new Object[]{
                horario[i].dia,
                horario[i].hora,
                horario[i].salon,
            });
        }
        
    }

}

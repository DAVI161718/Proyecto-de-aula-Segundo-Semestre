package modelo; 



import javax.swing.table.DefaultTableModel;
import static modelo.Horarios.*;
import static modelo.tutorview.tabla_horario;

/**
 *
 * @author Juanes
 */
public class listarHorarios {

    public static void cargarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) tabla_horario.getModel(); //Lo que hago es obtener el modelo de la tablaUsu que son el nombre apellido y cedula
        for (int i = 0; i < contadorUsuarios; i++) {
            /*Aqui se listan los usuarios
            El new Object crea una fila con los valores guardados en el Areglo
            */
            modelo.addRow(new Object[]{
                usuario[i].nombre,
                usuario[i].apellido,
                usuario[i].cedula,
            });
        }
    }

}

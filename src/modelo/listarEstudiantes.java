
package modelo;

import javax.swing.table.DefaultTableModel;
import static modelo.listaEstudiantes.*;
import static view.tutorview.*;

/**
 *
 * @author Juanes
 */
public class listarEstudiantes {
    
     public static void cargarDatos() {
        DefaultTableModel modelo1 = (DefaultTableModel) tablaListar.getModel();
        //Lo que hago es obtener el modelo :)
        modelo1.setRowCount(0);
        for (int i = 0; i < contadorEstudiantes; i++) {
            String[] fila = {
                estudiante[i].nombre,
                estudiante[i].identificacion,
                estudiante[i].email,
                estudiante[i].celular
            };

            modelo1.addRow(fila);
        }

    } 
    
}

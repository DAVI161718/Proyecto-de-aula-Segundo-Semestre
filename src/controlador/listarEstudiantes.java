package controlador;

import javax.swing.table.DefaultTableModel;
import static modelo.Usuarios.*;
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
        for (int i = 0; i < contadorUsu; i++) {

            if (usuario[i].estado.equals("Activo")) {
                String[] fila = {
                    usuario[i].semestre,
                    usuario[i].nombre,
                    usuario[i].cedula,
                    usuario[i].celular
                        
                };
                modelo1.addRow(fila);
            }

        }

    }

}

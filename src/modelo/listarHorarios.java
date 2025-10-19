package modelo;

import javax.swing.table.DefaultTableModel;
import static modelo.Horarios.*;
import static view.tutorview.*;

/**
 *
 * @author Juanes
 */
public class listarHorarios {

    public static void cargarDatos() {
        DefaultTableModel modelo1 = (DefaultTableModel) tablaJuan.getModel();
        //Lo que hago es obtener el modelo de la tablaUsu que son el nombre apellido y cedula
        modelo1.setRowCount(0);
        for (int i = 0; i < contadorHorario; i++) {
            String[] fila = {
                horario[i].dia,
                horario[i].mes,
                horario[i].hora,
                horario[i].salon
            };

            modelo1.addRow(fila);
        }

    }

    public static void cargarDatos2() {
        DefaultTableModel modelo1 = (DefaultTableModel) ver_tablaHorario.getModel();
        //Lo que hago es obtener el modelo de la tablaUsu que son el nombre apellido y cedula
        modelo1.setRowCount(0);
        for (int i = 0; i < contadorHorario; i++) {
            String[] fila = {
                horario[i].dia,
                horario[i].mes,
                horario[i].hora,
                horario[i].salon
            };
            modelo1.addRow(fila);
        }

    }

    public static void cargarDatos3() {
        DefaultTableModel modelo1 = (DefaultTableModel) delate_Horario.getModel();
        //Lo que hago es obtener el modelo de la tablaUsu que son el nombre apellido y cedula
        modelo1.setRowCount(0);
        for (int i = 0; i < contadorHorario; i++) {
            String[] fila = {
                horario[i].dia,
                horario[i].mes,
                horario[i].hora,
                horario[i].salon
            };

            modelo1.addRow(fila);
        }

    }
}

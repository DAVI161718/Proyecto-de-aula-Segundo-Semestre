package controlador;

import javax.swing.table.DefaultTableModel;
import static modelo.Horarios.*;
import static modelo.Notas.*;
import static view.estudiantesView.*;

public class listarPanelEstudiante {

    public static void listarHorarioEstudiante(String semestre) {
        DefaultTableModel modelo1 = (DefaultTableModel) tabla_horarioESTU.getModel();
        modelo1.setRowCount(0);
        for (int i = 0; i < contadorHorario; i++) {
            if (horario[i].semestre.equals(semestre)) {
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

    public static void listarNotaEstudiante(String semestre) {
        DefaultTableModel modelo1 = (DefaultTableModel) tabla_notaESTU.getModel();
        modelo1.setRowCount(0);
        for (int i = 0; i < contadorNotas; i++) {
            if (nota[i].semestre.equals(semestre)) {
                String[] fila = {
                    nota[i].mensaje,};
                modelo1.addRow(fila);
            }
        }
    }
}

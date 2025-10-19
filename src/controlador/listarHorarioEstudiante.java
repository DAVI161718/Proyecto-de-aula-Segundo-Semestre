package controlador;

import javax.swing.table.DefaultTableModel;
import static modelo.Horarios.*;
import static view.estudiantesView.*;

public class listarHorarioEstudiante {
    public static void listarHorarioEstudiante(){
        DefaultTableModel modelo1 = (DefaultTableModel) tabla_horarioESTU.getModel();
        modelo1.setRowCount(0);
        for (int i = 0; i < contadorHorario; i++) {
            String[] fila = {
                horario[i].dia,
                horario[i].hora,
                horario[i].salon
            };
            modelo1.addRow(fila);
        }
    }
}

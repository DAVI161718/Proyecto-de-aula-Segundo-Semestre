package controlador;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static modelo.Horarios.*;
import static view.tutorview.delate_Horario;
import static view.tutorview.tablaJuan;
import static view.tutorview.ver_tablaHorario;

/**
 *
 * @author Juanes
 */
public class authHorario {

    public static boolean validarDias(String dia) {

        if (dia.matches("\\d{1,2}")) {
            int numero = Integer.parseInt(dia);
            if (numero >= 1 && numero <= 31) {
                return true; // válido
            } else {
                JOptionPane.showMessageDialog(null, "El número no puede ser mayor que 31");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar solo números (uno o dos dígitos)");
            return false;
        }
    }

    public static boolean validarMes(String mes) {

        if (mes.matches("\\d{1,2}")) {
            int numero = Integer.parseInt(mes);
            if (numero >= 1 && numero <= 12) {
                return true; // válido
            } else {
                JOptionPane.showMessageDialog(null, "El número de meses máximos es 12.");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar solo números (uno o dos dígitos.)");
            return false;
        }
    }
    public void delateHorario(JTable delate_Horario, JTable tablaJuan, JTable ver_tablaHorario) {                                              
        try {
            DefaultTableModel modeloPrincipal = (DefaultTableModel) delate_Horario.getModel();
            int filaSeleccionada = delate_Horario.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para eliminar");
                return;
            }

            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar este horario?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION
            );

            if (confirmacion == JOptionPane.YES_OPTION) {
                modeloPrincipal.removeRow(filaSeleccionada);

                // Eliminar la misma fila (si existe) en las otras tablas
                try {
                    DefaultTableModel modeloJuan = (DefaultTableModel) tablaJuan.getModel();
                    if (filaSeleccionada < modeloJuan.getRowCount()) {
                        modeloJuan.removeRow(filaSeleccionada);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar en tablaJuan: " + e.getMessage());
                }

                try {
                    DefaultTableModel modeloVer = (DefaultTableModel) ver_tablaHorario.getModel();
                    if (filaSeleccionada < modeloVer.getRowCount()) {
                        modeloVer.removeRow(filaSeleccionada);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar en ver_tablaHorario: " + e.getMessage());
                }

                JOptionPane.showMessageDialog(null, "Horario eliminado correctamente");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el horario: " + e.getMessage());
        }
    }
      public static boolean validarHora(String hora) {
        // Formato HH:mm (ejemplo: 08:30 o 23:45)
        if (!hora.matches("^([01]\\d|2[0-3]):([0-5]\\d)$")) {
            JOptionPane.showMessageDialog(null,
                    "Hora inválida. Usa el formato HH:mm (por ejemplo 08:30 o 23:45)",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean validarIgualdad(String hora, String salon) {
        for (int i = 0; i < contadorHorario; i++) {
            if (horario[i].hora.equals(hora) && horario[i].salon.equals(salon)) {
                JOptionPane.showMessageDialog(null, "Hora y salón ya ocupados");
                return true;
            }
        }
        return false;

    }
}



  

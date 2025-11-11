package controlador;

import javax.swing.table.DefaultTableModel;
import static modelo.Horarios.*;
import static view.tutorview.*;

/**
 *
 * @author Juanes
 */
public class listarHorarios {

    public static void cargarDatos1() {
        DefaultTableModel modelo1 = (DefaultTableModel) tablaJuan.getModel();
        //Lo que hago es obtener el modelo de la tablaUsu que son el nombre apellido y cedula
        modelo1.setRowCount(0);
        for (int i = 0; i < contadorHorario; i++) {
            String[] fila = {
                horario[i].dia,
                horario[i].mes,
                horario[i].hora,
                horario[i].salon,
                horario[i].semestre,};

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
                horario[i].salon,
                horario[i].semestre,};
            modelo1.addRow(fila);
        }

    }

    public static void cargarDatos3() {
        DefaultTableModel modelo1 = (DefaultTableModel) delate_Horario.getModel();
        modelo1.setRowCount(0);
        for (int i = 0; i < contadorHorario; i++) {
            String[] fila = {
                horario[i].dia,
                horario[i].mes,
                horario[i].hora,
                horario[i].salon,
                horario[i].semestre,};

            modelo1.addRow(fila);
        }

    }

    public static void listarHorarioSemestre(String semestre) {

        switch (semestre) {
            case "Semestre 1":
                DefaultTableModel modelo1 = (DefaultTableModel) ver_tablaHorario.getModel();

                modelo1.setRowCount(0);
                for (int i = 0; i < contadorHorario; i++) {
                    if (horario[i].semestre.equals(semestre)) {
                        String[] fila = {
                            horario[i].dia,
                            horario[i].hora,
                            horario[i].mes,
                            horario[i].salon,
                            horario[i].semestre};
                        modelo1.addRow(fila);
                    }

                }
                break;

            case "Semestre 2":
                DefaultTableModel modelo2 = (DefaultTableModel) ver_tablaHorario.getModel();

                modelo2.setRowCount(0);
                for (int i = 0; i < contadorHorario; i++) {
                    if (horario[i].semestre.equals(semestre)) {
                        String[] fila = {
                            horario[i].dia,
                            horario[i].hora,
                            horario[i].mes,
                            horario[i].salon,
                            horario[i].semestre};
                        modelo2.addRow(fila);
                    }

                }
                break;

            case "Semestre 3":
                DefaultTableModel modelo3 = (DefaultTableModel) ver_tablaHorario.getModel();

                modelo3.setRowCount(0);
                for (int i = 0; i < contadorHorario; i++) {
                    if (horario[i].semestre.equals(semestre)) {
                        String[] fila = {
                            horario[i].dia,
                            horario[i].hora,
                            horario[i].mes,
                            horario[i].salon,
                            horario[i].semestre};
                        modelo3.addRow(fila);
                    }

                }
                break;

            case "Semestre 4":
                DefaultTableModel modelo4 = (DefaultTableModel) ver_tablaHorario.getModel();

                modelo4.setRowCount(0);
                for (int i = 0; i < contadorHorario; i++) {
                    if (horario[i].semestre.equals(semestre)) {
                        String[] fila = {
                            horario[i].dia,
                            horario[i].hora,
                            horario[i].mes,
                            horario[i].salon,
                            horario[i].semestre,};
                        modelo4.addRow(fila);
                    }

                }
                break;

        }

    }

    public static void listarHorarioEliminar(String semestre) {

        switch (semestre) {
            case "Semestre 1":
                DefaultTableModel modelo1 = (DefaultTableModel) delate_Horario.getModel();

                modelo1.setRowCount(0);
                for (int i = 0; i < contadorHorario; i++) {
                    if (horario[i].semestre.equals(semestre)) {
                        String[] fila = {
                            horario[i].dia,
                            horario[i].hora,
                            horario[i].mes,
                            horario[i].salon,
                            horario[i].semestre};
                        modelo1.addRow(fila);
                    }

                }
                break;

            case "Semestre 2":
                DefaultTableModel modelo2 = (DefaultTableModel) delate_Horario.getModel();

                modelo2.setRowCount(0);
                for (int i = 0; i < contadorHorario; i++) {
                    if (horario[i].semestre.equals(semestre)) {
                        String[] fila = {
                            horario[i].dia,
                            horario[i].hora,
                            horario[i].mes,
                            horario[i].salon,
                            horario[i].semestre};
                        modelo2.addRow(fila);
                    }

                }
                break;

            case "Semestre 3":
                DefaultTableModel modelo3 = (DefaultTableModel) delate_Horario.getModel();

                modelo3.setRowCount(0);
                for (int i = 0; i < contadorHorario; i++) {
                    if (horario[i].semestre.equals(semestre)) {
                        String[] fila = {
                            horario[i].dia,
                            horario[i].hora,
                            horario[i].mes,
                            horario[i].salon,
                            horario[i].semestre};
                        modelo3.addRow(fila);
                    }

                }
                break;

            case "Semestre 4":
                DefaultTableModel modelo4 = (DefaultTableModel) delate_Horario.getModel();

                modelo4.setRowCount(0);
                for (int i = 0; i < contadorHorario; i++) {
                    if (horario[i].semestre.equals(semestre)) {
                        String[] fila = {
                            horario[i].dia,
                            horario[i].hora,
                            horario[i].mes,
                            horario[i].salon,
                            horario[i].semestre};
                        modelo4.addRow(fila);
                    }

                }
                break;

        }

    }

    public static void listarHorarioCrear(String semestre) {

        switch (semestre) {
            case "Semestre 1":
                DefaultTableModel modelo1 = (DefaultTableModel) tablaJuan.getModel();

                modelo1.setRowCount(0);
                for (int i = 0; i < contadorHorario; i++) {
                    if (horario[i].semestre.equals(semestre)) {
                        String[] fila = {
                            horario[i].dia,
                            horario[i].hora,
                            horario[i].mes,
                            horario[i].salon,
                            horario[i].semestre};
                        modelo1.addRow(fila);
                    }

                }
                break;

            case "Semestre 2":
                DefaultTableModel modelo2 = (DefaultTableModel) tablaJuan.getModel();

                modelo2.setRowCount(0);
                for (int i = 0; i < contadorHorario; i++) {
                    if (horario[i].semestre.equals(semestre)) {
                        String[] fila = {
                            horario[i].dia,
                            horario[i].hora,
                            horario[i].mes,
                            horario[i].salon,
                            horario[i].semestre};
                        modelo2.addRow(fila);
                    }

                }
                break;

            case "Semestre 3":
                DefaultTableModel modelo3 = (DefaultTableModel) tablaJuan.getModel();

                modelo3.setRowCount(0);
                for (int i = 0; i < contadorHorario; i++) {
                    if (horario[i].semestre.equals(semestre)) {
                        String[] fila = {
                            horario[i].dia,
                            horario[i].hora,
                            horario[i].mes,
                            horario[i].salon,
                            horario[i].semestre};
                        modelo3.addRow(fila);
                    }

                }
                break;

            case "Semestre 4":
                DefaultTableModel modelo4 = (DefaultTableModel) tablaJuan.getModel();

                modelo4.setRowCount(0);
                for (int i = 0; i < contadorHorario; i++) {
                    if (horario[i].semestre.equals(semestre)) {
                        String[] fila = {
                            horario[i].dia,
                            horario[i].hora,
                            horario[i].mes,
                            horario[i].salon,
                            horario[i].semestre};
                        modelo4.addRow(fila);
                    }

                }
                break;

        }

    }

}

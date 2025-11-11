package controlador;

import javax.swing.table.DefaultTableModel;
import static modelo.Notas.contadorNotas;
import static modelo.Notas.nota;
import static view.tutorview.tablaListarNota;
import static view.tutorview.tabla_estudianteEncontrado;
import static view.tutorview.tabla_notasEncontradas;

/**
 *
 * @author Juanes
 */
public class listarSemestre {

    public static void listarNotaSemestre(String semestre) {

        switch (semestre) {
            case "Semestre 1":
                DefaultTableModel modelo1 = (DefaultTableModel) tablaListarNota.getModel();

                modelo1.setRowCount(0);
                for (int i = 0; i < contadorNotas; i++) {
                    if (nota[i].semestre.equals(semestre)) {
                        String[] fila = {
                            nota[i].mensaje,
                            nota[i].semestre,};
                        modelo1.addRow(fila);
                    }

                }
                break;

            case "Semestre 2":
                DefaultTableModel modelo2 = (DefaultTableModel) tablaListarNota.getModel();

                modelo2.setRowCount(0);
                for (int i = 0; i < contadorNotas; i++) {
                    if (nota[i].semestre.equals(semestre)) {
                        String[] fila = {
                            nota[i].mensaje,
                            nota[i].semestre,};
                        modelo2.addRow(fila);
                    }

                }
                break;

            case "Semestre 3":
                DefaultTableModel modelo3 = (DefaultTableModel) tablaListarNota.getModel();

                modelo3.setRowCount(0);
                for (int i = 0; i < contadorNotas; i++) {
                    if (nota[i].semestre.equals(semestre)) {
                        String[] fila = {
                            nota[i].mensaje,
                            nota[i].semestre,};
                        modelo3.addRow(fila);
                    }

                }
                break;

            case "Semestre 4":
                DefaultTableModel modelo4 = (DefaultTableModel) tablaListarNota.getModel();

                modelo4.setRowCount(0);
                for (int i = 0; i < contadorNotas; i++) {
                    if (nota[i].semestre.equals(semestre)) {
                        String[] fila = {
                            nota[i].mensaje,
                            nota[i].semestre,};
                        modelo4.addRow(fila);
                    }

                }
                break;

        }

    }

    public static void listarNotaEliminar(String semestre) {

        switch (semestre) {
            case "Semestre 1":
                DefaultTableModel modelo1 = (DefaultTableModel) tabla_notasEncontradas.getModel();

                modelo1.setRowCount(0);
                for (int i = 0; i < contadorNotas; i++) {
                    if (nota[i].semestre.equals(semestre)) {
                        String[] fila = {
                            nota[i].mensaje,
                            nota[i].semestre,};
                        modelo1.addRow(fila);
                    }

                }
                break;

            case "Semestre 2":
                DefaultTableModel modelo2 = (DefaultTableModel) tabla_notasEncontradas.getModel();

                modelo2.setRowCount(0);
                for (int i = 0; i < contadorNotas; i++) {
                    if (nota[i].semestre.equals(semestre)) {
                        String[] fila = {
                            nota[i].mensaje,
                            nota[i].semestre,};
                        modelo2.addRow(fila);
                    }

                }
                break;

            case "Semestre 3":
                DefaultTableModel modelo3 = (DefaultTableModel) tabla_notasEncontradas.getModel();

                modelo3.setRowCount(0);
                for (int i = 0; i < contadorNotas; i++) {
                    if (nota[i].semestre.equals(semestre)) {
                        String[] fila = {
                            nota[i].mensaje,
                            nota[i].semestre,};
                        modelo3.addRow(fila);
                    }

                }
                break;

            case "Semestre 4":
                DefaultTableModel modelo4 = (DefaultTableModel) tabla_notasEncontradas.getModel();

                modelo4.setRowCount(0);
                for (int i = 0; i < contadorNotas; i++) {
                    if (nota[i].semestre.equals(semestre)) {
                        String[] fila = {
                            nota[i].mensaje,
                            nota[i].semestre,};
                        modelo4.addRow(fila);
                    }

                }
                break;

        }

    }

    public static void listarNotaCrear(String semestre) {

        switch (semestre) {
            case "Semestre 1":
                DefaultTableModel modelo1 = (DefaultTableModel) tabla_estudianteEncontrado.getModel();

                modelo1.setRowCount(0);
                for (int i = 0; i < contadorNotas; i++) {
                    if (nota[i].semestre.equals(semestre)) {
                        String[] fila = {
                            nota[i].mensaje,
                            nota[i].semestre,};
                        modelo1.addRow(fila);
                    }

                }
                break;

            case "Semestre 2":
                DefaultTableModel modelo2 = (DefaultTableModel) tabla_estudianteEncontrado.getModel();

                modelo2.setRowCount(0);
                for (int i = 0; i < contadorNotas; i++) {
                    if (nota[i].semestre.equals(semestre)) {
                        String[] fila = {
                            nota[i].mensaje,
                            nota[i].semestre,};
                        modelo2.addRow(fila);
                    }

                }
                break;

            case "Semestre 3":
                DefaultTableModel modelo3 = (DefaultTableModel) tabla_estudianteEncontrado.getModel();

                modelo3.setRowCount(0);
                for (int i = 0; i < contadorNotas; i++) {
                    if (nota[i].semestre.equals(semestre)) {
                        String[] fila = {
                            nota[i].mensaje,
                            nota[i].semestre,};
                        modelo3.addRow(fila);
                    }

                }
                break;

            case "Semestre 4":
                DefaultTableModel modelo4 = (DefaultTableModel) tabla_estudianteEncontrado.getModel();

                modelo4.setRowCount(0);
                for (int i = 0; i < contadorNotas; i++) {
                    if (nota[i].semestre.equals(semestre)) {
                        String[] fila = {
                            nota[i].mensaje,
                            nota[i].semestre,};
                        modelo4.addRow(fila);
                    }

                }
                break;

        }

    }

}

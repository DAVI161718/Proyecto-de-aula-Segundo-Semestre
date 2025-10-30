package controlador;

import javax.swing.table.DefaultTableModel;
import static modelo.Notas.*;
import static modelo.Usuarios.*;
import static view.tutorview.*;

/**
 *
 * @author Juanes
 */
public class listarEstudianteNota {

    public static void listarEstudianteNota1(String Semestre) {

        DefaultTableModel modelo1 = (DefaultTableModel) tabla_estudianteEncontrado.getModel();

        modelo1.setRowCount(0);
        for (int i = 0; i < contadorNotas; i++) {
            if (usuario[i].semestre.equals("Semestre 1")) {
                String[] fila = {
                    usuario[i].nombre,
                    usuario[i].cedula,};
                modelo1.addRow(fila);
            }
        }
    }

    public static void listarEstudianteNota2(String Semestre) {

        DefaultTableModel modelo1 = (DefaultTableModel) tabla_estudianteEncontrado.getModel();

        modelo1.setRowCount(0);
        for (int i = 0; i < contadorNotas; i++) {
            if (usuario[i].semestre.equals("Semestre 2")) {
                String[] fila = {
                    usuario[i].nombre,
                    usuario[i].cedula,};
                modelo1.addRow(fila);
            }
        }
    }

    public static void listarEstudianteNota3(String Semestre) {

        DefaultTableModel modelo1 = (DefaultTableModel) tabla_estudianteEncontrado.getModel();

        modelo1.setRowCount(0);
        for (int i = 0; i < contadorNotas; i++) {
            if (usuario[i].semestre.equals("Semestre 3")) {
                String[] fila = {
                    usuario[i].nombre,
                    usuario[i].cedula,};
                modelo1.addRow(fila);
            }
        }
    }

    public static void listarEstudianteNota4(String Semestre) {

        DefaultTableModel modelo1 = (DefaultTableModel) tabla_estudianteEncontrado.getModel();

        modelo1.setRowCount(0);
        for (int i = 0; i < contadorNotas; i++) {
            if (usuario[i].semestre.equals("Semestre 4")) {
                String[] fila = {
                    usuario[i].nombre,
                    usuario[i].cedula,};
                modelo1.addRow(fila);
            }
        }
    }

    public static void listarTabla1(String mensaje) {

        DefaultTableModel modelo1 = (DefaultTableModel) tabla_estudianteEncontrado.getModel();

        modelo1.setRowCount(0);
        for (int i = 0; i < contadorNotas; i++) {

            String[] fila = {
                nota[i].mensaje,
                nota[i].semestre,};
            modelo1.addRow(fila);
        }

    }

    public static void listarTabla2(String semestre) {

        DefaultTableModel modelo1 = (DefaultTableModel) tabla_notasEncontradas.getModel();

        modelo1.setRowCount(0);
        for (int i = 0; i < contadorNotas; i++) {

            String[] fila = {
                nota[i].mensaje,
                nota[i].semestre,};
            modelo1.addRow(fila);

        }

    }

    public static void listarTabla3(String semestre) {

        DefaultTableModel modelo1 = (DefaultTableModel) tablaListarNota.getModel();

        modelo1.setRowCount(0);
        for (int i = 0; i < contadorNotas; i++) {
            String[] fila = {
                nota[i].mensaje,
                nota[i].semestre,};
            modelo1.addRow(fila);

        }

    }

    public static void crearNotas() {
        DefaultTableModel modelo1 = (DefaultTableModel) tablaListarNota.getModel();
        //Lo que hago es obtener el modelo de la tablaUsu que son el nombre apellido y cedula
        modelo1.setRowCount(0);
        for (int i = 0; i < contadorNotas; i++) {
            String[] fila = {
                nota[i].semestre,
                nota[i].mensaje,};

            modelo1.addRow(fila);
        }

    }
}

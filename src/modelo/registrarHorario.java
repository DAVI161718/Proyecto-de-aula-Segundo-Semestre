package modelo;

import javax.swing.JOptionPane;
import static modelo.Horarios.*;

public class registrarHorario {

    public static void registrarHorario(String id, String dia, String mes, String hora, String salon) {

        Horarios nuevo = new Horarios();
        nuevo.id = id;
        nuevo.dia = dia;
        nuevo.mes= mes;
        nuevo.hora = hora;
        nuevo.salon = salon;

        horario[contadorHorario++] = nuevo;
    }

}

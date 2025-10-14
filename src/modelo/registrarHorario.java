package modelo;

import javax.swing.JOptionPane;
import static modelo.Horarios.*;

public class registrarHorario {

    public static void registrarHorario(String dia, String hora, String salon) {

            Horarios nuevo = new Horarios();
            nuevo.dia = dia;
            nuevo.hora = hora;
            nuevo.salon = salon;

            horario[contadorHorario++] = nuevo;
        }

    }


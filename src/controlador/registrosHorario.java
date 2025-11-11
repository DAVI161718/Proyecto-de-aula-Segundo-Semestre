package controlador;

import modelo.Horarios;
import static modelo.Horarios.*;


public class registrosHorario {

    public static void registrosHorario(String dia, String mes, String hora, String salon, String semestre) {

        Horarios nuevo = new Horarios();
        nuevo.dia = dia;
        nuevo.mes = mes;
        nuevo.hora = hora;
        nuevo.salon = salon;
        nuevo.semestre = semestre;

        horario[contadorHorario++] = nuevo;
    }

}

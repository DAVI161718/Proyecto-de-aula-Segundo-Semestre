package modelo;

import static modelo.Horarios.*;

public class registrarHorario {

    public static void registrarHorario(String dia, String mes, String hora, String salon) {

        Horarios nuevo = new Horarios();
        nuevo.dia = dia;
        nuevo.mes = mes;
        nuevo.hora = hora;
        nuevo.salon = salon;

        horario[contadorHorario++] = nuevo;
    }

}

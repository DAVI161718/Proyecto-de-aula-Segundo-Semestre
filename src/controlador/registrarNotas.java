package controlador;

import modelo.Notas;
import static modelo.Notas.*;

/**
 *
 * @author Juanes
 */
public class registrarNotas {

    public static void registrarNotas(String id, String mensaje) {

        Notas notas = new Notas();
        notas.id = id;
        notas.mensaje = mensaje;

        nota[contadorNotas++] = notas;
    }
}

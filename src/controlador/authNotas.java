/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Notas;
import static modelo.Notas.*;

/**
 *
 * @author Juanes
 */
public class authNotas {
    
    

    public static void eliminarDelArreglo(int indice) {
        if (indice >= 0 && indice < Notas.contadorNotas) {
            for (int i = indice; i < Notas.contadorNotas - 1; i++) {
                nota[i] = nota[i + 1];
            }
            Notas.nota[Notas.contadorNotas - 1] = null;
            Notas.contadorNotas--;
        }
    }

}

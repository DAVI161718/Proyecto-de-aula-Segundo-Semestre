package controlador;

import modelo.Usuarios;
import static modelo.Usuarios.*;

public class controladorRegistro {

    public static void crearUsuario(String cedula, String nombre, String contraseña, String cargo, String celular, String estado, String semestre) {
        Usuarios nuevoUsuario = new Usuarios();
        nuevoUsuario.cedula = cedula;
        nuevoUsuario.nombre = nombre;
        nuevoUsuario.contraseña = contraseña;
        nuevoUsuario.cargo = cargo;
        nuevoUsuario.celular = celular;
        nuevoUsuario.estado = estado;
        nuevoUsuario.semestre = semestre;
        
        usuario[contadorUsu++] = nuevoUsuario;
        contUsuInact++;
    }
}

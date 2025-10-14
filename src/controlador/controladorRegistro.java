package controlador;

import modelo.Usuarios;
import static modelo.Usuarios.*;

public class controladorRegistro {

    public static void crearUsuario(String cedula, String nombre, String contraseña, String cargo, String celular, String estado) {
        Usuarios nuevoUsuario = new Usuarios();
        nuevoUsuario.cedula = cedula;
        nuevoUsuario.nombre = nombre;
        nuevoUsuario.contraseña = contraseña;
        nuevoUsuario.cargo = cargo;
        nuevoUsuario.celular = celular;
        nuevoUsuario.estado = estado;
        
        usuario[contadorUsu++] = nuevoUsuario;
        contUsuInact++;
    }
}

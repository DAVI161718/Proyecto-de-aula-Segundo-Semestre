package controlador;

import javax.swing.JOptionPane;
import modelo.Usuarios;
import static modelo.Usuarios.*;

public class controladorRegistro {

    public static void crearUsuario(String cedula, String nombre, String contraseña, String cargo, String celular, String estado, String semestre) {
        switch (cargo) {
            case "Estudiante":
                if (contadorEstu < 95) {
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
                    contadorEstu++;
                } else {
                    JOptionPane.showMessageDialog(null, "Cantidad de estudiantes maxima alcanzada");
                }
                break;
            case "Tutor":
                if (contadorTutor < 4) {
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
                    contadorTutor++;
                } else {
                    JOptionPane.showMessageDialog(null, "Cantidad de tutores maxima alcanzada");
                }
                break;
        }
    }
}

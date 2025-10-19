package controlador;

import javax.swing.JOptionPane;
import static modelo.Usuarios.*;
import view.*;

public class controlLogin {

    public static boolean loginUsuarios(String cedula, String contraseña) {
        for (int i = 0; i < contadorUsu; i++) {
            if (usuario[i].cedula.equals(cedula) && usuario[i].contraseña.equals(contraseña) && usuario[i].estado.equals("Activo")) {
                String rol = usuario[i].cargo;
                switch (rol) {
                    case "Admin":
                        JOptionPane.showMessageDialog(null, "Bienvenido al sistema ADMIN");
                        Vitstaadmin admin = new Vitstaadmin();
                        admin.setVisible(true);
                        return true;
                    case "Estudiante":
                        JOptionPane.showMessageDialog(null, "Bienvenido al sistema " + usuario[i].nombre);
                        estudiantesView estu = new estudiantesView();
                        estu.setVisible(true);
                        return true;
                    case "Tutor":
                        JOptionPane.showMessageDialog(null, "Bienvenido al sistema " + usuario[i].nombre);
                        tutorview tutor = new tutorview();
                        tutor.setVisible(true);
                        return true;
                }
            }
        }
        return false;
    }
}

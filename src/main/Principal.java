package main;

import view.loginView;
import static controlador.controladorRegistro.*;
public class Principal {

    public static void main(String[] args) {
        loginView login = new loginView();
        login.setVisible(true);
        crearUsuario("12345678", "Yeiny Alvares", "123", "Admin", "12345678","Activo");
        crearUsuario("123456789", "Juan Cantillo", "123", "Estudiante", "123456789","Inactivo");
        crearUsuario("1234567890", "Juan Navia", "123", "Tutor", "1234567890", "Inactivo");
    }

}

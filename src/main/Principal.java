package main;

import view.loginView;
import static controlador.controladorRegistro.*;
public class Principal {

    public static void main(String[] args) {
        loginView login = new loginView();
        login.setVisible(true);
        crearUsuario("12345678", "Juan Cantillo", "123", "Tutor", "1234567888");
    }

}

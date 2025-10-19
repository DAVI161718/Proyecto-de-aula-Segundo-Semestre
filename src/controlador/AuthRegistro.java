package controlador;

import static modelo.Usuarios.*;

public class AuthRegistro {
    public static boolean valCedula(String cedula){
        return cedula.matches("\\d{8,10}");
    }
    
    public static boolean valTelefono(String telefono){
        return telefono.matches("\\d{10}");
    }
    
    public static boolean valUsuario(String cedula){
        for (int i = 0; i < contadorUsu; i++) {
            if (usuario[i].cedula.equals(cedula)) {
                return true;
            }
        }
        return false;
    }
}

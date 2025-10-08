package controlador;

public class AuthRegistro {
    public static boolean valCedula(String cedula){
        return cedula.matches("\\d{8,10}");
    }
    
    public static boolean valTelefono(String telefono){
        return telefono.matches("\\d{10}");
    }
}

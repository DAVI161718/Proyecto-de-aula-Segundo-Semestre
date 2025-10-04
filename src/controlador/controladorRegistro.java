package controlador;

import java.io.File;
import java.util.Formatter;
import javax.swing.JOptionPane;
import static controlador.AuthRegistro.*;

public class controladorRegistro {

    static String barra = File.separator;
    static String CrearUbica = System.getProperty("user.dir") + barra + "Datos de Usuarios" + barra;

    public static void crear(String cedula, String nombre, String contraseña, String rol, String telefono) {
        String archivo = cedula + ".txt";
        File CrearUbi = new File(CrearUbica);
        File CrearArchivo = new File(CrearUbica + archivo);
        if (nombre.isEmpty() || cedula.isEmpty() || contraseña.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Porfavor rellenar todas las casillas con su respectiva informacion");
        } else {
            try {
                if (CrearArchivo.exists()) {
                    JOptionPane.showMessageDialog(null, "Este usuario ya existe");
                } else {
                    if (valCedula(cedula) && valTelefono(telefono)) {
                        CrearUbi.mkdir();
                        Formatter CrearForma = new Formatter(CrearUbica + archivo);
                        CrearForma.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n", "Cedula: " + cedula, "Contraseña: " + contraseña, "Rol: " + rol, "Nombre Completo: " + nombre, "Numero de telefono: " + telefono);
                        CrearForma.close();
                        JOptionPane.showMessageDialog(null, "Registro Exitoso!");
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Informacion no valida, Porfavor intente nuevamente");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Registro incorrecto");
            }
        }
    }
}

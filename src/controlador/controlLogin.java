package controlador;

import java.io.*;
import javax.swing.JOptionPane;

public class controlLogin {
    public static void loginUsuarios(String cedula, String contraseña) {
        String carpeta = System.getProperty("user.dir") + File.separator + "Datos de Usuarios";
        File archivo = new File(carpeta + File.separator + cedula + ".txt");
        if (!archivo.exists() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cedula o contraseña incorrectas...");
        }
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String cedulaFile = br.readLine();
            String contraFile = br.readLine();
            if (cedulaFile != null && cedulaFile.contains(":")) {
                cedulaFile = cedulaFile.split(":", 2)[1].trim();
            }
            if (contraFile != null && contraFile.contains(":")) {
                contraFile = contraFile.split(":", 2)[1].trim();
            }

            if (cedula.equals(cedulaFile) && contraseña.equals(contraFile)) {
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema!");
            }else{
                JOptionPane.showMessageDialog(null, "Cedula o contraseña incorrecta");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
}

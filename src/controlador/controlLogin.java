package controlador;

import java.io.*;
import javax.swing.JOptionPane;
import view.estudiantesView;

public class controlLogin {

    public static boolean loginUsuarios(String cedula, String contraseña) {
        if (cedula.equals("admin")&& contraseña.equals("123")) {
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema ADMIN!");
            return true;
        }
        String carpeta = System.getProperty("user.dir") + File.separator + "Datos de Usuarios";
        File archivo = new File(carpeta + File.separator + cedula + ".txt");
        if (!archivo.exists() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cedula o contraseña incorrectas...");
        }
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String cedulaFile = br.readLine();
            String contraFile = br.readLine();
            String rolFile = br.readLine();
            if (cedulaFile != null && cedulaFile.contains(":")) {
                cedulaFile = cedulaFile.split(":", 2)[1].trim();
            }
            if (contraFile != null && contraFile.contains(":")) {
                contraFile = contraFile.split(":", 2)[1].trim();
            }
            String rol = "";
            if (rolFile != null && rolFile.contains(":")) {
                rolFile = rolFile.split(":", 2)[1].trim();
                rol = rolFile;
            }
            
            if (cedula.equals(cedulaFile) && contraseña.equals(contraFile)&& rol.equals("Tutor")) {
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema!");
                return true;
            } else if (cedula.equals(cedulaFile) && contraseña.equals(contraFile)&& rol.equals("Estudiante")){
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema!");
                estudiantesView estu = new estudiantesView();
                estu.setVisible(true);
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Cedula o contraseña incorrectas");
            }

        } catch (Exception e) {
        }
        return false;
    }
}

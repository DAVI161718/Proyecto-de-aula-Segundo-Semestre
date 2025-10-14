/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static modelo.Usuarios.*;
import static view.Vitstaadmin.tabUsuACT;
public class ControladorAdmin {
    
      public static void ListarInac(){
        DefaultTableModel modelo = (DefaultTableModel) tabUsuACT.getModel();
        boolean HayUsuarios = false;
        modelo.setRowCount(0);
        for (int i = 0; i < contadorUsu; i++) {
            if(usuario[i].cargo.equalsIgnoreCase("Tutor")){
            modelo.addRow(new Object[]{
                usuario[i].nombre,
                usuario[i].cedula,
                usuario[i].celular,
                usuario[i].cargo,
           });
            HayUsuarios = true;

            }
            
       }
         if (!HayUsuarios) {
        javax.swing.JOptionPane.showMessageDialog(null, "¡Ups! no hay nuevas solicitudes de usuarios");
    }
   }
   public static void ListarAct(){
        DefaultTableModel modelo = (DefaultTableModel) tabUsuACT.getModel();
        boolean hayActivos = false;
        modelo.setRowCount(0);
        for (int i = 0; i < contadorUsu; i++) {
            if(usuario[i].cargo.equalsIgnoreCase("estudiante")){
            modelo.addRow(new Object[]{
                usuario[i].nombre,
                usuario[i].cedula,
                usuario[i].celular,
                usuario[i].cargo,
           });
            hayActivos = true;

            }
            
       }
         if (!hayActivos) {
        javax.swing.JOptionPane.showMessageDialog(null, "¡Ups! no hay usuarios activos");
    }
   }
    public static int buscarPorCedula(String cedulaBuscada) {
        for (int i = 0; i < contadorUsu; i++) {
            if (usuario[i].cedula.equals(cedulaBuscada)) {
                return i;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        return -1;
    }


    public static void eliminar(String cedulaBuscada) {
        int pos = buscarPorCedula(cedulaBuscada);
        if (pos != -1) {
            for (int i = pos; i < contadorUsu - 1; i++) {
                usuario[i] = usuario[i + 1];
            }
            contadorUsu--;
            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
        }
    }


    public static void modificar(String cedulaBuscada, String nuevoNombre, String nuevaContraseña, String nuevoCelular, String nuevoCargo) {
    int pos = buscarPorCedula(cedulaBuscada);
    if (pos != -1) {
        boolean modificado = false;

        if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
            usuario[pos].nombre = nuevoNombre.trim();
            modificado = true;
        }

        if (nuevoCelular != null && !nuevoCelular.trim().isEmpty()) {
            usuario[pos].celular = nuevoCelular.trim();
            modificado = true;
        }

        if (nuevaContraseña != null && !nuevaContraseña.trim().isEmpty()) {
            usuario[pos].contraseña = nuevaContraseña.trim();
            modificado = true;
        }
        
        if (nuevoCargo != null && !nuevoCargo.equals("Seleccione") && !nuevoCargo.equals(usuario[pos].cargo)) {
            usuario[pos].cargo = nuevoCargo;
            modificado = true;
        }

        if (modificado) {
            JOptionPane.showMessageDialog(null, "Usuario modificado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se realizó ningún cambio.");
        }
    }
}

}
   
    


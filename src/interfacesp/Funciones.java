/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesp;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandra
 */


public class Funciones {
    
    /**
 *Valida si el nombre de usuario es correcto
 * @param nombreUsuario El nombre de usuario a validar.
 * @return true si el nombre de usuario es correcto, false en caso contrario
 */
    public static  boolean Validar (String nombreUsuario){
        
        if (!nombreUsuario.contains("@" ) || nombreUsuario.contains(" ") || nombreUsuario.contains("/")|| nombreUsuario.contains("-") || nombreUsuario.contains("*")) {
            JOptionPane.showMessageDialog(null,"Caracteres especiales no permitidos: /, - ,*\n Revise si coloco el '@' y no dejo ningun espacio");
             return false;
    
        
    }else{
            return true;
        }
}
        
    }

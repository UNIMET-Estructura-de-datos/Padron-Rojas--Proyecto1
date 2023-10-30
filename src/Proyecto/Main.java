/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto;

import interfacesp.Ventana1;


/**
 *
 * @author Samantha Rojas , Alexandra Padrón
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GrafoLista grafo = GrafoLista.Readtxt();
        
        
        
         Ventana1 ventana= new Ventana1(grafo);
     
        ventana.setVisible(true);
    
   
        
      
        
    }
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author Samantha
 */
public class VerticeUsuario {
    
    private String Usuario;
    private int numVertice;
    private ListaArcos list_ady;
/**
     * Constructor de VerticeUsuario
     */
    public VerticeUsuario(String Usuario) {
        this.Usuario = Usuario;
        this.numVertice = -1;
        list_ady = new ListaArcos();
    }
    /**
     * Indica si 2 vertices son inguales
     * @param verticeUsuario, objeto VerticeUsuario
     * @return true si 2 vertices son iguales, false si no.
     */
    
    public boolean equalsV(VerticeUsuario verticeUsuario){
        return Usuario.equalsIgnoreCase(verticeUsuario.Usuario);
    }
  /**
     * Imprime los datos del objeto VerticeUsuario
     */
    public void Print(){
        System.out.println("Usuario: " + Usuario +"Nro: " + numVertice);
    }
    
    /**
     * Obtiene el nombre de usuario.
     * @return El nombre de usuario.
     */
    public String getUsuario() {
        return Usuario;
    }
/**
     * Establece el nombre de usuario.
     * @param Usuario El nombre de usuario a establecer.
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
/**
     * Obtiene el número de vértice.
     * @return El número de vértice.
     */
    public int getNumVertice() {
        return numVertice;
    }
/**
     * Establece el número de vértice.
     * @param numVertice El número de vértice a establecer.
     */
    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }
/**
     * Obtiene la lista de arcos adyacentes.
     * @return La lista de arcos adyacentes.
     */
    public ListaArcos getList_ady() {
        return list_ady;
    }
/**
     * Establece la lista de arcos adyacentes.
     * @param list_ady La lista de arcos adyacentes a establecer.
     */
    public void setList_ady(ListaArcos list_ady) {
        this.list_ady = list_ady;
    }
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author Samantha
 */
public class Stack {

    private Nodo Top;
    private int size;
/**
     * Constructor para la clase Stack.
     */
    public Stack() {
        this.Top = null;
        this.size = 0;
    }
    /**
     * Verifica si la pila está vacía.
     * @return True si la pila está vacía, false en caso contrario.
     */
    public boolean IsEmpty(){
        return Top == null;
    }
     /**
     * Obtiene el nodo en la cima de la pila sin eliminarlo.
     * @return Los datos del nodo en la cima de la pila.
     */
    public Object peek(){
        if (IsEmpty()){
            return null;
        }else{
            return Top.getData();
        }
    }
     /**
     * Inserta un nuevo nodo en la cima de la pila.
     * @param Data Los datos del nuevo nodo a insertar.
     */
    public void Push(int Data){
    Nodo NewNode = new Nodo(Data);
    if (!IsEmpty()){
        NewNode.setNext(Top);
    }
    Top = NewNode;
    size +=1;
}
    /**
     * Elimina y devuelve el nodo en la cima de la pila.
     * @return El nodo que fue eliminado de la cima de la pila.
     */
    public Nodo Pop(){
        Nodo preturn;
        if(IsEmpty()){
            return null;
        }else{
            preturn = Top;
            Top = Top.getNext();
            preturn.setNext(null);
            size -=1;
        }
        
        return preturn;
    }


 /**
     * Establece el nodo en la cima de la pila.
     * @param Head El nodo a establecer en la cima de la pila.
     */
    public void setHead(Nodo Head) {
        this.Top = Head;
    }
/**
     * Obtiene el tamaño de la pila
     * @return El tamaño de la pila.
     */
    public int getSize() {
        return size;
    }
/**
     * Establece el tamaño de la pila.
     * @param size El tamaño a establecer.
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}


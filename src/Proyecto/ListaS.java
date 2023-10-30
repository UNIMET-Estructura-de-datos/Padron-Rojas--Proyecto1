/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;
//siempre comprobar si una lista esta vacia para cada metodo

/**
 *
 * @author Samantha
 */
public class ListaS {

    private Nodo first;
    private Nodo last;
    private int size;
/**
     * Constructor para la clase ListaS.
     */
    public ListaS() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    
/**
     * Verifica si la lista está vacía.
     * @return Verdadero si la lista está vacía, falso en caso contrario.
     */
    public boolean isEmpty() {
        return first == null;
    }
/**
     * Inserta un nuevo nodo al final de la lista.
     * @param data  dato tipo Objeto del nuevo nodo a insertar.
     */
    public void InsertarFinal(Object data) {
        Nodo nuevo = new Nodo(data); 
        if (isEmpty()) {
            first = nuevo;
            last = nuevo;
        } else {
            Nodo aux = last;
            aux.setNext(nuevo); 
            last = nuevo;
        }
        size += 1;
    }
    /**
     * Elimina un nodo al final de la lista.
     */
    public void deleteEnd(){
        Nodo paux = first;
        Nodo prev = paux;
        while (paux.getNext() != null){
            prev = paux;
            paux = paux.getNext();
            
        }
       prev.setNext(null);
       last = prev;
    }
    /**
     * Indica si la lista contiene un dato en especifico
     * @param numUser nro del Usuario a ser buscado
     * @return false, si la lista esta vacía o no contiene el dato, true, si encuentra el dato.
     */
     public boolean Contains(int numUser){
        if (isEmpty()){
            return false;
        }else{
          
            Nodo paux = first;
            for (int i = 0; i < size; i++) {
                if ((Integer)paux.getData() == numUser ){
                    return true;
                }
                paux = paux.getNext();
            }
        }
        return false;
    }
   
     /**
     * Imprime los vertices conectados
     * @param verticess , ListaS de objetos vertices
     */
    public void printConnected(ListaS verticess ){
    if (!verticess.isEmpty()){
        Nodo aux = verticess.getFirst();
        for (int i = 0; i < verticess.getSize(); i++) {
            System.out.println(aux.getData());
            aux= aux.getNext();
        }
     
    
    }
}
    /**
     * Imprime los datos de la lista
     */
    public void Print() {
        if (!isEmpty()) {
            Nodo aux = first;
            
            for (int i = 0; i < size; i++) {
                System.out.println(aux.getData() + " ");
                aux = aux.getNext();
            }

        } else {
            System.out.println("La lista esta vacía");
        }
    }
/**
     * Elimina el primer nodo de la lista
     */
    public void eliminarPrincipio() {
        if (!isEmpty()) {
            first = first.getNext();
            size -= 1;
        } else {
            System.out.println("La lista esta vacía");
        }
    }

    /**
     * Borra todos los elementos de la lista
     */
    public void deleteall(){
        for (int i = 0; i < size; i++) {
            first= first.getNext();
        }
        size = 0; 
    }
    
  
    /**
     * Inserta un nuevo nodo al inicio de la lista
     * @param data, dato tipo Objeto del nodo nuevo a insertar
     */
    public void  InsertarInicio (Object data){
        Nodo newNode = new Nodo(data);
        if (isEmpty()){
            first = newNode;
           
        }else{
           newNode.setNext(first);
           first = newNode;
        
        }
        size+=1;
    
    
    }

    /**
     * Obtiene el primer nodoo de la lista.
     * @return El primer nodo de la lista.
     */

    public Nodo getFirst() {
        return first;
    }
/**
     * Establece el primer nodo de la lista.
     * @param first nodo a establecer.
     */
    public void setFirst(Nodo first) {
        this.first = first;
    }
/**
     * Obtiene el último nodo de la lista.
     * @return El último nodo de la lista.
     */
    public Nodo getLast() {
        return last;
    }
/**
     * Establece el último nodo de la lista.
     * @param last nodo a establecer.
     */
    public void setLast(Nodo last) {
        this.last = last;
    }
/**
     * Obtiene el tamaño de la lista.
     * @return El tamaño de la lista.
     */
    public int getSize() {
        return size;
    }
/**
     * Establece el tamaño de la lista.
     * @param size, tamaño de la lista , nro entero.
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}

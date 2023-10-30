/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;


/**
 *Clase para manejar una lista de Arcos
 * @author Samantha
 */
public class ListaArcos {

    private Arco first;
    private Arco last;
    private int size;

 /**
     * Constructor para la clase ListaArcos.
     */
    public ListaArcos() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
/**
     * Obtiene el primer arco de la lista.
     * @return El primer arco de la lista.
     */
    public Arco getFirst() {
        return first;
    }
/**
     * Establece el primer arco de la lista.
     * @param first Objeto Arco a establecer.
     */
    public void setFirst(Arco first) {
        this.first = first;
    }
/**
     * Obtiene el último arco de la lista.
     * @return El último arco de la lista.
     */
    public Arco getLast() {
        return last;
    }
/**
     * Establece el último arco de la lista.
     * @param last Objeto Arco a establecer.
     */
    public void setLast(Arco last) {
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
     * Verifica si la lista está vacía.
     * @return True si la lista está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return first == null;
    }
/**
     * Inserta un nuevo arco al final de la lista.
     * @param data , dato del nuevo arco a insertar.
     */
    public void InsertarFinal(int data) {
        Arco nuevo = new Arco(data); 
        if (isEmpty()) {
            first = nuevo;
            last = nuevo;
        } else {
            Arco aux = last;
            aux.setNext(nuevo); 
            last = nuevo;
        }
        size += 1;
    }
    
/**
     * Borra el último Arco de la lista.
     */
    public void deleteEnd(){
        if(isEmpty()){
            System.out.println("Su lista esta Vacía");
        }else{
        Arco paux = first;
        Arco prev = paux;
        while (paux.getNext() != null){
            prev = paux;
            paux = paux.getNext();
            
        }
       prev.setNext(null);
       last = prev;
        size -=1;
        }
        
    }
/**
     * Indica si la lista contiene un Arco en especifico, a partir de su nro
     * @param destino , nro del Arco.
     * @return False, si la lista esta vacía, True si consigue el arco solicitado en la lista.
     */
    public boolean Contains(int destino){
        if (isEmpty()){
            return false;
        }else{
          
            Arco paux = first;
            for (int i = 0; i < size; i++) {
                if (paux.getDestino() ==destino ){
                    return true;
                }
                paux = paux.getNext();
            }
        }
        return false;
    }
/**
     * Imprime los datos de la  lista de Arcos 
     * 
     */
    public void Print() {
        if (!isEmpty()) {
            Arco aux = first;
            
            for (int i = 0; i < size; i++) {
                System.out.println(aux.getDestino() + " ");
                aux = aux.getNext();
            }

        } else {
            System.out.println("La lista esta vacía");
        }
    }
/**
     * Elimina el primer Arco de la lista
     * 
     */
    public void eliminarPrincipio() {
        if (!isEmpty()) {
            first = first.getNext();
            size -= 1;
        } else {
            System.out.println("La lista esta vacía");
        }
    }

    public void mostrarelemento(int nro) {
        Arco aux = first;
        int counter =0;
        if (!isEmpty()) {
            if (nro > 0){
            do {
                aux = aux.getNext();
                counter += 1;
            } while (counter < nro);}
            System.out.println(aux.getDestino());
        }else{
            System.out.println("La lista esta vacía!");}
    }
/**
     * Borra todos los Arcos de la lista
     * 
     */    
    public void deleteall(){
        for (int i = 0; i < size; i++) {
            first= first.getNext();
        }
        size = 0; 
    }
    
 /**
     * Inserta un Arco al inicio de la lista
     * @param data, datos del Objeto Arco a crear e insertar
     */  
    public void  InsertarInicio (int data){
        Arco newNode = new Arco(data);
        if (isEmpty()){
            first = newNode;
           
        }else{
           newNode.setNext(first);
           first = newNode;
        
        }
        size+=1;
    
    
    }
 
  

  /**
     * Elimina una Arco en una especifica posición
     * @param DestinoArc, nro del Arco a borrar.
     */  
  public void DeleteArconro(int DestinoArc){
    if (isEmpty()){
        
        return;
    }
    if (first.getDestino() == DestinoArc){
        eliminarPrincipio();
    } else if (last.getDestino() == DestinoArc){
        deleteEnd();
    } else {
        Arco pprev = first;
        while (pprev.getNext() != null && pprev.getNext().getDestino() != DestinoArc){
            pprev = pprev.getNext();
        }
        if (pprev.getNext() == null) {
            
            return;
        }
        Arco todelete = pprev.getNext();
        Arco post = todelete.getNext();
        pprev.setNext(post);
        size -= 1;
    }
}

      
  }
  




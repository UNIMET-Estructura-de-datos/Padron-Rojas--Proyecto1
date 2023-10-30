/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author Samantha
 */
public class Arco {
    private int destino;
    private Arco next;

    public Arco getNext() {
        return next;
    }

    public void setNext(Arco next) {
        this.next = next;
    }

    public Arco(int destino) {
        this.destino = destino;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }
    public boolean equalsA(Object n){
        Arco a = (Arco)n;
        return destino == a.destino;
    }
}

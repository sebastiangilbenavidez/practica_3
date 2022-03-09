package modelo;

import javax.swing.JOptionPane;
import registros.Logs;

public class Queue {

    nodo header;
    nodo last;

    public Queue() {
        header = new nodo(null);
        last = new nodo(null);

    }

    public void addInLine(Logs logs) {
        if (emptyQueue()) {
            nodo newnode = new nodo(logs);
            newnode.next = null;
            header.next = newnode;
            last.next = newnode;
        } else {
            nodo newnode = new nodo(logs);
            newnode.next = last.next;
            last.next = newnode;
        }

    }

    public void pop() {
        nodo borrar = header.next;
        if (header.next == last.next) {
            header.next = null;
            last.next = null;
        } else {
            nodo aux = last;
            while (aux.next != borrar) {
                aux = aux.next;
            }
            aux.next = null;
            header.next = aux;
        }

    }

    public void showAll() {
        if (emptyQueue()) {
            JOptionPane.showMessageDialog(null, "la lista esta vacia");
        } else {
            nodo reco = last.next;
            while (reco != null) {
                JOptionPane.showConfirmDialog(null, reco.getData().toString());
                reco = reco.next;
            }
        }
    }

    public boolean emptyQueue() {
        return header.next == null;
    }

}

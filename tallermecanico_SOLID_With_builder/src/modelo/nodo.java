package modelo;

import registros.Logs;

public class nodo {

    public Logs data;
    public nodo next;

    public nodo(Logs p) {
        data = p;
        next = null;
    }

    public nodo() {
    }

    public Logs getData() {
        return data;
    }

    public nodo getNext() {
        return next;
    }

    public void setData(Logs data) {
        this.data = data;
    }

    public void setNext(nodo next) {
        this.next = next;
    }

}

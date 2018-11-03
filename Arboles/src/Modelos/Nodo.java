package Modelos;

public class Nodo {
    
    private String Valor;
    private Nodo NodoIzqu;
    private Nodo NodoDere;

    public Nodo(String Valor, Nodo NodoIzqu, Nodo NodoDere) {
        this.Valor = Valor;
        this.NodoIzqu = NodoIzqu;
        this.NodoDere = NodoDere;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    public Nodo getNodoIzqu() {
        return NodoIzqu;
    }

    public void setNodoIzqu(Nodo NodoIzqu) {
        this.NodoIzqu = NodoIzqu;
    }

    public Nodo getNodoDere() {
        return NodoDere;
    }

    public void setNodoDere(Nodo NodoDere) {
        this.NodoDere = NodoDere;
    }
    
}

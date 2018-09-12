
package Model;

public class Prestamo {
    
    private double Valor;
    private double Interes;
    private double Plazo;
    private Asociado Persona;

    public Prestamo(double Valor, double Interes, double Plazo, Asociado Persona) {
        this.Valor = Valor;
        this.Interes = Interes;
        this.Plazo = Plazo;
        this.Persona = Persona;
    }

    public double getValor() {
        return Valor;
    }

    public double getInteres() {
        return Interes;
    }

    public double getPlazo() {
        return Plazo;
    }

    public Asociado getPersona() {
        return Persona;
    }
    
    
    
}

package Modelo;

public class Persona {
    
    private String Nombre;
    private String Codigo;
    private double Peso;

    public Persona(String Nombre, String Codigo, double Peso) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Peso = Peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
    
}

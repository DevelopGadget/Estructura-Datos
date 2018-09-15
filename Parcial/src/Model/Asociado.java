package Model;

public class Asociado {
    
    private String Codigo;
    private String Nombre;
    private double Salario;
    private String Estado;
    private int IndexCuotas;

    public Asociado(String Codigo, String Nombre, double Salario, String Estado) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Salario = Salario;
        this.Estado = Estado;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getSalario() {
        return Salario;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getIndexCuotas() {
        return IndexCuotas;
    }

    public void setIndexCuotas(int IndexCuotas) {
        this.IndexCuotas = IndexCuotas;
    }
    
}

package Modelo;

public class Prenda {

    private String Codigo;
    private String Tipo;
    private String Estado;
    private String Color;
    private String Talla;

    public Prenda(String Codigo, String Tipo, String Color, String Talla) {
        this.Codigo = Codigo;
        this.Tipo = Tipo;
        this.Color = Color;
        this.Talla = Talla;
        this.Estado = "SUCIA";
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getEstado() {
        return Estado;
    }

    public String getColor() {
        return Color;
    }

    public String getTalla() {
        return Talla;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}

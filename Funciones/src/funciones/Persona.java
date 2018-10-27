package funciones;

public class Persona extends ArrayString{
    
    private String Nombre;
    private String Id;
    private String Identificacion;
    private int Edad;

    public Persona(String Nombre, String Id, String Identificacion, int Edad) {
        this.Nombre = Nombre;
        this.Id = Id;
        this.Identificacion = Identificacion;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getId() {
        return Id;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public int getEdad() {
        return Edad;
    }

    @Override
    public String[] toStringArray() {
        return new String[]{getId(), getNombre(), getEdad()+"", getIdentificacion()};
    }
    
    
}

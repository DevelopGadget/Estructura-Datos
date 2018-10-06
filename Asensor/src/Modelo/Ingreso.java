package Modelo;

public class Ingreso {
    
    private Persona _Persona;
    private Piso _Piso;
    private int Momento;

    public Ingreso(Persona _Persona, Piso _Piso, int Momento) {
        this._Persona = _Persona;
        this._Piso = _Piso;
        this.Momento = Momento;
    }

    public Persona getPersona() {
        return _Persona;
    }

    public void setPersona(Persona _Persona) {
        this._Persona = _Persona;
    }

    public Piso getPiso() {
        return _Piso;
    }

    public void setPiso(Piso _Piso) {
        this._Piso = _Piso;
    }

    public int getMomento() {
        return Momento;
    }

    public void setMomento(int Momento) {
        this.Momento = Momento;
    }
    
}

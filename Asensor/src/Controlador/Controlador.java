package Controlador;

import Modelo.Ingreso;
import Modelo.Persona;
import java.util.ArrayList;

public class Controlador {

    private static final ArrayList<Persona> Personas = new ArrayList();
    private static final ArrayList<Ingreso> PersonasIngresadas = new ArrayList();

    public void CrearPersona(Persona P) {
        Personas.add(P);
    }
    
    public ArrayList<String[]> ReadPersona(){
        ArrayList<String[]> Get = new ArrayList();
        Personas.forEach(Item -> {
            Get.add(new String[]{Item.getNombre(), Item.getCodigo(), Item.getPeso()+""});
        });
        return Get;
    }
}

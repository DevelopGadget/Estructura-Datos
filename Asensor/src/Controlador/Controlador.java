package Controlador;

import Modelo.Ingreso;
import Modelo.Persona;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Controlador {

    private static final ArrayList<Persona> Personas = new ArrayList();
    private static final Stack<Ingreso> Piso4 = new Stack();
    private static final Queue<Ingreso> Piso3 = new LinkedList();

    public void CrearPersona(Persona P) {
        Personas.add(P);
    }

    public void CrearIngreso(Ingreso P, boolean Piso3) {
        if (Piso3) {
            this.Piso3.offer(P);
        } else {
            this.Piso4.push(P);
        }
    }

    public ArrayList<String[]> ReadPersona() {
        ArrayList<String[]> Get = new ArrayList();
        Personas.forEach(Item -> {
            Get.add(new String[]{Item.getNombre(), Item.getCodigo(), Item.getPeso() + ""});
        });
        return Get;
    }

    public ArrayList<String[]> ReadIngreso() {
        ArrayList<String[]> Get = new ArrayList();
        Piso3.forEach(Item -> {
            Get.add(new String[]{Item.getPersona().getNombre(), Item.getPiso().getNumero() + "", Item.getMomento() + ""});
        });
        Piso4.forEach(Item -> {
            Get.add(new String[]{Item.getPersona().getNombre(), Item.getPiso().getNumero() + "", Item.getMomento() + ""});
        });
        return Get;
    }

    public Persona QuitarPersona(int Index) {
        return Personas.remove(Index);
    }

    public int Momento() {
        return Piso3.size() + Piso4.size();
    }

}

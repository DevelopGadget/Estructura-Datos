package Controlador;

import Modelo.Ingreso;
import Modelo.Persona;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Controlador {

    private static ArrayList<Persona> Personas = new ArrayList();
    private static final ArrayList<Persona> PersonasCopia = new ArrayList();
    private static final Stack<Ingreso> Piso4 = new Stack();
    private static final Queue<Ingreso> Piso3 = new LinkedList();

    public void CrearPersona(Persona P) {
        Personas.add(P);
        PersonasCopia.add(P);
    }

    public void CrearIngreso(Ingreso P, boolean Piso3) {
        if (Piso3) {
            this.Piso3.offer(P);
        } else {
            this.Piso4.push(P);
            System.out.println(Piso4.size());
        }
    }

    public ArrayList<String[]> ReadPersona() {
        ArrayList<String[]> Get = new ArrayList();
        Personas.forEach(Item -> {
            Get.add(new String[]{Item.getNombre(), Item.getCodigo(), Item.getPeso() + ""});
        });
        return Get;
    }

    public ArrayList<String[]> ReadPiso3() {
        ArrayList<String[]> Get = new ArrayList();
        Ingreso Item;
        if (Piso3.size() > 0) {
            while ((Item = Piso3.poll()) != null) {
                Get.add(new String[]{Item.getPersona().getNombre(), Item.getPersona().getPeso() + "", Item.getMomento() + "", Get.size() + ""});
            }
        }
        return Get;
    }

    public ArrayList<String[]> ReadPiso4() {
        ArrayList<String[]> Get = new ArrayList();
        if (Piso4.size() > 0) {
            Ingreso Item;
            while (Piso4.size() > 0 && (Item = Piso4.pop()) != null) {
                Get.add(new String[]{Item.getPersona().getNombre(), Item.getPersona().getPeso() + "", Item.getMomento() + "", Get.size() + ""});
            }
        }
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

    public void Recepcion() {
        Personas = (ArrayList<Persona>) PersonasCopia.clone();
    }

    public Persona QuitarPersona(int Index) {
        return Personas.remove(Index);
    }

    public int Momento() {
        return Piso3.size() + Piso4.size();
    }

}

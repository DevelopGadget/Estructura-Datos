package Controlador;

import Modelo.Ingreso;
import Modelo.Persona;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Controlador {

    private static ArrayList<Persona> Personas = new ArrayList();
    private static ArrayList<Persona> PersonasCopia = new ArrayList();
    private static Stack<Ingreso> Piso4 = new Stack();
    private static Queue<Ingreso> Piso3 = new LinkedList();

    public Controlador() {
        Personas = (ArrayList<Persona>) Leer("Personas.dat");
        if (Personas == null) {
            Personas = new ArrayList();
        } else {
            PersonasCopia = (ArrayList<Persona>) Personas.clone();
            System.err.println("Hola");
        }
        Piso4 = (Stack<Ingreso>) Leer("Piso4.dat");
        if (Piso4 == null) {
            Piso4 = new Stack();
        }
        Piso3 = (Queue<Ingreso>) Leer("Piso3.dat");
        if (Piso3 == null) {
            Piso3 = new LinkedList();
        }
    }

    public void CrearPersona(Persona P) {
        Personas.add(P);
        PersonasCopia.add(P);
        Persistencia("Personas.dat", Personas);
    }

    public void CrearIngreso(Ingreso P, boolean piso3) {
        if (piso3) {
            this.Piso3.offer(P);
            Persistencia("Piso3.dat", Piso3);
        } else {
            this.Piso4.push(P);
            Persistencia("Piso4.dat", Piso4);
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
        Persistencia("Personas.dat", Personas);
    }

    public Persona QuitarPersona(int Index) {
        Persona persona = Personas.remove(Index);
        Persistencia("Personas.dat", Personas);
        return persona;

    }

    public int Momento() {
        return Piso3.size() + Piso4.size();
    }

    private boolean Persistencia(String Url, Object Array) {
        try {
            FileOutputStream persisten = new FileOutputStream(Url);
            ObjectOutputStream obj_persiten = new ObjectOutputStream(persisten);
            obj_persiten.writeObject(Array);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    private Object Leer(String Url) {
        File fichero = new File(Url);
        if (fichero.exists()) {
            try {
                FileInputStream archivo = new FileInputStream(Url);
                ObjectInputStream obj_archivo = new ObjectInputStream(archivo);
                return obj_archivo.readObject();
            } catch (IOException | ClassNotFoundException e) {
                return null;
            }
        } else {
            return null;
        }
    }
}

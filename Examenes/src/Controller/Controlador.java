package Controller;

import Models.Estudiante;
import Models.Examen;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class Controlador {

    private File fichero;
    private FileInputStream archivo;
    private ObjectInputStream obj_archivo;
    private FileOutputStream persisten;
    private ObjectOutputStream obj_persiten;

    private static ArrayList<Estudiante> Estudiantes = new ArrayList();
    private static Examen ExamenEvaluar;
    private static Stack<Estudiante> Examenes = new Stack();

    public Controlador() {
        Estudiantes = (ArrayList<Estudiante>) cargar_datos("Array.dat");
        if (Estudiantes == null) {
            Estudiantes = new ArrayList();
        }
        ExamenEvaluar = (Examen) cargar_datos("Examen.dat");
        Examenes = (Stack<Estudiante>) cargar_datos("Pila.dat");
        if (Examenes == null) {
            Examenes = new Stack();
        }
    }

    public void CrearExamen(Examen E) {
        ExamenEvaluar = E;
        Escribir("Examen.dat", E);
    }
    
    public Examen getExamen (){
        return ExamenEvaluar;
    }

    public boolean CalificarEstudiante(int Preguntas) {
        Estudiante E = Examenes.pop();
        E.setNota(((double) 5 / ExamenEvaluar.getPreguntas()) * Preguntas);
        Estudiantes.add(E);
        Escribir("Array.dat", Estudiantes);
        Escribir("Pila.dat", Examenes);
        return Examenes.size() <= 0;
    }

    public Vector<String[]> ReadPila() {
        Vector<String[]> Read = new Vector();
        Examenes.forEach(Item -> {
            Read.add(new String[]{Item.getCodigo(), Item.getNombre()});
        });
        return Read;
    }

    public Vector<String[]> ReadExamenes() {
        Vector<String[]> Read = new Vector();
        Estudiantes.forEach(Item -> {
            Read.add(new String[]{Item.getCodigo(), Item.getNombre(), Item.getNota() + ""});
        });
        return Read;
    }

    public void AgregarExamen(Estudiante E) {
        Examenes.push(E);
        Escribir("Pila.dat", Examenes);
    }

    public boolean ValidarPregunta(int Pregunta) {
        if (Pregunta <= ExamenEvaluar.getPreguntas() && Pregunta >= 0) {
            return true;
        } else {
            System.err.println("Entro ");
            return false;
        }
    }

    private Object cargar_datos(String url) {
        fichero = new File(url);
        if (fichero.exists()) {
            try {
                archivo = new FileInputStream(url);
                obj_archivo = new ObjectInputStream(archivo);
                return obj_archivo.readObject();
            } catch (Exception e) {
                return null;
            }
        } else {
            return null;
        }

    }

    private boolean Escribir(String Url, Object Array) {
        try {
            persisten = new FileOutputStream(Url);
            obj_persiten = new ObjectOutputStream(persisten);
            obj_persiten.writeObject(Array);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

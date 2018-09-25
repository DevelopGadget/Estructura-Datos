package Controller;

import Models.Estudiante;
import Models.Examen;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class Controlador {

    private static ArrayList<Estudiante> Estudiantes = new ArrayList();
    private static Examen ExamenEvaluar;
    private static Stack<Estudiante> Examenes = new Stack();

    public void CrearExamen(Examen E) {
        ExamenEvaluar = E;
    }

    public boolean CalificarEstudiante(int Preguntas) {
        Estudiante E = Examenes.pop();
        E.setNota(((double)  5 / ExamenEvaluar.getPreguntas()) * Preguntas);
        Estudiantes.add(E);
        if (Examenes.size() <= 0) {
            return true;
        } else {
            return false;
        }
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
            Read.add(new String[]{Item.getCodigo(), Item.getNombre(), Item.getNota()+""});
        });
        return Read;
    }

    public void AgregarExamen(Estudiante E) {
        Examenes.push(E);
    }
    
    public boolean ValidarPregunta(int Pregunta){
        if(Pregunta < ExamenEvaluar.getPreguntas() || Pregunta > ExamenEvaluar.getPreguntas()){
            return false;
        }else{
            return true;
        }
    }
}

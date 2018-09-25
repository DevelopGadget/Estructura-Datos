package Controller;

import Models.Estudiante;
import Models.Examen;
import java.util.ArrayList;
import java.util.Stack;


public class Controlador {
    
    private static ArrayList<Estudiante> Estudiantes = new ArrayList();
    private static Examen ExamenEvaluar;
    private static Stack<Estudiante> Examenes = new Stack();
    
    
    public void CrearExamen(Examen E){
        ExamenEvaluar = E;
    }
    
    public void CalificarEstudiante(int Preguntas){
        Estudiante E = Examenes.pop();
        E.setNota((ExamenEvaluar.getPreguntas() / 5) * Preguntas);
        Estudiantes.add(E);
    }
}

package Controlador;

import Modelo.Prenda;
import java.util.Vector;

public class PrendaController {

    private static Vector<Prenda> Prendas = new Vector();

    public PrendaController() {
    }

    public void Crear(Prenda P) {
        Prendas.add(P);
    }

    public Vector<String[]> ConsultarEstado(String Estado) {
        Vector<String[]> Find = new Vector();
        Prendas.forEach(Prenda -> {
            if (Prenda.getEstado().equals(Estado)) {
                Find.add(new String[]{Prenda.getCodigo(), Prenda.getTipo(), Prenda.getColor(), Prenda.getEstado(), Prenda.getTalla()});
            }
        });
        return Find;
    }

    public void CambiarEstado(String Estado, String Codigo) {
        Prendas.forEach(Prenda -> {
            if (Prenda.getCodigo().equals(Codigo)) {
                Prenda.setEstado(Estado);
            }
        });
    }

}

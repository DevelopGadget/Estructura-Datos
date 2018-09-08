package Controllers;

import Models.Jugador;
import java.util.ArrayList;
import java.util.Vector;

public class JugadorController {

    private static final Vector<Jugador> Jugadores = new Vector();

    public void Create(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public Vector<String[]> Read() {
        Vector<String[]> Find = new Vector();
        Jugadores.forEach(Jug -> {
            Find.add(new String[]{Jug.getNombre(), Jug.Edad() + "", Jug.getEstatura() + "", Jug.getPosicion()});
        });
        return Find;
    }

    public String[] OrdenarEdad() {
        String[] Ordenado = new String[Jugadores.size()];
        for (int i = 0; i < Jugadores.size(); i++) {
            Ordenado[i] = Jugadores.get(i).getNombre();
        }
        for (int i = 0; i < Jugadores.size() - 1; i++) {
            for (int j = 0; j < Jugadores.size() - i - 1; j++) {
                if (Jugadores.get(j + 1).Edad() <= Jugadores.get(j).Edad()) {
                    if (!Jugadores.get(j + 1).getNombre().equals(Jugadores.get(j).getNombre())) {
                        String aux = Ordenado[j + 1];
                        Ordenado[j + 1] = Ordenado[j];
                        Ordenado[j] = aux;
                    }
                }
            }
        }
        return Ordenado;
    }
}

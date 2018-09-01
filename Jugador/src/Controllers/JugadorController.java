package Controllers;

import Models.Jugador;
import java.util.Vector;

public class JugadorController {

    private static final Vector Jugadores = new Vector();

    public void Create(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public Jugador Read(int Index) {
        return (Jugador) Jugadores.get(Index);    
    }

    public void Delete(int Index) {
        Jugadores.remove(Index);
    }

    public void Update(int Index, Jugador jugador) {
        Jugadores.set(Index, jugador);
    }
}

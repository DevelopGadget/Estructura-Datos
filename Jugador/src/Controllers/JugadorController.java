package Controllers;

import Models.Jugador;
import java.util.ArrayList;
import java.util.Vector;

public class JugadorController {

    private static final Vector<Jugador> Jugadores = new Vector();

    public void Create(Jugador jugador) {
        Jugadores.add(jugador);
    }
    
    public Vector<String[]> Read (){
        Vector<String[]> Find = new Vector();
        Jugadores.forEach(Jug -> {
            Find.add(new String[]{Jug.getNombre(), Jug.Edad()+"", Jug.getEstatura()+"", Jug.getPosicion()});
        });
        return Find;
    }
}

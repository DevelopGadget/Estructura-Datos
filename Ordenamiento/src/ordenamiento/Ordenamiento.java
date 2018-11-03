package ordenamiento;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenamiento {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("f");
        lista.add("A");
        lista.add("d");
        lista.add("c");
        lista.add("b");
        lista.add("a");

        Collections.sort(lista, String::compareToIgnoreCase);

        lista.forEach(OtraCosa::Otra);
    }

    public static boolean Otra(String L) {
                    System.out.println(L);
        return true;
    }

}

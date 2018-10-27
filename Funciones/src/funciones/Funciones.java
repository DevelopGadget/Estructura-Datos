package funciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Funciones {

    public static void main(String[] args) {
        List<Integer> Nombre = new ArrayList();
        for(int i = 0; i < 1000; i++){
            Nombre.add(i);
        }
        
        BiFunction<List<Integer>,Predicate<Integer>, List<Integer>> Filtro;
        
        Filtro = (list, predicado) -> {
            List<Integer> Result = new ArrayList();
            for(Integer r : list) if(predicado.test(r)) Result.add(r);
            return Result;
        };
        
        System.err.println(Arrays.toString(Filtro.apply(Nombre, x -> true).toArray()));
    }
    
}

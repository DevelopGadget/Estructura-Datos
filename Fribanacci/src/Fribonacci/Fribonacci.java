package Fribonacci;

import java.util.Vector;

public class Fribonacci {

    static Vector<Long> vector = new Vector();

    public static void main(String[] args) {
        Fribonacci(40, 0);
//        for (int i = 0; i <= 40; i++) {
//            if (vector.isEmpty()) {
//                vector.add(new Long(0));
//                vector.add(new Long(1));
//            }
//            vector.add(vector.get(vector.size() - 2) + vector.get(vector.size() - 1));
//            System.err.println(vector.get(i));
//        }
    }

    private static void Fribonacci(int limit, int i) {
        if (vector.isEmpty()) {
            vector.add(new Long(0));
            vector.add(new Long(1));
        }
        vector.add(vector.get(vector.size() - 2) + vector.get(vector.size() - 1));
        System.err.println(vector.get(i));
        i++;
        if (i <= limit) {
            Fribonacci(limit, i);
        }
    }
}

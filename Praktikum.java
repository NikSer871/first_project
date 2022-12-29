import java.util.ArrayList;
import java.util.HashMap;


class Praktikum {

    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<>();
        a.add(1.0);
        a.add(1.0);
        a.add(4.0);
        a.remove(100.0);
        System.out.println(a);
        HashMap<Integer, ArrayList<Double>> he = new HashMap<>();
        he.put(123, a);
        for(Integer j : he.keySet()){
            System.out.println(j);
        }

    }
}

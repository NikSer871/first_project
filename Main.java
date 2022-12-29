import java.util.ArrayList;
import java.util.HashMap;


class Main {

    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<>();
        a.add(5.0);
        a.add(5.0);
        a.add(5.0);
        a.remove(100.0);
        System.out.println(a);
        HashMap<Integer, ArrayList<Double>> he = new HashMap<>();
        he.put(123, a);
        for(Integer j : he.keySet()){
            System.out.println(j);
        }

    }
}

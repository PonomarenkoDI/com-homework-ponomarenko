package homeWork9.pr8_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cycle> cycles = new ArrayList<>();

        //Upcasting
        cycles.add(new Unicycle());
        cycles.add(new Bicycle());
        cycles.add(new Tricycle());

        for (Cycle c: cycles) {
            //c.balance();
        }

        //downcusting
        Unicycle unicycle =(Unicycle) cycles.get(0);
        Bicycle bicycle =(Bicycle) cycles.get(1);
        Tricycle tricycle =(Tricycle) cycles.get(2);
        unicycle.balance();
        bicycle.balance();
        tricycle.balance();
    }
}

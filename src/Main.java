import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        int i = 1;
//        while(true){
//            arr.add("bucle");
//            System.out.println(i);
//            i++;
//        }
        algo(1);
    }

    private static void algo(int i) {
        System.out.println(i);

        try {
            sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        algo(i + 1);
    }
}

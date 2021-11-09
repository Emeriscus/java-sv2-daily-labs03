package day04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sultan {
    public static void main(String[] args) {
        Prison prison = new Prison();

        prison.openFreeCells();

        System.out.println("A 100. nap után nyitott cellák:");

        for (int i = 1;i<prison.getLocks().length;i++) {
            if (prison.getLocks()[i]) {
                System.out.println(i + ". cella nyitva");
            }

        }

//        for (boolean b : prison.getLocks()) {
//            if (b == true) {
//                System.out.println(b);
//            }
//        }
    }
}

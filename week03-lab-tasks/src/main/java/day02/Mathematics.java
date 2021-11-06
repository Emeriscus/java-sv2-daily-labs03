package day02;

public class Mathematics {

    public boolean isPrime(int number) {
        boolean b = true;
        int assist = 0;
        if (number != 0 && number != 1) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    assist++;
                }
            }
            if (assist > 1) {
                b = false;
            }
        } else {
            b = false;
        }
        return b;
    }
//   Másnak a megoldása. Nem kezeli a 0-t és az 1-et, de a ciklus kicsit egyszerűbb...
//
//    public boolean isPrime2(int number) {
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

}

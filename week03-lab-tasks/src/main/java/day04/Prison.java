package day04;

import java.util.Arrays;
import java.util.List;

public class Prison {

    private boolean[] locks = new boolean[101];

    public void openFreeCells() {
        for (int i = 1; i < locks.length; i++) {
            for (int j = i; j < locks.length; j+=i) {
                locks[j] = !locks[j];
            }
        }
    }

    public boolean[] getLocks() {
        return locks;
    }
}

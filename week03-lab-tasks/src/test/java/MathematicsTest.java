import day02.Mathematics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MathematicsTest {

    Mathematics mathematics = new Mathematics();

    @Test
    void testIsPrime() {
        mathematics.isPrime(17);
        assertEquals(true, mathematics.isPrime(17));
        assertEquals(false, mathematics.isPrime(0));
        assertEquals(false, mathematics.isPrime(1));
        assertEquals(false, mathematics.isPrime(4));

    }
}

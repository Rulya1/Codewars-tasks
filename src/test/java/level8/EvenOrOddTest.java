package level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {
    @Test
    void Even() {
        String res1 = EvenorOddNumber.even_or_odd(4);
        assertEquals("Even", res1);
    }

    @Test
    void Odd() {
        String res2 = EvenorOddNumber.even_or_odd(15);
        assertEquals("Odd", res2);
    }
}

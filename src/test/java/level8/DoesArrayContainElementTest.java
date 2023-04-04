package level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DoesArrayContainElementTest {
    @Test
    void DoesArrayContainElement() {
        int res = 5;
        String[] array = {"abc", "ab"};
        boolean act = DoesArrayContainElement.check(array,"ab");
        assertEquals(true, act);

    }
}

package level7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkWithDigitsTest {
    @Test
    void CheckNumber4(){
        String checknumber4 = WorkWithDigits.fakeBin("4");
        assertEquals("0", checknumber4);
    }
    @Test
    void CheckNumber8(){
        String checknumber8 = WorkWithDigits.fakeBin("8");
        assertEquals("1" , checknumber8);
    }
}

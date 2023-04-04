package level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class quarterOfMonthTest {
    @Test
    void quarterofMonth(){
        int res1 = quarterOfMonth.quarterOf(2);
        assertEquals(1 , res1);
        int res2 = quarterOfMonth.quarterOf(6);
        assertEquals(2,res2);
        int res3 = quarterOfMonth.quarterOf(9);
        assertEquals(3,res3);
        int res4 = quarterOfMonth.quarterOf(11);
        assertEquals(4,res4);
    }
}

package level7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameIntoInitialsTest {
    @Test
    void CheckingInitialChuckNorris() {
        String check1 = NameIntoInitials.abbrevName("Chuck Norris");
        assertEquals("C.N", check1);
    }
    @Test
    void CheckingInitialRuslanDolbaeb() {
        String check2 = NameIntoInitials.abbrevName("Sasuke Uchiha");
        assertEquals("S.U", check2);
    }
}

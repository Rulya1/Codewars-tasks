package level7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreYouPlayingBangoTest {
    @Test
    void DoesorNotVolodymyrPlayBango() {
        String Volodymyr = AreYouPlayingBango.areYouPlayingBanjo("Volodymyr");
        assertEquals("Volodymyr does not play banjo", Volodymyr);
    }

    @Test
    void RuslanPlayBango() {
        String Ruslan = AreYouPlayingBango.areYouPlayingBanjo("Ruslan");
        assertEquals("Ruslan plays banjo", Ruslan);
    }
}

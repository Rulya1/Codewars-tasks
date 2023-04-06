package level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficLightTest {
    @Test
    void whenRedShouldReturnGreen() {
        String res1 = TrafficLights.updateLight("red");
        assertEquals("green" , res1);
    }
}

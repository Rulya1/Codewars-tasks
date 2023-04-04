package level8;

import level8.CanCarRideOrNot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CarRideOrNotTest {

    @Test
    void shouldBeAbleToRide() {
        assertEquals(true, CanCarRideOrNot.zeroFuel(100, 50, 3));
    }

    @Test
    void shouldNotBeAbleToRide() {
        boolean actual = CanCarRideOrNot.zeroFuel(100, 50, 1);
        assertEquals(false, actual);
    }
}

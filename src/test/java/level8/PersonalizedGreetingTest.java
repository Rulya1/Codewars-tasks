package level8;

import level8.PersonalizedGreeting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonalizedGreetingTest {
    @Test
    void PersonalizedGreeting() {
        String res = PersonalizedGreeting.greet("Vova","Dolbaeb");
        assertEquals("Hello guest" , res );
        String res2 = PersonalizedGreeting.greet("Vova" , "Vova");
        assertEquals("Hello boss" , res2);
    }
}


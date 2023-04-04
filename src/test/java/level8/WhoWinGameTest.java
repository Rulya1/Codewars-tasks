package level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhoWinGameTest {
    @Test
    void WhoWinGame(){
        String res1 = WhoWinGame.rps("rock" , "scissors" );
        assertEquals("Player 1 won!" , res1);
    }
    @Test
    void WhoWinGameFail(){
        String res2 = WhoWinGame.rps("rock" , "scissors");
        assertEquals(false, res2 );
    }
}

package level8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhoWinGameTest {
    @Test
    void Player1WinGame(){
        String res1 = WhoWinGame.rps("rock" , "scissors" );
        assertEquals("Player 1 won!" , res1);
    }
    @Test
    void Player2WinGame(){
        String res2 = WhoWinGame.rps("scissors", "rock");
        assertEquals("Player 2 won!", res2 );
    }
}

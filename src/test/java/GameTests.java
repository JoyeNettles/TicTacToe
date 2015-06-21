import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;

import static org.mockito.Mockito.*;


/**
 * Created by jnettles on 6/21/15.
 */
public class GameTests {

    private TicTacToeBoard ticTacToeBoard;
    private Player player1, player2;
    private Game game;

    @Before
    public void setUp(){
        ticTacToeBoard = mock(TicTacToeBoard.class);
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        game = new Game(ticTacToeBoard, player1, player2);
    }

    @Test
    public void shouldDrawBoardWhenGameStarts(){
        game.playGame();
        verify(ticTacToeBoard, times(2)).draw();
    }

    @Test
    public void shouldPromptPlayerOneToMoveWhenGameStarts(){
        game.playGame();
        verify(player1).move();
    }


}

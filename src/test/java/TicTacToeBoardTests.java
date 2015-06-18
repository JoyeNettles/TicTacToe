import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.*;


/**
 * Created by jnettles on 6/18/15.
 */
public class TicTacToeBoardTests {

    private PrintStream printStream;
    private TicTacToeGame game;
    private TicTacToeBoard ticTacToeBoard;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        game = mock(TicTacToeGame.class);
        ticTacToeBoard = new TicTacToeBoard(printStream);
    }


    @Test
    public void shouldDrawBoardWhenGameStarts(){
        ticTacToeBoard.displayBoard();
        verify(printStream).println("  |  |  " +
                "\n" + "---------" +
                "\n" + "  |  |  " +
                "\n" + "---------" +
                "\n" + "  |  |  ");
    }

}

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;


/**
 * Created by jnettles on 6/18/15.
 */
public class TicTacToeBoardTests {

    private PrintStream printStream;
    private TicTacToeGame game;
    private TicTacToeBoard ticTacToeBoard;
    private UserInputHandler userInputHandler;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        game = mock(TicTacToeGame.class);
        userInputHandler = mock(UserInputHandler.class);
        ticTacToeBoard = new TicTacToeBoard(printStream, userInputHandler);
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

        @Test
    public void shouldPrintAnXOnTheBoardWhenANumberBetweenOneAndNineIsEntered(){
        when(userInputHandler.readInput()).thenReturn(1);
        int userInput = userInputHandler.readInput();
        ticTacToeBoard.markBoard(userInput);
            verify(printStream).println("X");
    }

}

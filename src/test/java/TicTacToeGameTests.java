import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by jnettles on 6/18/15.
 */
public class TicTacToeGameTests {
    private PrintStream printStream;
    private TicTacToeGame game;
    private TicTacToeBoard ticTacToeBoard;
    private UserInputHandler userInputHandler;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        ticTacToeBoard = mock(TicTacToeBoard.class);
        userInputHandler = mock(UserInputHandler.class);
        game = new TicTacToeGame(printStream, ticTacToeBoard, userInputHandler);
    }

    @Test
    public void shouldDrawEmptyBoardWhenGameStarts() {
        game.setUp();
        verify(ticTacToeBoard).displayEmptyBoard();
    }


    }

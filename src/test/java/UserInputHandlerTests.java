import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by jnettles on 6/18/15.
 */
public class UserInputHandlerTests {
    private PrintStream printStream;
    private TicTacToeGame game;
    private TicTacToeBoard ticTacToeBoard;
    private TicTacToeBufferedReader ticTacToeBufferedReader;
    private UserInputHandler userInputHandler;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        ticTacToeBoard = mock(TicTacToeBoard.class);
        game = new TicTacToeGame(printStream, ticTacToeBoard, userInputHandler);
        ticTacToeBufferedReader = mock(TicTacToeBufferedReader.class);
        userInputHandler = new UserInputHandler(printStream, ticTacToeBufferedReader);
    }

    @Test
    public void shouldPromptPlayerToEnterANumberBetweenOneAndNineWhenInputIsDesired(){
        userInputHandler.promptForMove();
        verify(printStream).print("Please enter a number between 1 and 9: \t");
    }

    @Test
    public void shouldRetrievePlayerInputAfterPromptingForMove(){
        when(ticTacToeBufferedReader.readLine()).thenReturn("1");
        userInputHandler.promptForMove();
        verify(ticTacToeBufferedReader).readLine();
    }


}

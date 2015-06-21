import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * Created by jnettles on 6/21/15.
 */
public class PlayerTests {

    private PrintStream printStream;
    private Player player;
    private TicTacToeBoard ticTacToeBoard;
    private GameBufferedReader reader;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        ticTacToeBoard = mock(TicTacToeBoard.class);
        reader = mock(GameBufferedReader.class);

        player = new Player(printStream, ticTacToeBoard, reader);
    }

    @Test
    public void shouldPromptPlayerToMakeAMove()  {
        when(reader.readLine()).thenReturn("5");
        player.move();

        verify(printStream).println(contains("enter a number between 1 and 9: \t"));
    }

    @Test
    public void shouldMarkBoardInPositionOneWhenUserEntersOne() {
        when(reader.readLine()).thenReturn("1");
        player.move();
        verify(ticTacToeBoard).mark(1);
    }

    @Test
    public void shouldMarkBoardInPositionFiveWhenUserEntersFive()  {
        when(reader.readLine()).thenReturn("5");
        player.move();
        verify(ticTacToeBoard).mark(5);
    }

    @Test
    public void shouldNotCrashIfUserInputIsNotBetweenOneAndNine(){
        when(reader.readLine()).thenReturn("89").thenReturn("-8").thenReturn("15").thenReturn("5");
        player.move();
        verify(ticTacToeBoard).mark(5);
    }

}

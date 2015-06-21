import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * Created by jnettles on 6/21/15.
 */
public class PlayerTests {

    private PrintStream printStream;
    private Player player;
    private TicTacToeBoard ticTacToeBoard;
    private BufferedReader reader;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        ticTacToeBoard = mock(TicTacToeBoard.class);
        reader = mock(BufferedReader.class);

        player = new Player(printStream, ticTacToeBoard, reader);
    }

    @Test
    public void shouldPromptPlayerToMakeAMove() throws IOException {
        when(reader.readLine()).thenReturn("5");
        player.move();

        verify(printStream).println("Player 1, enter a number between 1 and 9: \t");
    }

    @Test
    public void shouldMarkBoardInPositionOneWhenUserEntersOne() throws IOException {
        when(reader.readLine()).thenReturn("1");
        player.move();
        verify(ticTacToeBoard).mark(1);
    }

    @Test
    public void shouldMarkBoardInPositionFiveWhenUserEntersFive() throws IOException {
        when(reader.readLine()).thenReturn("5");
        player.move();
        verify(ticTacToeBoard).mark(5);
    }
}

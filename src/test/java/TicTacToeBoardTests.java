import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;


/**
 * Created by jnettles on 6/18/15.
 */
public class TicTacToeBoardTests {


    @Test
    public void shouldDrawABoard(){
        PrintStream printStream = mock(PrintStream.class);
        new TicTacToeBoard(printStream).draw();

        verify(printStream).println(
                "  |  | \n" +
                "--------\n" +
                "  |  | \n" +
                "--------\n" +
                "  |  | \n");
    }

}

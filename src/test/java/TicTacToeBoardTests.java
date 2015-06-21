import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;


/**
 * Created by jnettles on 6/18/15.
 */
public class TicTacToeBoardTests {


    private PrintStream printStream;
    private TicTacToeBoard ticTacToeBoard;
    private List<String> boardCells;

    @Before
    public void setUp()  {
        this.printStream = mock(PrintStream.class);
        this.boardCells = Arrays.asList(" ", " ", " ", " ", " ", " ", " ", " ", " ");
        ticTacToeBoard = new TicTacToeBoard(printStream, boardCells);
    }

    @Test
    public void shouldDrawABoard(){
        ticTacToeBoard.draw();

        verify(printStream).print(
                "  |   |   \n" +
                        "--------\n" +
                        "  |   |   \n" +
                        "--------\n" +
                        "  |   |   \n");
    }

    @Test
    public void shouldDrawMarkedCellOnBoardWhenCellIsMarked(){
        int position = 3;
        ticTacToeBoard.mark(position);

        assertThat(boardCells.get(2), is("X"));
    }

    @Test
    public void shouldDrawAllCellsAsMarked(){
        for (int i = 1; i < 10; i++) {
            boardCells.set(i-1, "" + i);
        }
        ticTacToeBoard.draw();
        verify(printStream).print(
                " 1| 2 | 3 \n" +
                "--------\n" +
                " 4| 5 | 6 \n" +
                "--------\n" +
                " 7| 8 | 9 \n");
    }



}

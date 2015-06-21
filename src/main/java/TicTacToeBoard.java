import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jnettles on 6/18/15.
 */
public class TicTacToeBoard {
    PrintStream printStream;
    List<String> boardCells;

    public TicTacToeBoard(PrintStream printStream, List<String> boardCells){
        this.printStream = printStream;
        this.boardCells = boardCells;
    }

    public void draw() {

        printStream.print(String.format(
                " %s| %s | %s \n" +
                        "--------\n" +
                        " %s| %s | %s \n" +
                        "--------\n" +
                        " %s| %s | %s \n",
                boardCells.get(0), boardCells.get(1), boardCells.get(2), boardCells.get(3), boardCells.get(4), boardCells.get(5), boardCells.get(6), boardCells.get(7), boardCells.get(8)));
    }

    public void mark(int position) {
       boardCells.set(position-1, "X");
    }
}

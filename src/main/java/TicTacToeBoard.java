import java.io.PrintStream;
import java.lang.reflect.Array;

/**
 * Created by jnettles on 6/18/15.
 */
public class TicTacToeBoard {
    PrintStream printStream;

    public TicTacToeBoard(PrintStream printStream){
        this.printStream = printStream;
    }

    public void draw() {
        printStream.println(
                "  |  | \n" +
                        "--------\n" +
                        "  |  | \n" +
                        "--------\n" +
                        "  |  | \n");
    }
}

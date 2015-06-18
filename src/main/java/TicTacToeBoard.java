import java.io.PrintStream;

/**
 * Created by jnettles on 6/18/15.
 */
public class TicTacToeBoard {

    private PrintStream printStream;

    public TicTacToeBoard(PrintStream printStream){
        this.printStream = printStream;
    }

    public void displayBoard(){
        printStream.println("  |  |  " +
                "\n" + "---------" +
                "\n" + "  |  |  " +
                "\n" + "---------" +
                "\n" + "  |  |  ");
    }

}

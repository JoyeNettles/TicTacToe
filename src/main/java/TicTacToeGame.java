import java.io.PrintStream;

/**
 * Created by jnettles on 6/18/15.
 */
public class TicTacToeGame {

    private PrintStream printStream;
    private TicTacToeBoard ticTacToeBoard;

    public TicTacToeGame(PrintStream printStream, TicTacToeBoard ticTacToeBoard) {
        this.printStream = printStream;
        this.ticTacToeBoard = ticTacToeBoard;
    }

    public void setUp() {
        ticTacToeBoard.displayBoard();
    }

    public void playGame(){

    }

}

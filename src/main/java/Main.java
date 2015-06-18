import java.io.PrintStream;

/**
 * Created by jnettles on 6/18/15.
 */
public class Main {

    public static void main(String[] args) {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard(System.out);
        TicTacToeGame ticTacToeGame = new TicTacToeGame(System.out, ticTacToeBoard);
        ticTacToeGame.start();
    }
}

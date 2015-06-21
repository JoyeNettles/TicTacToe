import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by jnettles on 6/21/15.
 */
public class Player {
    private PrintStream printStream;
    private TicTacToeBoard ticTacToeBoard;
    private BufferedReader reader;

    public Player(PrintStream printStream, TicTacToeBoard ticTacToeBoard, BufferedReader reader) {
        this.printStream = printStream;
        this.ticTacToeBoard = ticTacToeBoard;
        this.reader = reader;
    }

    public void move() {
        printStream.println("Player 1, enter a number between 1 and 9: \t");
        int input = 0;
        try {
            input = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        ticTacToeBoard.mark(input);
    }
}
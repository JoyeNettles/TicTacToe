import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by jnettles on 6/18/15.
 */
public class Main {

    public static void main(String[] args) {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard(System.out);
        GameBufferedReader reader = new GameBufferedReader(new InputStreamReader(System.in));
        Player player = new Player(System.out, ticTacToeBoard, reader);

        Game game = new Game(ticTacToeBoard, reader, player);
        game.playGame();
    }
}

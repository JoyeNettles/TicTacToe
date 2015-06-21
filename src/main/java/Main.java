import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jnettles on 6/18/15.
 */
public class Main {

    public static void main(String[] args) {
        List<String> boardCells = Arrays.asList(" ", " ", " ", " ", " ", " ", " ", " ", " ");
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard(System.out, boardCells);
        GameBufferedReader reader = new GameBufferedReader(new InputStreamReader(System.in));
        Player player1 = new Player(System.out, ticTacToeBoard, reader);
        Player player2 = new Player(System.out, ticTacToeBoard, reader);

        Game game = new Game(ticTacToeBoard,  player1, player2);
        game.playGame();
    }
}

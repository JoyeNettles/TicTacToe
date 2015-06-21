import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        Player player = new Player(System.out, ticTacToeBoard, reader);

        Game game = new Game(ticTacToeBoard,  player);
        game.playGame();
    }
}

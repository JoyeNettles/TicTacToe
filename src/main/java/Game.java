import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by jnettles on 6/21/15.
 */
public class Game {

    private final TicTacToeBoard ticTacToeBoard;
    private final Player player;

    public Game(TicTacToeBoard ticTacToeBoard, Player player) {
        this.ticTacToeBoard = ticTacToeBoard;
        this.player = player;
    }

    public void playGame(){
        ticTacToeBoard.draw();
        player.move();
        ticTacToeBoard.draw();

    }
}

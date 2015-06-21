/**
 * Created by jnettles on 6/21/15.
 */
public class Game {

    private final TicTacToeBoard ticTacToeBoard;
    private final Player player1, player2;

    public Game(TicTacToeBoard ticTacToeBoard, Player player1, Player player2) {
        this.ticTacToeBoard = ticTacToeBoard;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame(){
        ticTacToeBoard.draw();
        player1.move();
        ticTacToeBoard.draw();

    }
}

/**
 * Created by jnettles on 6/21/15.
 */
public class Referee {

    private Player player1, player2;
    private TicTacToeBoard ticTacToeBoard;

    public Referee(Player player1, Player player2, TicTacToeBoard ticTacToeBoard){
        this.player1 = player1;
        this.player2 = player2;
        this.ticTacToeBoard = ticTacToeBoard;
    }


    public String requestMove() {
        int availableSpots = 7;
        if(availableSpots % 2 == 1){
            player1.move();
        }else{
            player2.move();
        }

        return "O";
    }
}

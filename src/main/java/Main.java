import java.io.InputStreamReader;

/**
 * Created by jnettles on 6/18/15.
 */
public class Main {

    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        TicTacToeBufferedReader ticTacToeBufferedReader = new TicTacToeBufferedReader(in);
        UserInputHandler userInputHandler = new UserInputHandler(System.out, ticTacToeBufferedReader);
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard(System.out, userInputHandler);
        TicTacToeGame ticTacToeGame = new TicTacToeGame(System.out, ticTacToeBoard, userInputHandler);
        ticTacToeGame.setUp();
        ticTacToeGame.playGame();


    }
}

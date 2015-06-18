import java.io.PrintStream;

/**
 * Created by jnettles on 6/18/15.
 */
public class TicTacToeGame {

    private PrintStream printStream;
    private TicTacToeBoard ticTacToeBoard;
    private UserInputHandler userInputHandler;

    public TicTacToeGame(PrintStream printStream, TicTacToeBoard ticTacToeBoard, UserInputHandler userInputHandler) {
        this.printStream = printStream;
        this.ticTacToeBoard = ticTacToeBoard;
        this.userInputHandler = userInputHandler;
    }

    public void setUp() {
        printStream.println("---------- TIC TAC TOE TIME!! ----------");
        ticTacToeBoard.displayEmptyBoard();
    }

    public void playGame(){
        int userInput = userInputHandler.promptForMove();
        int count = 0;
        ticTacToeBoard.markBoard(userInput);
        ticTacToeBoard.displayBoard();
    }

}

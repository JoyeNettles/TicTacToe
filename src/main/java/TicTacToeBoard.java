import java.io.PrintStream;

/**
 * Created by jnettles on 6/18/15.
 */
public class TicTacToeBoard {

    private PrintStream printStream;

    public TicTacToeBoard(PrintStream printStream, UserInputHandler userInputHandler){
        this.printStream = printStream;
    }

    public void displayBoard(){
        printStream.println("  |  |  " +
                "\n" + "---------" +
                "\n" + "  |  |  " +
                "\n" + "---------" +
                "\n" + "  |  |  ");
    }

    public void markBoard(int userInput) {
        printStream.println("X");
    }
}

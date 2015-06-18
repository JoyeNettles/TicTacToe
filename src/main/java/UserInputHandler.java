import java.io.BufferedReader;
import java.io.PrintStream;

/**
 * Created by jnettles on 6/18/15.
 */
public class UserInputHandler {
    private PrintStream printStream;
    private TicTacToeBufferedReader bufferedReader;

    public UserInputHandler(PrintStream printStream, TicTacToeBufferedReader ticTacToeBufferedReader){
        this.printStream = printStream;
        this.bufferedReader = ticTacToeBufferedReader;
    }

    public void promptForMove() {
        printStream.print("Please enter a number between 1 and 9: \t");
    }

    public int readInput(){
        printStream.print("Enter an option: ");
        int input;

        try {
            input = Integer.parseInt(bufferedReader.readLine());

            if(input < 1 || input > 9){
//                input = -1;
//                printStream.println("Select a valid option!");
            }
        } catch (NumberFormatException numFormatException) {
            input = -1;
            printStream.println("Select a valid option!");
        }

        return input;
    }

}

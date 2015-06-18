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

    public int promptForMove() {

        printStream.print("Please enter a number between 1 and 9: \t");
        int userInput = readInput();
        return userInput;
    }

    public int readInput(){
        int input;

        try {
            input = Integer.parseInt(bufferedReader.readLine());

            if(input < 1 || input > 9){
                input = -1;
            }
        } catch (NumberFormatException numFormatException) {
            input = -1;
        }

        return input;
    }

}

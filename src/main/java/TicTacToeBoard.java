import java.io.PrintStream;
import java.lang.reflect.Array;

/**
 * Created by jnettles on 6/18/15.
 */
public class TicTacToeBoard {

    private PrintStream printStream;
    private UserInputHandler userInputHandler;
    private boolean[][] boardMarks;

    public TicTacToeBoard(PrintStream printStream, UserInputHandler userInputHandler){
        this.printStream = printStream;
        this.userInputHandler = userInputHandler;
        boardMarks = new boolean[3][3];
    }

    public void displayBoard(){
//       int count = 0;
//        for(int i=0; i<boardMarks.length; i++){
//            if(boardMarks[i]){
//                printStream.print("X ");
//            }else{
//                printStream.print("  ");
//            }
//
//            if(count == 3){
//                printStream.print("\n");
//                count = 0;
//            }
//            count++;
//        }

    }


    public void displayEmptyBoard(){
        printStream.println(" | | " +
                "\n" + "------" +
                "\n" + " | | " +
                "\n" + "------" +
                "\n" + " | | ");
    }

    public void markBoard(int userInput) {
        int ROW = userInput / 3;
        int COLUMN = (userInput % 3) -1;
        boardMarks[ROW][COLUMN] = true;
        printStream.println("Actual: " + boardMarks[ROW][COLUMN]);

        printStream.println("X");
     }


    public boolean[][] getBoardMarks() {
        return boardMarks;
    }
}

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
        int row = 0;
        int column = 0;

        if(userInput%3 == 0){ // handles divisible by 3
            row = (userInput/3) -1;
            column = 2;
        } else if(userInput <3){
            userInput--;
            row = 0;
            column = userInput -1;
        } else{
            userInput--;
            row = userInput / 3;
            column= (userInput % 3) ;
        }
        boardMarks[row][column] = true;

        printStream.println("X");
     }


    public boolean[][] getBoardMarks() {
        return boardMarks;
    }
}

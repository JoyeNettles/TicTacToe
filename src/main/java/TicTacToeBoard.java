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

        for(int row = 0; row<3; row++){
            for(int column = 0; column<3; column++){
                if(boardMarks[row][column]){
                printStream.print(" X");
                }else{
                    printStream.print("  ");
                }
            }
            printStream.println();
            if (row != 2) {
                printStream.println("------");

            }
        }

    }


    public void displayEmptyBoard(){
        printStream.println(" | | " +
                "\n" + "------" +
                "\n" + " | | " +
                "\n" + "------" +
                "\n" + " | | ");
    }

    public void markBoard(int userInput) {

        int[] positions = calculateBoardPlacement(userInput);

        boardMarks[positions[0]][positions[1]] = true;

//        printStream.println("X");
     }

    private int[] calculateBoardPlacement(int userInput){
        int[] positions = new int[2];
        int row, column;

        if(userInput%3 == 0){
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

        positions[0] = row;
        positions[1] = column;

        return positions;
    }

    public boolean[][] getBoardMarks() {
        return boardMarks;
    }
}

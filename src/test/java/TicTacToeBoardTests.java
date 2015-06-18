import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;


/**
 * Created by jnettles on 6/18/15.
 */
public class TicTacToeBoardTests {

    private PrintStream printStream;
    private TicTacToeGame game;
    private TicTacToeBoard ticTacToeBoard;
    private UserInputHandler userInputHandler;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        game = mock(TicTacToeGame.class);
        userInputHandler = mock(UserInputHandler.class);
        ticTacToeBoard = new TicTacToeBoard(printStream, userInputHandler);
    }

    @Test
    public void shouldDrawEmptyBoard(){
        ticTacToeBoard.displayEmptyBoard();
        verify(printStream).println(" | | " +
                "\n" + "------" +
                "\n" + " | | " +
                "\n" + "------" +
                "\n" + " | | ");
    }

//        @Test
//    public void shouldPrintAnXWhenAPositionIsReceived(){
//        when(userInputHandler.readInput()).thenReturn(1);
//        int userInput = userInputHandler.readInput();
//        ticTacToeBoard.markBoard(userInput);
//            verify(printStream).println("X");
//    }

    @Test
    public void shouldStoreUserInputInFirstRowLastColumnOfBoardArray(){
        when(userInputHandler.readInput()).thenReturn(3);
        int userInput = userInputHandler.readInput();
        ticTacToeBoard.markBoard(userInput);
        assertThat(ticTacToeBoard.getBoardMarks()[0][2], is(true));
    }
//
//    @Test
//    public void shouldStoreUserInputInFirstRowOfBoardArray(){
//        when(userInputHandler.readInput()).thenReturn(23);
//        int userInput = userInputHandler.readInput();
//        ticTacToeBoard.markBoard(userInput);
//        printStream.println("Desired: " + ticTacToeBoard.getBoardMarks()[1][1]);
//        assertThat(ticTacToeBoard.getBoardMarks()[0][1], is(true));
//    }

    @Test
    public void shouldStoreUserInputInSecondRowOfBoardArrayWhenInputIsNotDivisibleByThree(){
        when(userInputHandler.readInput()).thenReturn(5);
        int userInput = userInputHandler.readInput();
        ticTacToeBoard.markBoard(userInput);
        assertThat(ticTacToeBoard.getBoardMarks()[1][1], is(true));
    }

    @Test
    public void shouldStoreUserInputInThirdRowOfBoardArrayWhenInputIsNotDivisibleByThree(){
        when(userInputHandler.readInput()).thenReturn(8);
        int userInput = userInputHandler.readInput();
        ticTacToeBoard.markBoard(userInput);
        assertThat(ticTacToeBoard.getBoardMarks()[2][1], is(true));
    }

    @Test
    public void shouldStoreUserInputInBoardArrayWhenInputIsDivisibleByThree(){
        when(userInputHandler.readInput()).thenReturn(6);
        int userInput = userInputHandler.readInput();
        ticTacToeBoard.markBoard(userInput);
        assertThat(ticTacToeBoard.getBoardMarks()[1][2], is(true));
    }

    @Test
    public void shouldPrintBoardWithXFormattedCorrectly(){
//        ticTacToeBoard.getBoardMarks()[0][1] = true;
//        ticTacToeBoard.getBoardMarks()[1][1] = true;
//
//        ticTacToeBoard.displayBoard();
//        verify(printStream).println();
    }

}

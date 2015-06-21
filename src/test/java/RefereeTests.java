import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by jnettles on 6/21/15.
 */
public class RefereeTests {

    private Player player1;
    private Player player2;
    private TicTacToeBoard ticTacToeBoard;
    private Referee referee;

    @Before
    public void setUp() throws Exception {
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        ticTacToeBoard = mock(TicTacToeBoard.class);
        referee = new Referee(player1, player2, ticTacToeBoard);
    }

    @Test
    public void shouldAskPlayerOneForAMoveWhenItsAnOddNumberOfSpotsRemaining(){
        referee.requestMove();
        when(ticTacToeBoard.availableSpots()).thenReturn(7);
        verify(player1).move();
    }

  @Test
    public void shouldAskPlayerTwoForAMoveWhenItsAnEvenNumberOfSpotsRemaining(){
        referee.requestMove();
        when(ticTacToeBoard.availableSpots()).thenReturn(2);
        verify(player2).move();
    }

}

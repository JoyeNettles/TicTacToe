import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by jnettles on 6/18/15.
 */
public class TicTacToeBufferedReader extends BufferedReader {

    public TicTacToeBufferedReader( Reader in ) {
        super(in);
    }

    @Override
    public String readLine() {
        try {
            return super.readLine();
        } catch (IOException e) {
            throw new RuntimeIOException(e);
        }
    }
}

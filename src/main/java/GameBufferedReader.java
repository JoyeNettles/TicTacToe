import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class GameBufferedReader extends BufferedReader {
    public GameBufferedReader(Reader in) {
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
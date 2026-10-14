import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    InputStream in;
    public LowerCaseInputStream(InputStream in) {
        super(in);
        this.in = in;
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        if(c == -1) {
            return c;
        }
        return Character.toLowerCase((char)c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int numByteRead = in.read(b, off, len);
        //note: this will not work if using an encoding that has multiple bytes per char.
        for(int i = off; i < off + numByteRead; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return numByteRead;
    }

}

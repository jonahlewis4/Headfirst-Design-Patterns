import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException{
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")
                    )
            );
            for(int c; (c = in.read()) >= 0;) {
                System.out.print((char)c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

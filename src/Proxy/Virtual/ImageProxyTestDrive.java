
import javax.swing.*;
import java.net.URI;
import java.net.URL;

public class ImageProxyTestDrive {
    JLabel imageComponent;
    JFrame frame = new JFrame("Image Viewer");
    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        URL initialURL = URI.create("https://img.magnific.com/free-photo/closeup-shot-beautiful-butterfly-with-interesting-textures-orange-petaled-flower_181624-7640.jpg?semt=ais_hybrid&w=740&q=80").toURL();
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new JLabel(icon);

        frame.getContentPane().add(imageComponent);;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}

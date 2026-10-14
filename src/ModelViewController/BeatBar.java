package ModelViewController;

import javax.swing.*;
import java.awt.*;

public class BeatBar extends JProgressBar implements Runnable {
    Thread thread;

    public BeatBar() {
        super();
        setPreferredSize(new Dimension(150, 25));
        setStringPainted(true);
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    public void run() {
        while (true) {
            int value = getValue();
            value = (int)(value * .75);

            // Use SwingUtilities to safely update GUI components from a background thread
            int finalValue = value;
            SwingUtilities.invokeLater(() -> {
                setValue(finalValue);
                repaint();
            });

            try {
                Thread.sleep(50);
            } catch (Exception e) {
                // Ignore interruption
            }
        }
    }
}
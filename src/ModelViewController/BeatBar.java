package ModelViewController;

import javax.swing.*;
import java.awt.*;

public class BeatBar extends JProgressBar {
    Timer timer;

    public BeatBar() {
        super();
        setPreferredSize(new Dimension(150, 25));
        setMaximum(100);

        // Swing Timer fires on the event dispatch thread, so decaying the
        // value can't race with updateBeat() setting it to 100
        timer = new Timer(50, e -> setValue((int)(getValue() * .75)));
        timer.start();
    }
}

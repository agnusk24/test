package captchan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class captchan extends JFrame {

    public static void main(String[] args) {
        new captchan().show();
    }// main() ends here

    public captchan() {
        // frame constructor
        setTitle("Menu Example");
        setResizable(false);
        setSize(400, 200);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // pack controls and center window to screen
        pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int) (0.5 * (screenSize.width - getWidth())),
                (int) (0.5 * (screenSize.height - getHeight())),
                getWidth(), getHeight());
    }// MenuExample() constructor ends here
}

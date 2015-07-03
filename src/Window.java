import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.Stack;

/**
 * Created by cerebro on 03/07/15.
 */
public class Window extends JFrame {

    JPanel mainPanel;
    JButton button1;
    JButton button2;
    public JPanel openCardPanel1;
    public JPanel openCardPanel2;

    public static void main(String[] args) {
        Window myWindow = new Window();
        new Game(myWindow);
    }

    public Window() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setContentPane(mainPanel);

        this.setSize(600, 800);
        this.setVisible(true);
    }
}

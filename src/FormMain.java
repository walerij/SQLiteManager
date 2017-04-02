import javax.swing.*;
import java.awt.*;

/**
 * Created by Валера on 02.04.2017.
 */
public class FormMain extends JFrame {
    private JPanel panel;

    public FormMain() throws HeadlessException {
        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocation(200,300);
        this.setVisible(true);
    }
}

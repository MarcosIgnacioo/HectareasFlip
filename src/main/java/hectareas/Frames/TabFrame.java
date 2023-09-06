package hectareas.Frames;

import javax.swing.*;
import java.awt.*;

public class TabFrame extends JFrame {
    JFrame tabFrame = new JFrame();
    public TabFrame(JPanel contentPane) throws HeadlessException {
        tabFrame.setLayout(new BorderLayout());
        tabFrame.setContentPane(contentPane);
        tabFrame.setSize(300,200);
        tabFrame.setLocationRelativeTo(null);
        tabFrame.getContentPane().setBackground(Color.pink);
        tabFrame.setVisible(true);
        tabFrame.repaint();
        tabFrame.revalidate();
    }
}

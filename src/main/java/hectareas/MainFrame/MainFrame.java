package hectareas.MainFrame;

import javax.swing.*;

public class MainFrame extends JFrame {
    JFrame mainFrame;
    public MainFrame(JFrame frame){
        mainFrame = frame;
        mainFrame.repaint();
        mainFrame.revalidate();
    }
    public void reset(JFrame frame){
        mainFrame.removeAll();
        mainFrame = frame;
        mainFrame.repaint();
        mainFrame.revalidate();
    }
}

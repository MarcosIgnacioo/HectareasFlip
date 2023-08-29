package hectareas.MainFrame;

import javax.swing.*;

public class MainFrame extends JFrame {
    JFrame mainFrame = new JFrame();

    public MainFrame(JPanel contentPane, int width, int height){
        mainFrame.setContentPane(contentPane);
        mainFrame.setSize(width,height);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.repaint();
        mainFrame.revalidate();

    }

    public MainFrame(JPanel contentPane){
        mainFrame.setContentPane(contentPane);
        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.repaint();
        mainFrame.revalidate();
    }
    public void reset(JPanel contentPane){
        mainFrame.remove(mainFrame.getContentPane());
        mainFrame.setContentPane(contentPane);
        mainFrame.repaint();
        mainFrame.revalidate();
    }
}

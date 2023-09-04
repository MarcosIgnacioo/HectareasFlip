package hectareas.MainFrame;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    JFrame mainFrame = new JFrame();

    public MainFrame(JPanel contentPane, int width, int height){
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setContentPane(contentPane);
        mainFrame.setSize(width,height);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.repaint();
        mainFrame.revalidate();

    }

    public MainFrame(JPanel contentPane){
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setContentPane(contentPane);
        mainFrame.setSize(1000,900);
        //mainFrame.pack(); ajusta la pantalla a los elementos que la contenga
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.repaint();
        mainFrame.revalidate();
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public MainFrame(){
        mainFrame.setSize(300,300);
        mainFrame.setLayout(new BorderLayout());
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

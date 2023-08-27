package hectareas;

import hectareas.SelectTableMenu.TablesNav;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {
    public Home(){

        // Window config
        this.setLocationRelativeTo(null);
        this.setPreferredSize(new Dimension(900,900));
        this.setSize(900,900);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.black);
        TablesNav tn = new TablesNav();
        add(tn);




        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.repaint();
        this.revalidate();
    }

}

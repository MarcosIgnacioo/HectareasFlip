package hectareas;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {
    public Home(){

        // Window config

        this.setLocationRelativeTo(null);
        this.setPreferredSize(new Dimension(900,900));
        this.setSize(900,900);
        this.setLayout(new BorderLayout());

        NavigationMenuContainer nv = new NavigationMenuContainer();
        this.add(nv);



        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.repaint();
        this.revalidate();
        this.setVisible(true);
    }
}

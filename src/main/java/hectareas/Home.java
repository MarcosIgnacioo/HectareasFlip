package hectareas;

import hectareas.SelectTableMenu.TablesNav;

import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
    public Home(Color c) {
        // Window config
        this.setLayout(new BorderLayout());
        this.setBackground(c);
        TablesNav tn = new TablesNav();
        this.add(tn);
        this.setSize(900, 900);
        this.setVisible(true);

    }
}

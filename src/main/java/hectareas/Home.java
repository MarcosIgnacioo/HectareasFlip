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
        JScrollPane scrollPane = new JScrollPane(tn);  // El scrollpane es como un contenedor con las scrollbars,
                                                      // si se mete algo ahi, solamente se debe de agregar el scrollpane al frame
        this.add(scrollPane, BorderLayout.CENTER); // Agregando el JScrollPane al contenedor
        JLabel test = new JLabel("asdasd");
        test.setPreferredSize(new Dimension(300,300));
        this.add(test, BorderLayout.EAST);
        this.setSize(900, 900);
        this.setVisible(true);

    }
}

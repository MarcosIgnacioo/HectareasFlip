package hectareas;

import hectareas.SelectTableMenu.TablesNav;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {
    public Home() {
        // Window config
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.orange);

        TablesNav tn = new TablesNav();
        JScrollPane scrollPane = new JScrollPane(tn);  // El scrollpane es como un contenedor con las scrollbars,
                                                      // si se mete algo ahi, solamente se debe de agregar el scrollpane al frame
        this.add(scrollPane, BorderLayout.CENTER); // Agregando el JScrollPane al contenedor
        JLabel test = new JLabel("asdasd");
        test.setPreferredSize(new Dimension(300,300));
        this.add(test, BorderLayout.EAST);
        this.setSize(900, 900);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Home::new);
    }
}

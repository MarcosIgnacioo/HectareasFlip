package hectareas;

import hectareas.SelectTableMenu.TablesNav;

import javax.swing.*;
import java.awt.*;

public class owo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Panel con Barra Deslizadora");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 400); // Tamaño de la ventana

            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());

            // Crea un panel interno para los elementos
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS));

            TablesNav tn = new TablesNav();

            contentPanel.add(tn);
            // Agrega el panel interno al JScrollPane (con barra deslizadora)
            JScrollPane scrollPane = new JScrollPane(contentPanel);
            mainPanel.add(scrollPane, BorderLayout.CENTER);

            frame.getContentPane().add(mainPanel);
            frame.setVisible(true);
        });
    }

}

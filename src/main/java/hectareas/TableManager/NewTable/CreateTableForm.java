package hectareas.TableManager.NewTable;

import javax.swing.*;
import java.awt.*;

public class CreateTableForm extends JPanel {
    JButton btn = new JButton("nya");
    public CreateTableForm() {
        setLayout(new GridBagLayout());
        setSize(300,900);
        setVisible(true);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(btn, gbc);
        repaint();
        revalidate();
    }
}

package hectareas;

import hectareas.TableManager.ManageTable.TablesNavPanel;

import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
    public Home(Color c) {
        // Window config
        this.setLayout(new BorderLayout());
        this.setBackground(c);
        TablesNavPanel tn = new TablesNavPanel();
        JScrollPane jScrollPane = new JScrollPane(tn);
        jScrollPane.setSize(300,300);
        this.add(jScrollPane);
        this.setSize(900, 900);
        this.setVisible(true);

    }
}

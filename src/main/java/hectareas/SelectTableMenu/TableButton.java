package hectareas.SelectTableMenu;

import javax.swing.*;
import java.awt.*;

public class TableButton extends JPanel {

    public TableButton(String tableName) {

        setLayout(new GridLayout(2,1));
        JLabel tableLbl = new JLabel(tableName);
            tableLbl.setPreferredSize(new Dimension(50,50));
            add(tableLbl);

        JButton tableBtn = new JButton();
            tableBtn.setPreferredSize(new Dimension(50,50));
            add(tableBtn);

        setMinimumSize(new Dimension(100,100));
        setMaximumSize(new Dimension(150,150));
        setPreferredSize(new Dimension(125,125));
        repaint();
        revalidate();
        setVisible(true);
        asd();
    }
    public static void asd(){
        System.out.println("asd");
    }
}

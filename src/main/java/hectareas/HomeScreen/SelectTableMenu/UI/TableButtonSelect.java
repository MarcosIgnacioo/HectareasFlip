package hectareas.HomeScreen.SelectTableMenu.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableButtonSelect extends JPanel {

    public TableButtonSelect(String tableName) {

        setLayout(new GridLayout(2,1));
        JLabel tableLbl = new JLabel(tableName);
            tableLbl.setPreferredSize(new Dimension(50,50));
            add(tableLbl);

        JButton tableBtn = new JButton();
            tableBtn.setPreferredSize(new Dimension(50,50));
            add(tableBtn);
            tableBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(tableName);
                }
            });
        setMinimumSize(new Dimension(100,100));
        setMaximumSize(new Dimension(150,150));
        setPreferredSize(new Dimension(125,125));
        repaint();
        revalidate();
        setVisible(true);
    }
}

package hectareas.TableManager.ManageTable;

import hectareas.UIResources.JHintTextField;

import javax.swing.*;
import java.awt.*;

public class TablesManagerMenu extends JPanel {
    TablesNavPanel tn;
    public TablesManagerMenu() {
        tn = new TablesNavPanel();
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.BOTH;

        JHintTextField searchTableHTF = new JHintTextField("hola");
            searchTableHTF.setMinimumSize(new Dimension(200,30));
            searchTableHTF.setVisible(true);
            add(searchTableHTF,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JScrollPane jScrollPane = new JScrollPane(tn);
            jScrollPane.setMinimumSize(new Dimension(150,150));
            add(jScrollPane, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        JButton searchBtn = new JButton("Buscar");
            searchBtn.setPreferredSize(new Dimension(100,200));
            searchBtn.setVisible(true);
            add(searchBtn, gbc);


        gbc.gridx = 1;
        gbc.gridy = 1;
        JButton createNewTableBtn = new JButton("Crear neuva tabla");
            createNewTableBtn.setPreferredSize(new Dimension(100,200));
            createNewTableBtn.setVisible(true);
            add(createNewTableBtn,gbc);
        repaint();
        revalidate();
    }
}

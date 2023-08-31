package hectareas;

import hectareas.SelectTableMenu.Tables.TablesComponents.CustomDTM;
import hectareas.SelectTableMenu.Tables.TablesComponents.CustomTable;

import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
    public Home(Color c) {
        // Window config
        this.setLayout(new BorderLayout());
        this.setBackground(c);
        String [] names = {"owo_owo", "hola_mundo"};
        Object [][] data = {{1,2,3},{1,2,3}};
        CustomDTM customDTM = new CustomDTM(names,data);
        CustomTable customTable = new CustomTable(customDTM);
        JScrollPane jScrollPane = new JScrollPane(customTable);
        jScrollPane.setSize(300,300);
        this.add(jScrollPane);
        this.setSize(900, 900);
        this.setVisible(true);

    }
}

package hectareas.SelectTableMenu.Tables;

import hectareas.SelectTableMenu.Tables.TablesComponents.CustomDTM;
import hectareas.SelectTableMenu.Tables.TablesComponents.CustomTable;

import javax.swing.*;

public class TablePanel extends JPanel {
    CustomTable customTable;

    public TablePanel(CustomDTM customDTM) {
        customTable = new CustomTable(customDTM, "#000000", "#FFFFFF");
        JScrollPane jScrollPane = new JScrollPane(customTable);
        jScrollPane.setSize(300,300);
        add(jScrollPane);
    }
}

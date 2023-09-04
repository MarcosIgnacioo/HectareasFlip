package hectareas.TableManager.ManageTable;

import hectareas.HomeScreen.SelectTableMenu.TablesElements.CustomDTM;
import hectareas.HomeScreen.SelectTableMenu.TablesElements.CustomTable;

import javax.swing.*;

public class SelectedTablePanel extends JPanel {
    CustomTable customTable;

    public SelectedTablePanel(CustomDTM customDTM) {
        customTable = new CustomTable(customDTM, "#000000", "#FFFFFF");
        JScrollPane jScrollPane = new JScrollPane(customTable);
        jScrollPane.setSize(300,300);
        add(jScrollPane);
    }
}

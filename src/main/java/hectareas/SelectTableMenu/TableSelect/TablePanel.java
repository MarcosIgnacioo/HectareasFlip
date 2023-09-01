package hectareas.SelectTableMenu.TableSelect;

import hectareas.SelectTableMenu.TableSelect.TablesComponents.CustomDTM;
import hectareas.SelectTableMenu.TableSelect.TablesComponents.CustomTable;

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

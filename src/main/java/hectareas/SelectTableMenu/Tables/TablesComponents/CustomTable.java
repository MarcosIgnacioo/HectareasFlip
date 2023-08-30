package hectareas.SelectTableMenu.Tables.TablesComponents;

import javax.swing.*;

public class CustomTable extends JTable {
    public CustomTable(CustomDTM customDTM) {
        setModel(customDTM);
        
    }
}

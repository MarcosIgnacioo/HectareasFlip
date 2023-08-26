package hectareas.Table.TableComponents;

import javax.swing.*;
import java.util.Random;

public class TableContainer {
    JLabel[] tableNameLbl;
    JButton[] tablesBtn;
    Random rnd = new Random();
    int gridArea = 0;

    // Auto formating alt cmd l
    public TableContainer() {
        int size = rnd.nextInt(10);
        tablesBtn = new JButton[size];
        tableNameLbl = new JLabel[size];
        int i = 0;

        gridArea = (size % 2 == 0) ? size : size + 1;
    }
}

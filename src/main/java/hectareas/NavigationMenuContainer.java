package hectareas;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.function.Predicate;

public class NavigationMenuContainer extends JPanel {
    // owo
    JLabel[][] tableNameLbl;
    JButton[][] tablesBtn;
    Random rnd = new Random();
    int gridArea;

    public NavigationMenuContainer() {
        gridArea =  13;
        int [] result = getRowsAndCols(gridArea);
        int cols = result[0];
        int rows = result[1];
        tablesBtn = new JButton[rows][cols];
        tableNameLbl = new JLabel[rows][cols];
        System.out.println("width: " + rows + " height: " + cols + " gridarea: " + gridArea);
        setLayout(new GridBagLayout());
        placeAllButtons(rows, cols);
        setSize(500, 500);
        setVisible(true);
        setBackground(Color.RED);
    }

    public void placeAllButtons(int rows, int cols) {
        GridBagConstraints gbc = new GridBagConstraints();
        // meter los jbuttons y labels a una matriz
        for (int i = 0; i < rows; i += 2) {
            for (int j = 0; j < cols; j++) {

                gbc.gridy = i;
                gbc.gridx = j;
                tableNameLbl[i][j] = new JLabel("hola");
                tableNameLbl[i][j].setSize(50, 100);
                tableNameLbl[i][j].setVisible(true);
                add(tableNameLbl[i][j], gbc);

                gbc.gridy = i + 1;
                gbc.gridx = j;
                tablesBtn[i][j] = new JButton("boton");
                tablesBtn[i][j].setPreferredSize(new Dimension(50, 100));
                tablesBtn[i][j].setVisible(true);
                add(tablesBtn[i][j], gbc);
                if (tablesBtn[i][j] == null) {
                    System.out.println("null");
                }
                if (tableNameLbl[i][j] == null) {
                    System.out.println("null");
                }
            }
        }


        this.setBackground(Color.ORANGE);
    }

    public int[] getRowsAndCols(int area) {
        int row = area;
        int col = 1;
        int pruebapull = 0;
        for (int i = 1; i <= area; i++) {
            if (area % i == 0
                    && area / i < row
                    && i > col
                    && col < row) {
                row = area / i;
                col = i;
            }
        }
        return new int[]{row, col};
    }
}
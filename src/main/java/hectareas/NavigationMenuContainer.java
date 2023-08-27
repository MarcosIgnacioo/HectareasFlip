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
        tableNameLbl = new JLabel[rows+1][cols];
        setLayout(new GridLayout(rows*2, 5, 5, 5));
        placeAllButtons(rows*2, cols);
        setSize(500, 500);
        setVisible(true);
        setBackground(Color.RED);
    }
    public void putAllButtons(int rows, int cols){

    }
    public void placeAllButtons(int rows, int cols) {
        GridBagConstraints gbc = new GridBagConstraints();
        // meter los jbuttons y labels a una matriz
        for (int i = 0; i < rows; i++) {
            int iLbl = 0;
            int iBtn = 0;
            for (int j = 0; j < cols; j++) {
                if (i % 2 == 0){
                    tableNameLbl[iLbl][j] = new JLabel("hola");
                    tableNameLbl[iLbl][j].setSize(50, 100);
                    tableNameLbl[iLbl][j].setVisible(true);
                    add(tableNameLbl[iLbl][j]);
                    iLbl++;
                }
                if (i % 2 != 0){
                    tablesBtn[iBtn][j] = new JButton("boton");
                    tablesBtn[iBtn][j].setPreferredSize(new Dimension(50, 100));
                    tablesBtn[iBtn][j].setVisible(true);
                    add(tablesBtn[iBtn][j]);
                    iBtn++;
                }
            }
        }

    }

    public int[] getRowsAndCols(int area) {
        int row = area;
        int col = 1;
        if (area % 2 == 0){
            for (int i = 1; i <= area; i++) {
                if (area % i == 0
                        && area / i < row
                        && i > col
                        && col < row) {
                    System.out.println("hola");
                    row = area / i;
                    col = i;
                }
            }
        }
        else{
            for (int i = 1; i <= area; i++) {
                if (area % i == 0
                        && area / i < row
                        && i > col
                        && col < row) {
                    System.out.println("hola");
                    row = area / i;
                    col = i;
                }
            }
        }
        System.out.println(row + " a:;" + area + " c" +col );
        return new int[]{row, col};
    }
}
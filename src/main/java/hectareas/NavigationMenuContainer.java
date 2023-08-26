package hectareas;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class NavigationMenuContainer extends JPanel {
    // owo
    JLabel[][] tableNameLbl;
    JButton[][] tablesBtn;
    Random rnd = new Random();
    int gridArea;
    public NavigationMenuContainer() {
        int size = rnd.nextInt(20);
        gridArea = (size % 2 == 0) ? size : size + 1;
        tablesBtn = new JButton[gridArea/2][gridArea/2];
        tableNameLbl = new JLabel[gridArea/2][gridArea/2];

        setLayout(new GridBagLayout());
        placeAllButtons(gridArea);
        setSize(500,500);
        setVisible(true);
        setBackground(Color.RED);
    }

    public void placeAllButtons(int gridArea){
        GridBagConstraints gbc = new GridBagConstraints();
        int numOfRowsAndCols = gridArea/2;
        // meter los jbuttons y labels a una matriz
        for (int i = 0; i < numOfRowsAndCols; i+=2) {
            for (int j = 0; j < numOfRowsAndCols; j++) {

                gbc.gridy = i;
                gbc.gridx = j;
                tableNameLbl[i][j] = new JLabel("hola");
                tableNameLbl[i][j].setSize(50,100);
                tableNameLbl[i][j].setVisible(true);
                add(tableNameLbl[i][j], gbc);

                gbc.gridy = i+1;
                gbc.gridx = j;

                tablesBtn[i][j] = new JButton("boton");
                tablesBtn[i][j].setPreferredSize(new Dimension(50,100));
                tablesBtn[i][j].setVisible(true);
                add(tablesBtn[i][j], gbc);
            }
        }


        this.setBackground(Color.ORANGE);
    }
}
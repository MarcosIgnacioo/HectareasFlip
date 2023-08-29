package hectareas.SelectTableMenu;

import hectareas.SelectTableMenu.TableButton;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TablesNav extends JPanel {

    List<TableButton> tblBtnList = new ArrayList<>();

    public TablesNav() {
        setLayout(new GridLayout(1000, 2, 5, 5));
        setSize(300, 300);


        createTableButtons(90);
        placeTableButtons();
        setBackground(Color.blue);
        repaint();
        revalidate();
        setVisible(true);
        getRowsAndCols(17);
    }
    public void placeTableButtons(){
        add(tblBtnList.get(0));
        tblBtnList.remove(0);
        if (tblBtnList.size() >= 1) placeTableButtons();
    }
    public void createTableButtons(int elementsNum){
        for (int i = 0; i < elementsNum; i++) {
            tblBtnList.add(i, new TableButton("hola: " + i+1));
        }
    }
    public void getRowsAndCols(int area){
        int rows = area;
        int cols = 1;
        for (int i = 1; i <= area; i++) {
            if (area % i == 0
                    && area / i < rows
                    && i > cols
                    && cols < rows) {
                rows = i;
                cols = area / i;
            }
        }
        if (rows == area && cols == 1){
            int smallestResidue = 0;
            for (int i = 0; i < area; i++) {
                if (area % i > smallestResidue){
                    smallestResidue = area % i;
                }
            }
        }
        System.out.println(area%5);
        System.out.println(rows );
        System.out.println(cols );
    }
}

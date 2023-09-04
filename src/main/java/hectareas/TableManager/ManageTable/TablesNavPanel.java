package hectareas.TableManager.ManageTable;

import hectareas.HomeScreen.SelectTableMenu.UI.TableButtonSelect;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TablesNavPanel extends JPanel {

    List<TableButtonSelect> tblBtnList = new ArrayList<>();
// TODO : Ponerle un limite a las columnas porque ya llevo mucho rato en esto y me da hueva jijiji
// TODO : pero no debería ser dificil no copium (KEKW PLACEHOLDER)
    public TablesNavPanel() {
        int area = 70;
        System.out.println(area);
        int[] rowsNCols = getRowsAndCols(area);
        setLayout(new GridLayout(25, 3, 5, 5));
        setSize(900, 300);
        createTableButtons(area);
        placeTableButtons();
        setBackground(Color.orange);
        repaint();
        revalidate();
        setVisible(true);
    }

    public void placeTableButtons() {
        add(tblBtnList.get(0));
        tblBtnList.remove(0);
        repaint();
        revalidate();
        setVisible(true);
        if (tblBtnList.size() >= 1) placeTableButtons();
    }

    public void createTableButtons(int elementsNum) {
        for (int i = 0; i < elementsNum; i++) {
            tblBtnList.add(i, new TableButtonSelect("hola: " + i + 1));
        }
    }

    public int[] getRowsAndCols(int area) {
        int rows = area;
        int cols = 1;
        area = (area % 2 != 0) ? area + 1 : area;
        for (int i = 1; i <= area; i++) {
            if (area % i == 0 && area / i < rows && i > cols && cols < rows) {
                rows = area / i;
                cols = i;
            }
        }
        return new int[]{rows, cols};
    }
}

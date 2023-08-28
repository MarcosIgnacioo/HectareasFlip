package hectareas.SelectTableMenu;

import hectareas.SelectTableMenu.TableButton;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TablesNav extends JPanel {
    List<JButton> btnList = new ArrayList<>();
    List<JLabel> lblList = new ArrayList<>();

    List<TableButton> tblBtnList = new ArrayList<>();

    public TablesNav() {
        setLayout(new GridLayout(10, 2, 5, 5));
        setSize(300, 300);


        createTableButtons(90);
        placeTableButtons(2);
        //createAllElements(13);
        //placeLabels(2, 0);
        setBackground(Color.blue);
        repaint();
        revalidate();
        setVisible(true);
    }
    public void placeTableButtons(int cols){
        add(tblBtnList.get(0));
        tblBtnList.remove(0);
        if (tblBtnList.size() >= 1) placeTableButtons(cols);
    }
    public void createTableButtons(int elementsNum){
        for (int i = 0; i < elementsNum; i++) {
            tblBtnList.add(i, new TableButton("hola: " + i));
        }
    }
    public void placeButtons(int cols, int buffer){

        add(btnList.get(0));
        btnList.remove(0);
        buffer++;
        if (buffer != cols && btnList.size() >= 1) placeButtons(cols,buffer);
        else  if (lblList.size() >= 1) placeLabels(cols, 0);
    }
    public void placeLabels(int cols, int buffer){
        add(lblList.get(0));
        lblList.remove(0);
        buffer++;
        if (buffer != cols && lblList.size() >= 1) placeLabels(cols, buffer);
        else if (btnList.size() >= 1) placeButtons(cols, 0);
    }
    public void createAllElements(int elementsNum){
        for (int i = 0; i < elementsNum; i++) {
            btnList.add(i, new JButton("button: " + i));
            lblList.add(i, new JLabel("label: " + i));
        }
        for (JButton button:
             btnList) {
            button.setPreferredSize(new Dimension(50,50));
            button.setVisible(true);
        }
        for (JLabel label:
                lblList) {
            label.setPreferredSize(new Dimension(50,50));
            label.setVisible(true);
        }
    }
}

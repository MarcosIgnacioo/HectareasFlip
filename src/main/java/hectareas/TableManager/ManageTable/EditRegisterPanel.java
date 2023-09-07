package hectareas.TableManager.ManageTable;

import hectareas.HomeScreen.SelectTableMenu.TablesElements.CustomDTM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EditRegisterPanel extends JPanel{
    List<JLabel> columnNamesLabels = new ArrayList<>();
    List<JTextField> dataEditTextFields = new ArrayList<>();
    CustomDTM customDTM;
    Object [] rowData;
    int selectedRow;
    public EditRegisterPanel(CustomDTM customDTM, Object [] rowData, int selectedRow) {
        setLayout(new GridLayout(0,2));
        this.rowData = rowData;
        this.customDTM = customDTM;
        this.selectedRow = selectedRow;
        placeLabelsAndTextFields();
        repaint();
        revalidate();
    }
    public void placeLabelsAndTextFields(){
        for (int i = 0; i < customDTM.getColumnCount()-1; i++) {

            columnNamesLabels.add(new JLabel(customDTM.getOgColumnNames()[i]));
            columnNamesLabels.get(i).setMaximumSize(new Dimension(100,50));
            columnNamesLabels.get(i).setOpaque(true);
            columnNamesLabels.get(i).setBackground(Color.CYAN);
            dataEditTextFields.add(new JTextField(rowData[i].toString()));
            dataEditTextFields.get(i).setMaximumSize(new Dimension(100,50));
            dataEditTextFields.get(i).setOpaque(true);

            add(columnNamesLabels.get(i));
            add(dataEditTextFields.get(i));
        }
        JButton changeBtn = new JButton("change");
        add(changeBtn);
        changeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < customDTM.getColumnCount(); i++) {
                    customDTM.setValueAt(dataEditTextFields.get(i).getText(),selectedRow,i);
                }
            }
        });
    }
}

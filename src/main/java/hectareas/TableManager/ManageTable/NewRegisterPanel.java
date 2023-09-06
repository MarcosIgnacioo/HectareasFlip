package hectareas.TableManager.ManageTable;

import hectareas.HomeScreen.SelectTableMenu.TablesElements.CustomDTM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
//AGrega el boton pero fake vamos a falsearlo d manera gaymer
public class NewRegisterPanel extends JPanel {
    List<JLabel> columnNamesLabels = new ArrayList<>();
    List<JTextField> dataEditTextFields = new ArrayList<>();
    CustomDTM customDTM;

    public NewRegisterPanel(CustomDTM customDTM) {
        this.customDTM = customDTM;
        setLayout(new GridLayout(0,2));
        setBackground(Color.blue);
        placeLabelsAndTextFields();
        repaint();
        revalidate();
    }

    private void placeLabelsAndTextFields() {
        for (int i = 0; i < customDTM.getColumnCount(); i++) {
            System.out.println();
            columnNamesLabels.add(new JLabel(customDTM.getOgColumnNames()[i]));
            columnNamesLabels.get(i).setMaximumSize(new Dimension(100,50));
            columnNamesLabels.get(i).setOpaque(true);
            columnNamesLabels.get(i).setBackground(Color.CYAN);
            dataEditTextFields.add(new JTextField());
            dataEditTextFields.get(i).setMaximumSize(new Dimension(100,50));
            dataEditTextFields.get(i).setOpaque(true);

            add(columnNamesLabels.get(i));
            add(dataEditTextFields.get(i));
        }
        JButton enterBtn = new JButton("submit");
        add(enterBtn);
        enterBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object [] newData = new Object[customDTM.getColumnCount()];
                for (int i = 0; i < customDTM.getColumnCount(); i++) {
                    newData[i] = dataEditTextFields.get(i).getText();
                }
                customDTM.addRow(newData);
            }
        });
    }
}


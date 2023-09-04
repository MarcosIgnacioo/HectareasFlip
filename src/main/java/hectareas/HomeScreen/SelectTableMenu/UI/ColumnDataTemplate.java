package hectareas.HomeScreen.SelectTableMenu.UI;

import hectareas.UIResources.JHintTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ColumnDataTemplate extends JPanel {
    JLabel columnNameLbl;
    JHintTextField columnNameHTF;
    JComboBox dataTypeCB;
    JButton deleteColumnBtn;
    String [] dataTypesArray = {"INT", "VARCHAR(256)", "DECIMAL(10,2)", "ENUM", "DATE", "DATETIME"};

    public ColumnDataTemplate(int it) {
        this.setSize(200,100);
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.BOTH;
        columnNameLbl = new JLabel("Escriba el nombre de la columna " + it);
            columnNameLbl.setMaximumSize(new Dimension(200,50));
            columnNameLbl.setVisible(true);
            this.add(columnNameLbl,gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        columnNameHTF = new JHintTextField("nombre columna");
            columnNameHTF.setMaximumSize(new Dimension(200,50));
            columnNameHTF.setVisible(true);
            this.add(columnNameHTF,gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        dataTypeCB = new JComboBox(dataTypesArray);
            dataTypeCB.setMaximumSize(new Dimension(200,50));
            dataTypeCB.setVisible(true);
            this.add(dataTypeCB,gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        deleteColumnBtn = new JButton("Borrar columna");
            deleteColumnBtn.setMaximumSize(new Dimension(200,50));
            deleteColumnBtn.setVisible(true);
            JPanel tmp = this;
            deleteColumnBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getParent().remove(tmp);
                    repaint();
                    revalidate();
                }
            });
            this.add(deleteColumnBtn,gbc);

        this.repaint();
        this.revalidate();
    }
    @Override
    public String toString() {
        return "ColumnDataTemplate{" +
                "columnName=" + columnNameLbl.getText() +
                ", columnName=" + columnNameHTF.getText() +
                ", dataType=" + dataTypeCB.getSelectedItem() +
                '}';
    }
}

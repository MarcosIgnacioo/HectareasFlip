package hectareas.TableManager.NewTable;

import hectareas.HomeScreen.SelectTableMenu.UI.ColumnDataTemplate;
import hectareas.UIResources.JHintTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CreateNewTable extends JPanel {
    int it = 1;
    ArrayList<ColumnDataTemplate> columnDataTemplateArrayList = new ArrayList<>();
    ColumnDataContainer columnDataContainerPanel = new ColumnDataContainer();
    public CreateNewTable() {
        setSize(900,900);
        setLayout(new GridLayout(1,2));
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;

        JScrollPane jScrollPane = new JScrollPane(columnDataContainerPanel);
            add(jScrollPane);

        JPanel createTableFormPanel = new JPanel();
            createTableFormPanel.setSize(300,300);
            createTableFormPanel.setLayout(new BoxLayout(createTableFormPanel, BoxLayout.Y_AXIS));
            createTableFormPanel.setBackground(Color.yellow);
            createTableFormPanel.setVisible(true);

                JHintTextField tableNameHTF = new JHintTextField("nombre tabla");
                tableNameHTF.setMinimumSize(new Dimension(500,30));
                tableNameHTF.setMaximumSize(new Dimension(300,30));
                createTableFormPanel.add(tableNameHTF);

                JTextField columnsNumbers = new JTextField("1");
                columnsNumbers.setMaximumSize(new Dimension(300,30));
                createTableFormPanel.add(columnsNumbers);

                JButton newColumnBtn = new JButton("Agregar columna");
                newColumnBtn.setSize(150,50);
                newColumnBtn.setVisible(true);
                newColumnBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        for (int i = 0; i < Integer.parseInt(columnsNumbers.getText()); i++) {
                            newColumnDataPanel();
                        }
                    }
                });
                createTableFormPanel.add(newColumnBtn);

                JButton createTableBtn = new JButton("Crear tabla");
                createTableBtn.setSize(150,50);
                createTableBtn.setVisible(true);
                createTableFormPanel.add(createTableBtn);

                createTableBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        getAllTablesInfo().forEach(System.out::println);
                    }
                });

        add(createTableFormPanel, BorderLayout.EAST);

    }
    public void newColumnDataPanel(){
        ColumnDataTemplate cdp = new ColumnDataTemplate(it++);
        columnDataTemplateArrayList.add(cdp);
        columnDataContainerPanel.add(cdp);
        repaint();
        revalidate();
    }
    public ArrayList<String> getAllTablesInfo(){
        ArrayList<String> tableInfoJson = new ArrayList();
        for (ColumnDataTemplate tableInfo: columnDataTemplateArrayList) {
            tableInfoJson.add(tableInfo.toString());
        }
        return tableInfoJson;
    }
}

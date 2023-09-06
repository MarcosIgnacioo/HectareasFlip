package hectareas.TableManager.ManageTable;

import hectareas.Frames.TabFrame;
import hectareas.HomeScreen.SelectTableMenu.TablesElements.CustomDTM;
import hectareas.HomeScreen.SelectTableMenu.TablesElements.CustomTable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectedTablePanel extends JPanel {
    CustomTable customTable;

    public SelectedTablePanel(CustomDTM customDTM) {
        customTable = new CustomTable(customDTM, "#000000", "#FFFFFF");
        JScrollPane jScrollPane = new JScrollPane(customTable);
        jScrollPane.setSize(300,300);
        add(jScrollPane);
        JButton newRegisterBtn = new JButton("Nuevo registro");
        add(newRegisterBtn);
        JButton saveBtn = new JButton("Guardar cambios");
        add(saveBtn);
        saveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("saved");
            }
        });
        newRegisterBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewRegisterPanel rp = new NewRegisterPanel(customDTM);
                TabFrame tb = new TabFrame(rp);
            }
        });
    }
}

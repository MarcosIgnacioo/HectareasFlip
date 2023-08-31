package hectareas.SelectTableMenu.Tables.TablesComponents;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.*;
public class CustomTable extends JTable {
    static String evenColor;
    static String oddColor;
    public CustomTable(CustomDTM customDTM, String evenColor, String oddColor) {
        setModel(customDTM);
        CustomTable.evenColor = evenColor;
        CustomTable.oddColor = oddColor;
        createStylizedTable(this);
    }

    public CustomTable(CustomDTM customDTM) {
        setModel(customDTM);
        createStylizedTable(this);
    }

    public static void createStylizedTable(JTable customizedTable){
        JTableHeader header = customizedTable.getTableHeader();
        header.setBackground(Color.decode("#38B6FF"));
        header.setPreferredSize(new Dimension(700,40));
        header.setFont(new Font("Arial", Font.PLAIN, 15));

        //Poner los colores de la tabla menos roñosos
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        UIManager.put("TableHeader.cellBorder", BorderFactory.createMatteBorder(0, 1, 0, 1, Color.WHITE));
        headerRenderer.setOpaque(false);

        for (int i = 0; i < customizedTable.getColumnCount(); i++) {
            customizedTable.getColumnModel().getColumn(i).setPreferredWidth(75);
            customizedTable.getColumnModel().getColumn(i).setCellRenderer(customCellRenderer);
        }
        //Cambiar el ancho y color de los nombres de las columnas

    }
    private  static DefaultTableCellRenderer customCellRenderer = new DefaultTableCellRenderer() {
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            table.setRowHeight(row,25);
            if (row % 2 == 0) {
                component.setBackground(Color.decode("#123732"));
            } else {
                component.setBackground(Color.decode("#129332"));
            }

            return component;
        }
    };
}

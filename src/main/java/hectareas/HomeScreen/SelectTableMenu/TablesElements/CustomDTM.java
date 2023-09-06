package hectareas.HomeScreen.SelectTableMenu.TablesElements;

import javax.swing.table.DefaultTableModel;
import java.util.Arrays;

public class CustomDTM extends DefaultTableModel {
    String htmlFormat = "<html><div style='text-align: center;'>Name</div></html>";
    private final String [] ogColumnNames;
    private final Object [][] ogTableData;
    public CustomDTM(String [] columnNames, Object [][] tableData) {
        ogColumnNames = columnNames;
        ogTableData = tableData;
        columnNames = reformatingColumnNames(columnNames);
        for (int i = 0; i < columnNames.length; i++) {
            columnNames[i] = columnNames[i].replace(" ", "<br>");
            columnNames[i] = htmlFormat.replace("Name", columnNames[i]);
        }
        setDataVector(tableData,columnNames);
    }
    public static String [] reformatingColumnNames(String [] columnNames){
        String [] formatedColumnNames = new String[columnNames.length];
        for (int i = 0; i < columnNames.length; i++) {
            String[] words = columnNames[i].split("[\\s_]+");
            StringBuilder reformatedWord = new StringBuilder();

            for (String word : words) {
                if (!word.isEmpty()) {
                    char firstChar = Character.toUpperCase(word.charAt(0));
                    String restOfWord = word.substring(1);
                    reformatedWord.append(firstChar).append(restOfWord).append(" ");
                }
            }
            formatedColumnNames[i] = String.valueOf(reformatedWord);
        }
        Arrays.stream(formatedColumnNames).forEach(System.out::println);
        return formatedColumnNames;
    }

    public String[] getOgColumnNames() {
        return ogColumnNames;
    }

    public Object[][] getOgTableData() {
        return ogTableData;
    }
}

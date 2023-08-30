package hectareas.SelectTableMenu.Tables.TablesComponents;

import javax.swing.table.DefaultTableModel;
import java.util.Arrays;

public class CustomDTM extends DefaultTableModel {
    String htmlFormat = "<html><div style='text-align: center;'>Name</div></html>";
    public CustomDTM(String [] columnNames, Object [][] tableData) {
        columnNames = reformatingColumnNames(columnNames);
        for (int i = 0; i < columnNames.length; i++) {
            columnNames[i] = columnNames[i].replace(" ", "<br>");
            columnNames[i] = htmlFormat.replace("Name", columnNames[i]);
        }
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
}

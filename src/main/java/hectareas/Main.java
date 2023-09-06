package hectareas;

import hectareas.HomeScreen.SelectTableMenu.TablesElements.CustomDTM;
import hectareas.Frames.MainFrame;
import hectareas.TableManager.ManageTable.SelectedTablePanel;
import hectareas.TableManager.NewTable.ColumnDataContainer;
import hectareas.TableManager.NewTable.CreateNewTable;
import hectareas.TableManager.ManageTable.TablesManagerMenu;

import javax.swing.*;

public class Main extends JFrame{

    public static void main(String[] args){
        TablesManagerMenu tm = new TablesManagerMenu();
        CreateNewTable cn = new CreateNewTable();
        ColumnDataContainer cd = new ColumnDataContainer();
        CustomDTM dtm = new CustomDTM(
                new String[]{"productor", "siembra", "hectareas"},
                new Object[][]{
                        {"alex", "tomate", "3"},
                        {"panchi","calabaza", "5"}});
        SelectedTablePanel sl = new SelectedTablePanel(dtm);
        MainFrame mf = new MainFrame(sl);
    }
}
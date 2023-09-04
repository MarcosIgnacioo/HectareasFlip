package hectareas;

import hectareas.MainFrame.MainFrame;
import hectareas.TableManager.NewTable.ColumnDataContainer;
import hectareas.TableManager.NewTable.CreateNewTable;
import hectareas.TableManager.ManageTable.TablesManagerMenu;

import javax.swing.*;

public class Main extends JFrame{

    public static void main(String[] args){
        TablesManagerMenu tm = new TablesManagerMenu();
        CreateNewTable cn = new CreateNewTable();
        ColumnDataContainer cd = new ColumnDataContainer();
        MainFrame mf = new MainFrame(cn);
    }
}
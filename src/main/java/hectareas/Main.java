package hectareas;

import hectareas.MainFrame.MainFrame;
import hectareas.SelectTableMenu.TablesNav;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    public static void main(String[] args){

        Home h = new Home(Color.red);
        MainFrame mf = new MainFrame(h, 900,900);
    }
}
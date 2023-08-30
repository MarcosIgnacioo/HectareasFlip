package hectareas;

import hectareas.MainFrame.MainFrame;
import hectareas.SelectTableMenu.Tables.TablesComponents.CustomDTM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    public static void main(String[] args) throws InterruptedException {
        String [] names = {"owo_owo", "hola_mundo"};
        Object [][] data = {{1,2,3},{1,2,3}};
        CustomDTM customDTM = new CustomDTM(names,data);
       MainFrame mf = new MainFrame(new Home(Color.red));
    }
}
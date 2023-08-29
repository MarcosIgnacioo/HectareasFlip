package hectareas;

import hectareas.MainFrame.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    public static void main(String[] args) throws InterruptedException {

       MainFrame mf = new MainFrame(new Home(Color.red));
    }
}
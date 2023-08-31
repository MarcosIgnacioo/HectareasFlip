package hectareas;

import hectareas.MainFrame.MainFrame;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    public static void main(String[] args){

        MainFrame mf = new MainFrame(new Home(Color.red));
    }
}
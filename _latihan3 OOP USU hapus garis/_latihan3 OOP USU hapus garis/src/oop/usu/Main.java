package oop.usu;

import javax.swing.JFrame;
import java.awt.*;

public class Main {

    public static <DrawPanel> void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add((Component) panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}

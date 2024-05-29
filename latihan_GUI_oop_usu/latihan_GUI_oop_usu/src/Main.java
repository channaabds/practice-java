/*
Chapter 14 Sample Program: Displays a frame with two buttons
File: Ch14JButtonFrame.java
*/

import javax.swing.*;
import java.awt.*;
class Ch14JButtonFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private JButton cancelButton;
    private JButton okButton;
    public static void main(String[] args) {
        Ch14JButtonFrame frame = new Ch14JButtonFrame();
        frame.setVisible(true);
    }
    public Ch14JButtonFrame() {
        Container contentPane = getContentPane( );
//set the frame properties
        setSize (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle ("Program Ch14JButtonFrame");
        setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
//set the layout manager
        contentPane.setLayout(new FlowLayout());
//create and place two buttons on the frame's content pane
        okButton = new JButton("OK");
        contentPane.add(okButton);
        cancelButton = new JButton("CANCEL");
        contentPane.add(cancelButton);
//register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
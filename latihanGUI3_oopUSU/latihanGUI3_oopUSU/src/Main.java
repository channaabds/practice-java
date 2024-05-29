/*
Chapter 14 Sample Program: Displays a frame with two buttons 
and handles the button events
File: Ch14JButtonFrameHandler.java
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Ch14JButtonFrameHandler extends JFrame implements ActionListener {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private JButton cancelButton;
    private JButton okButton;
    public static void main(String[] args) {
        Ch14JButtonFrameHandler frame = new Ch14JButtonFrameHandler();
        frame.setVisible(true);
    }
    public Ch14JButtonFrameHandler() {
        Container contentPane = getContentPane( );
//set the frame properties
        setSize (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle ("Program Ch14JButtonFrameHandler");
        setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
//set the layout manager
        contentPane.setLayout(new FlowLayout());
//create and place two buttons on the frame's content pane
        okButton = new JButton("OK");
        contentPane.add(okButton);
        cancelButton = new JButton("CANCEL");
        contentPane.add(cancelButton);
//register this frame as an action listener of the two buttons
        cancelButton.addActionListener(this);
        okButton.addActionListener(this);
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        String buttonText = clickedButton.getText();
        setTitle("You clicked " + buttonText);
    }
}
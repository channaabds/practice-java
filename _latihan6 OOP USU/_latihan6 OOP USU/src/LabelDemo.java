import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo {
    public static void main(String[] args) {
        // Create a label with plain text
        JLabel northLabel = new JLabel("North");

        // create an icon from an image so we can put it on a JLabel
        ImageIcon labelIcon = new ImageIcon("GUItip.gif");

        // create a label with an Icon instead of text
        JLabel centerLabel = new JLabel(labelIcon);

        // create another label with an Icon
        JLabel southLabel = new JLabel(labelIcon);

        // set the label to display text (as well as an icon)
        southLabel.setText("South");

        // Create an icon from an image (bee.png)
        ImageIcon beeIcon = new ImageIcon("bee.png");

        // Create a label with the bee icon
        JLabel beeLabel = new JLabel(beeIcon);

        // create a frame to hold the labels
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the labels to the frame; the second argument specifies
        // where on the frame to add the label
        application.add(northLabel, BorderLayout.NORTH);
        application.add(centerLabel, BorderLayout.CENTER);
        application.add(southLabel, BorderLayout.SOUTH);

        // Add the bee label to the frame
        application.add(beeLabel, BorderLayout.WEST);

        application.setSize(400, 300);
        application.setVisible(true);
    }
}

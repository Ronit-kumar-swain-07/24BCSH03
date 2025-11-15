/*
7. Create three color buttons (with caption “Red”, “Blue” and “Green”) and a text label. Initially the text should be
displayed in black color. When the user clicks on a particular color button the text should be changed to that
particular color as shown in the figure.
*/

// Assignment-7 (Using Button with ActionListener)
import java.awt.*;
import java.awt.event.*;

public class Assignment7 {
    public static void main(String[] args) {
        // Frame
        Frame frame = new Frame("My Buttons");
        
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        Label label = new Label("Welcome");
        label.setAlignment(Label.CENTER); // optional
        label.setFont(new Font("Roboto Condensed Light", Font.BOLD, 20)); // optional

        // Buttons
        Button b1 = new Button("Red");
        Button b2 = new Button("Green");
        Button b3 = new Button("Blue");

        // Position of the button
        b1.setBounds(50, 80, 80, 40);
        b2.setBounds(150, 80, 80, 40);
        b3.setBounds(260, 80, 80, 40);
        label.setBounds(140, 120, 100, 80);

        // Action listener to the button b1
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)

            {
                label.setForeground(Color.red);
            }
        });

        // Action listener to the button b2
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.green);
            }
        });

        // Action listener to the button b3
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.blue);

            }
        });

        // Window listener
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Adding Buttons
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(label);
    }
}
/*
1. Write a java program to creates three push buttons showing three different colors as their label. When a button is
clicked, that particular color is set as background color in the frame.
*/

// import java.util.*;
import java.awt.*;
import java.awt.event.*;
// import java.applet.*;

public class Assignment1 {
    public static void main(String[] args) {

        // Frame
        Frame frame = new Frame("Colour Changing Frame ");
            frame.setBackground(Color.LIGHT_GRAY);
            frame.setSize(400, 300);
            frame.setLayout(null);
            frame.setVisible(true);

        // Buttons
        Button b1 = new Button("Red");
        Button b2 = new Button("Green");
        Button b3 = new Button("Blue");

        // Position of the Buttons
        b1.setBounds(50, 80, 80, 40);
        b2.setBounds(150, 80, 80, 40);
        b3.setBounds(260, 80, 80, 40);

        // Action listener for b1
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBackground(Color.RED);
            }
        });

        // Action listener for b2
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBackground(Color.GREEN);
            }
        });

        // Action listener for b3
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBackground(Color.BLUE);
            }
        });

        // Window Listener to close the Window
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //Adding Buttons to the Frame
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
    }
}
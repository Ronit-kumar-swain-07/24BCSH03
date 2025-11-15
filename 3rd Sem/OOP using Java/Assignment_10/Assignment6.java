/*
    6. Design an AWT GUI application (called AWT Counter). Each time the "Count" button is clicked, the counter value
should increase by 1 and each time the Reset button is clicked the counter value should be reset to zero.
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Assignment6 extends Frame {
    public TextField tf;
    public Button c, r;
    static int count = 0;

    public Assignment6() { // constructor
        // Frame
        setTitle("Assignment-6");
        setSize(300, 250);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(null);

        // Text field and Buttons
        tf = new TextField();
        tf.setEditable(false); // Result field should not be editable
        c = new Button("Count");
        r = new Button("Reset");

        // Bounds for the components
        tf.setBounds(30, 50, 130, 30);
        c.setBounds(180, 50, 80, 30);
        r.setBounds(50, 100, 80, 30);

        // Adding Components
        add(tf);
        add(c);
        add(r);
        tf.setText(Integer.toString(count));

        // Action listener to the count button
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    tf.setText(Integer.toString(++count));
                } catch (NumberFormatException ex) {
                    tf.setText("Invalid Input");
                }
            }
        });

        // Action listener to the Reset button
        r.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    count = 0;
                    tf.setText(Integer.toString(count));
                } catch (NumberFormatException ex) {
                    tf.setText("Invalid Input");
                }
            }
        });
    }

    public static void main(String[] args) {
        Assignment6 frame = new Assignment6();
        frame.setVisible(true);
    }
}
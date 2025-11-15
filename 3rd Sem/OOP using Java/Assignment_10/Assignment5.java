/*
    5. Write a java awt program, which will create 2 text field and one button labelled as Reverse. The user will enter a
number in the 1st text field and upon pressing the button it will display the reverse of the number in the 2nd text
field.
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Assignment5 extends Frame {
    public TextField tf, RF;
    public Button b;

    public Assignment5() { // constructor
        // Frame
        setTitle("Reverse A Number");
        setSize(300, 250);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(null);

        // Text fields and Buttons
        tf = new TextField();
        RF = new TextField();
        RF.setEditable(false); // Result field should not be editable
        b = new Button("Reverse");

        // Bounds for the components
        tf.setBounds(30, 50, 130, 30);
        RF.setBounds(30, 150, 130, 30);
        b.setBounds(30, 200, 130, 30);

        // Adding Components 
        add(tf);
        add(RF);
        add(b);

        // Action listener to the button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    long n = Integer.parseInt(tf.getText());
                    long sum = 0;
                    while (n != 0) {
                        sum = sum * 10 + n % 10;
                        n = n / 10;
                    }
                    RF.setText(Long.toString(sum));
                } catch (NumberFormatException ex) {
                    RF.setText("Invalid Input");
                }
            }
        });
    }

    public static void main(String[] args) {
        Assignment5 frame = new Assignment5();
        frame.setVisible(true);
    }
}
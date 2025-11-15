/*
    8. Write a AWT program, which creates 2 text field with two labels and one button labelled as Count. The program will
take the input from one text filed. When we click the button it will count the number of digits of the given number
and display the result in the second field. Label one will be written as "Input number" and second label will show
"Number of digits: ".
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Assignment8 extends Frame {
    public TextField tf, RF;
    public Button b;
    public Label lb1, lb2;

    public Assignment8() { // constructor
        // Frame
        setTitle("Calculate Number of Digits");
        setSize(300, 250);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(null);

        // Text fields and Button
        tf = new TextField();
        RF = new TextField();
        RF.setEditable(false); // Result field should not be editable
        b = new Button("Calculate");
        lb1 = new Label("Input number");
        lb2 = new Label("Number of digits");

        // Bounds for the components
        lb1.setBounds(30, 50, 130, 30);
        tf.setBounds(150, 50, 130, 30);
        lb2.setBounds(30, 100, 130, 30);
        RF.setBounds(150, 100, 130, 30);
        b.setBounds(80, 150, 130, 30);

        // Adding components
        add(tf);
        add(RF);
        add(b);
        add(lb1);
        add(lb2);

        // Action listener to the button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(tf.getText());
                    int count = 0;
                    while (n != 0) {
                        count++;
                        n = n / 10;
                    }

                    RF.setText(Integer.toString(count));
                } catch (NumberFormatException ex) {
                    RF.setText("Invalid Input");
                }
            }
        });
    }

    public static void main(String[] args) {
        Assignment8 frame = new Assignment8();
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setVisible(true);
    }
}
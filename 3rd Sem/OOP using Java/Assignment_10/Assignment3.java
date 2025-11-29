/*
    3. Write a java awt program, which will create three text field and two button labelled as Add & Subtract. The program will take
the input from the two text filed and upon pressing the Subtract button it will display the result in the third text
field and same as for the Add button.
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Assignment3 extends Frame {
    public TextField tf1, tf2, RF;
    public Button b1, b2;

    public Assignment3() { // constructor
        //Frame
        setTitle("Assignment-3");
        setSize(300, 250);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(null);
        //Text fields and Buttons
        tf1 = new TextField();
        tf2 = new TextField();
        RF = new TextField();
        RF.setEditable(false); // Result field should not be Editable
        b1 = new Button("Subtract");
        b2 = new Button("Add");

        //Bounds for the Components
        tf1.setBounds(30, 50, 130, 30);
        tf2.setBounds(30, 100, 130, 30);
        RF.setBounds(30, 150, 130, 30);
        b1.setBounds(150, 200, 80, 40);
        b2.setBounds(50, 200, 80, 40);

        // Components
        add(tf1);
        add(tf2);
        add(RF);
        add(b1);
        add(b2);

        // Action listener to the Subtract button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    int result = num1 - num2;
                    RF.setText(Integer.toString(result));
                } catch (NumberFormatException ex) {
                    RF.setText("Invalid Input");
                }
            }
        });

        // Action listener to the ADD button
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    int result = num1 + num2;
                    RF.setText(Integer.toString(result));
                } catch (NumberFormatException ex) {
                    RF.setText("Invalid Input");
                }
            }
        });
    }

    public static void main(String[] args) {
        Assignment3 frame = new Assignment3();
        frame.setVisible(true);
    }
}
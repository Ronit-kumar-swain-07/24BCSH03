/*
    2. Write a java awt program, which will create 3 text field and one button labelled as Subtract. The program will take
the input from the two text filed and upon pressing the Subtract button it will display the result in the third text
field.
*/

import java.awt.*;
import java.awt.event.*;

public class Assignment2 extends Frame {
    public TextField tf1, tf2, RF;
    public Button b;

    public Assignment2() { // constructor
        //Frame
        setTitle("Assignment-2");
        setSize(300, 250);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(null);
        // Text fields and Button
        tf1 = new TextField();
        tf2 = new TextField();
        RF = new TextField();

        RF.setEditable(false); // Result field Should not be Editable
        b = new Button("Subtract");

        // Bounds for the components
        tf1.setBounds(30, 50, 130, 30);
        tf2.setBounds(30, 100, 130, 30);
        RF.setBounds(30, 150, 130, 30);
        b.setBounds(30, 200, 130, 30);

        // Adding Components to the frame
        add(tf1);
        add(tf2);
        add(RF);
        add(b);

        // Action listener for the Button
        b.addActionListener(new ActionListener() {
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
    }
    public static void main(String[] args) {
        Assignment2 frame = new Assignment2();
        frame.setVisible(true);
    }
}
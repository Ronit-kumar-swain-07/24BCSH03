
/*
    4. Write a java awt program, which will create 2 text field and one button labelled as Factorial. The user will enter a
number in the 1st text field and upon pressing the button it will display the Factorial of the number in the 2nd text
field.
*/
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Assignment4 extends Frame {
    public TextField tf, RF;
    public Button b;

    public Assignment4() { // constructor
        // Frame
        setTitle("Factorial Calculator");
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
        b = new Button("Factorial");

        // Bounds for the components
        tf.setBounds(30, 50, 130, 30);
        RF.setBounds(30, 150, 130, 30);
        b.setBounds(30, 200, 130, 30);

        // Components
        add(tf);
        add(RF);
        add(b);

        // Action listener to the button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(tf.getText());
                    long fact = 1;
                    for (int i = 1; i <= n; i++)
                        fact *= i;
                    RF.setText(Long.toString(fact));
                } catch (NumberFormatException ex) {
                    RF.setText("Invalid Input");
                }
            }
        });
    }

    public static void main(String[] args) {
        Assignment4 frame = new Assignment4();
        frame.setVisible(true);
    }
}
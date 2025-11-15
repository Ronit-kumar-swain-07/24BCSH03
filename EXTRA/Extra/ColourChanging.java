/*
Java program that takes a color name as input in a text field.
When the user clicks the button, the background color changes.
Invalid color handling is done using try and catch block.
*/

import java.awt.*;
import java.awt.event.*;

public class ColourChanging {
    public static void main(String[] args) {

        // Frame
        Frame frame = new Frame("Colour Changing BackGround");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        // Label
        Label label = new Label("Enter Color Name:");
        label.setBounds(50, 70, 120, 30);

        // Text Field
        TextField input = new TextField();
        input.setBounds(180, 70, 120, 30);

        // Button
        Button apply = new Button("Apply");
        apply.setBounds(150, 130, 80, 40);

        // Button Action
        apply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    String c = input.getText().trim().toLowerCase();
                    Color C;

                    switch (c) {
                        case "red":
                            C = Color.RED;
                            break;
                        case "green":
                            C = Color.GREEN;
                            break;
                        case "blue":
                            C = Color.BLUE;
                            break;
                        case "yellow":
                            C = Color.YELLOW;
                            break;
                        case "black":
                            C = Color.BLACK;
                            break;
                        case "white":
                            C = Color.WHITE;
                            break;
                        case "pink":
                            C = Color.PINK;
                            break;
                        case "orange":
                            C = Color.ORANGE;
                            break;
                        case "cyan":
                            C = Color.CYAN;
                            break;
                        case "gray":
                            C = Color.GRAY;
                            break;

                        default:
                            throw new Exception("Invalid Color");
                    }

                    // Set Background Colour
                    frame.setBackground(C);

                } catch (Exception ex) {
                    // ERROR Dialog Box
                    Dialog d = new Dialog(frame, "Error", true);
                    d.setLayout(new FlowLayout());
                    d.add(new Label("Invalid Color Name! Try red, green, blue..."));
                    Button ok = new Button("OK");
                    ok.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            d.setVisible(false);
                        }
                    });
                    d.add(ok);
                    d.setSize(250, 120);
                    d.setVisible(true);
                }
            }
        });

        // Close Window
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Add Components
        frame.add(label);
        frame.add(input);
        frame.add(apply);
    }
}

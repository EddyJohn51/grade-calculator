import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class MainWindow implements Runnable{
    public JFrame frame = null;
    public JLabel label = null;

    public void run(){
        frame = new JFrame("Grade Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout layout = new GridLayout(3,2);
        frame.getContentPane().setLayout(layout);

        label = new JLabel("Input assignment types and weights (in decimal!) to get started!");
        label.setPreferredSize(new Dimension(500,500));
        label.setFont(Font.decode("ARIAL-ITALIC-48"));
        frame.add(label);

        frame.setPreferredSize(new Dimension(1500,1500));
        frame.pack();
        frame.setVisible(true);
    }
}

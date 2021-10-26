import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class MainWindow implements Runnable, ActionListener {
    public JFrame frame = null;
    public JLabel label = null;
    public JTextField name_field  = null;
    public JTextField weight_field = null;
    public JButton submit_button = null;
    public JButton proceed_button = null;
    public JPanel label_panel = null;
    public JPanel text_panel = null;
    public JPanel button_panel = null;

    public void run(){
        frame = new JFrame("Grade Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout layout = new GridLayout(3,1);
        frame.getContentPane().setLayout(layout);

        label_panel = new JPanel();
        label_panel.setLayout(new GridLayout(1,1));
        frame.add(label_panel);

        text_panel = new JPanel();
        text_panel.setLayout(new GridLayout(2,2));
        frame.add(text_panel);

        button_panel = new JPanel();
        button_panel.setLayout(new GridLayout(1,2));
        frame.add(button_panel);

        label = new JLabel("Input assignment types and weights (in decimal!) to get started!");
        label.setPreferredSize(new Dimension(200,200));
        label.setFont(Font.decode("ARIAL-ITALIC-48"));
        label_panel.add(label);

        JLabel name_label = new JLabel("Assignment Type:");
        text_panel.add(name_label);

        JLabel weight_label = new JLabel("Weight (in decimal):");
        text_panel.add(weight_label);

        name_field = new JTextField();
        name_field.setPreferredSize(new Dimension(400,100));
        text_panel.add(name_field);

        weight_field = new JTextField();
        weight_field.setPreferredSize(new Dimension(400,100));
        text_panel.add(weight_field);

        submit_button = new JButton("Submit");
        submit_button.setActionCommand("submit");
        submit_button.addActionListener(this);
        button_panel.add(submit_button);

        proceed_button = new JButton("Proceed");
        button_panel.add(proceed_button);

        frame.setPreferredSize(new Dimension(1500,1500));
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        if(command == "submit"){
            System.out.println("Type: " + name_field.getText());
            System.out.println("Weight: " + weight_field.getText());
        }
    }
}

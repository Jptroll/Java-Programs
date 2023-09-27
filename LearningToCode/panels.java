package LearningToCode;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;

public class panels {
    public static void main(String[] args)
    {
        ImageIcon icon = new ImageIcon("C:\\Users\\Jptroll\\Java programs\\LearningToCode\\lol.png");

        //JLABEL SECTION
        JLabel label = new JLabel();
        label.setText("I'm learning");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        // label.setBounds(x, y, width, height);
        
        
        //JPANEL SECTION
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250); // x, y, width, height

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250); // x, y, width, height

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250); // x, y, width, height
        greenPanel.setLayout(new BorderLayout()); // I forgot kinda what it did, i suppose it creats a default layout. If changed to null, you would have to add label.setBounds(x, y, width, height)

        

        //JFRAME SECTION
        JFrame frame = new JFrame("Learning"); //set size: width, height (in pixels)
        frame.setSize(750, 750); //set the location (x,y)
        frame.setLayout(null);
        frame.setVisible(true); // makes frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application, also you can change "exit" to "hide" or "DO_NOTHING_" 

        //General section
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);
        greenPanel.add(label); // adding image to green panel
    }

    
}

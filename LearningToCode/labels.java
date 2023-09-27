
package LearningToCode;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

public class labels {


    public static void main(String[] args)
    {

        ImageIcon image = new ImageIcon("C:\\Users\\Jptroll\\Java programs\\LearningToCode\\lol.png"); // Creating image
        Border border = BorderFactory.createLineBorder(Color.green, 10); // creates a border with color and width



        //JLABEL SECTION
        JLabel label = new JLabel(); // Creates a label
        label.setText("Learning how to code"); // Sets text of label
        label.setIcon(image); // pastes icon
        label.setHorizontalTextPosition(JLabel.CENTER); //set text at left, center or right of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text top, center or bottom of imageicon
        label.setForeground(new Color(0x00FF00)); // changes color font
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font of text
        label.setIconTextGap(-5); // sets gap of text to image
        // frame.getContentPane().setBackground(Color.black); // We can use this as changing background, but we can also use:
        label.setBackground(Color.black); // setting background color
        label.setOpaque(true); // displaying background color
        label.setBorder(border); //sets border
        label.setVerticalAlignment(JLabel.CENTER); // as other JLABEL. you can also put numbers instead of that method (it's defaulted in the center)
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 250, 250); // (x, y, width, height) not working

        //JFRAME SECTION
        JFrame frame = new JFrame("Learning"); //set size: width, height (in pixels)
        frame.setSize(420, 420); //set the location (x,y)
        frame.setLayout(null);
        frame.setVisible(true); // makes frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application, also you can change "exit" to "hide" or "DO_NOTHING_" 

        frame.add(label); // adds label to frame
        

    }

    
    
}

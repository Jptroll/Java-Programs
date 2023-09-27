package LearningToCode;

import javax.swing.*;

import java.awt.Color;

public class frames {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Bruh");
        //set size: width, height (in pixels)
        frame.setSize(1920, 1080);
        //set the location (x,y)
        frame.setLocation(0, 0);
        frame.setVisible(true); // makes frame visible

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {  // using a time stop to see changes
            e.printStackTrace();
        }

        frame.setTitle("Not bruh anymore :D"); // changes title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application, also you can change "exit" to "hide" or "DO_NOTHING_" 
        frame.setResizable(false); // can't rezise anymore

        ImageIcon image = new ImageIcon("icon.png"); // create an image icon 

        frame.setIconImage(image.getImage()); // change icon of frame (not working) 
        frame.getContentPane().setBackground(Color.green); // set background color
        frame.getContentPane().setBackground(Color.white);

        


    }
    
    
}

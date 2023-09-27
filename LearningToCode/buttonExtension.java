package LearningToCode;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class buttonExtension extends JFrame implements ActionListener{

    JButton button = new JButton();
    JLabel label;

    buttonExtension()
    {
        ImageIcon icon = new ImageIcon("C:\\Users\\Jptroll\\Java programs\\LearningToCode\\lol.png");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Jptroll\\Java programs\\LearningToCode\\lol.png");


        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(800, 400, 500, 500);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200, 100, 500, 500);

        button.addActionListener(this); // basically detects when the button is clicked

        button.setText("I'm a button"); // sets a text for the button
        button.setFocusable(false); // removes an anoying line in the box
        button.setIcon(icon); // adds icon to button
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25)); // sets font
        button.setIconTextGap(10); // moves button
        button.setForeground(Color.magenta); // changes text color on button
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder()); // changes border
        //button.setEnabled(false); // doesn't let user press button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // how does "this" work in this case? I don't get it...
        this.setLayout(null);
        this.setSize(1920, 1080);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            System.out.println("poop");
            label.setVisible(true);
        }
    }


}

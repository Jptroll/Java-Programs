package EnglishProject;

import java.awt.Color;
import java.awt.Font;

import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class english{
    
    static JButton button1;
    static JButton button2;
    static JButton button3;
    static JButton button4;
    static JButton backButton;

    static JFrame mainFrame;
    static JFrame frame1 = new JFrame();
    static JFrame frame2 = new JFrame();
    static JFrame frame3 = new JFrame();
    static JFrame frame4 = new JFrame();

    static JLabel test = new JLabel();


    public static void main(String[] args)
    {
        mainLayout();  
    }

    public static void BackButton()
    {
        backButton = new JButton();
        backButton.setFocusable(false);
        backButton.setText("back");

        backButton.setBounds(50, 50, 100, 100);
    }

    public static void mainLayout()
    {
        JLabel label = new JLabel();
        label.setText("Press a button to continue");

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        label.setFont(new Font("MV Boli", Font.PLAIN, 30));
        label.setBounds(750, 350, 400, 400);

        frame1.setVisible(false);
        frame2.setVisible(false);
        frame3.setVisible(false);
        frame4.setVisible(false);

        
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        mainFrame = new JFrame();

        button1.setText("Decision");
        button2.setText("Represent");
        button3.setText("Identity");
        button4.setText("Original");

        button1.setFont(new Font("Comic Sans", Font.BOLD,40));
        button2.setFont(new Font("Comic Sans", Font.BOLD,40));
        button3.setFont(new Font("Comic Sans", Font.BOLD,40));
        button4.setFont(new Font("Comic Sans", Font.BOLD,40));

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);

        button1.addActionListener(e -> {layout1();}); // top left
        button1.setBounds(240, 135, 300, 300);

        button2.addActionListener(f -> {layout2();}); // top right 
        button2.setBounds(1380, 135, 300, 300);

        button3.addActionListener(g -> {layout3();}); // bottom left
        button3.setBounds(240, 645, 300, 300);

        button4.addActionListener(h -> {layout4();}); // bottom right
        button4.setBounds(1380, 645, 300, 300);
        

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        mainFrame.setLayout(null);
        mainFrame.setSize(1920, 1080);
        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(label);

        mainFrame.setVisible(true);
    }

    public static void layout1()
    {
        ImageIcon clock = new ImageIcon("C:\\Users\\Jptroll\\Java programs\\EnglishProject\\clocl.png");
        //Border border = BorderFactory.createLineBorder(Color.green, 10);
        JLabel label = new JLabel();
        JLabel title = new JLabel();
        BackButton();
        mainFrame.setVisible(false);
        frame2.setVisible(false);
        frame3.setVisible(false);
        frame4.setVisible(false);

        title.setFont(new Font("Comic Sans", Font.BOLD,80));
        label.setFont(new Font("Comic Sans", Font.BOLD,40));

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame1.setLayout(null);
        frame1.setSize(1920, 1080);

        title.setForeground(Color.green);
        label.setForeground(Color.green);
        frame1.getContentPane().setBackground(Color.black);

        title.setText("Why did I decide to do this?");
        title.setBounds(260, 100, 1400, 200);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        //title.setBorder(border);

        label.setText("<html>I recently learned how to do these kind of things in programming language, that seem so easy but it takes time to learn. It looks simple to do, but for a newcomer, it's something challenging for me since I knew little to nothing about this. As an example, just editing this text that you're reading took me time, I had to investigate how to separate lines.</html>");
        label.setBounds(260, 400, 1400, 563);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBorder(border);

        frame1.add(backButton);
        frame1.add(label);
        frame1.add(title);
        label.setIcon(clock);
        label.setIconTextGap(10); // sets gap of text to image

        backButton.addActionListener(back -> {mainLayout();});

        frame1.setVisible(true);
        
    } 

    public static void layout2()
    {
        ImageIcon book = new ImageIcon("C:\\Users\\Jptroll\\Java programs\\EnglishProject\\book.png");
        Border border = BorderFactory.createLineBorder(Color.blue, 5);
        JLabel label = new JLabel();
        JLabel title = new JLabel();
        BackButton();
        mainFrame.setVisible(false);
        frame1.setVisible(false);
        frame3.setVisible(false);
        frame4.setVisible(false);

        title.setFont(new Font("Comic Sans", Font.BOLD,70));
        label.setFont(new Font("Comic Sans", Font.BOLD,40));

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame2.setLayout(null);
        frame2.setSize(1920, 1080);

        title.setForeground(Color.green);
        label.setForeground(Color.green);
        frame2.getContentPane().setBackground(Color.black);

        title.setText("<html>How does this represent me as a reader and writer?</html>");
        title.setBounds(260, 100, 1400, 200);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBorder(border);

        label.setText("<html>Well, when I read a book, an article or probably anything, I always end up learning something new. It could be a word, it could be an expression, but at the end of the day, it is still something new. In this case, I wanted to show what I have learned after reading and watching other people do these kind of things. Like now I learned that I can add borders, so this text will have a border :D</html>");
        label.setBounds(260, 400, 1400, 563);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBorder(border);

        label.setIcon(book);

        frame2.add(backButton);

        backButton.addActionListener(back -> {mainLayout();}); 
        
        frame2.add(test);
        frame2.add(label);
        frame2.add(title);
        frame2.setVisible(true);
        
    }

    public static void layout3()
    {
        ImageIcon java = new ImageIcon("C:\\Users\\Jptroll\\Java programs\\EnglishProject\\java.png");
        //Border border = BorderFactory.createLineBorder(Color.red, 10);
        JLabel label = new JLabel();
        JLabel title = new JLabel();
        BackButton();
        mainFrame.setVisible(false);
        frame1.setVisible(false);
        frame2.setVisible(false);
        frame4.setVisible(false);

        title.setFont(new Font("Comic Sans", Font.BOLD,70));
        label.setFont(new Font("Comic Sans", Font.BOLD,40));

        title.setForeground(Color.green);
        label.setForeground(Color.green);
        frame3.getContentPane().setBackground(Color.black);

        title.setText("<html>How do the elements I included showcase my identity as a reader/writer?</html>");
        title.setBounds(260, 100, 1400, 200);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        //title.setBorder(border);

        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame3.setLayout(null);
        frame3.setSize(1920, 1080);

        label.setIcon(java);
        label.setIconTextGap(100);

        label.setText("<html>Well like I said before, this entire program shows that through reading I learn a lot. Also, if seen from another perspective, it can show that I like reading many different types of books, considering how different is this project compared to others I've made.</html>");
        label.setBounds(260, 400, 1400, 563);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBorder(border);
        

        frame3.add(backButton);
        frame3.add(label);
        frame3.add(title);

        backButton.addActionListener(back -> {mainLayout();});

        frame3.setVisible(true);
    }

    public static void layout4()
    {
        ImageIcon metropolis = new ImageIcon("C:\\Users\\Jptroll\\Java programs\\EnglishProject\\metropolis.jpg");
        //Border border = BorderFactory.createLineBorder(Color.yellow, 10);
        JLabel label = new JLabel();
        JLabel title = new JLabel();
        BackButton();
        mainFrame.setVisible(false);
        frame1.setVisible(false);
        frame2.setVisible(false);
        frame4.setVisible(false);

        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame4.setLayout(null);
        frame4.setSize(1920, 1080);

        title.setFont(new Font("Comic Sans", Font.BOLD,70));
        label.setFont(new Font("Comic Sans", Font.BOLD,40));

        title.setForeground(Color.green);
        label.setForeground(Color.green);
        frame4.getContentPane().setBackground(Color.black);

        title.setText("<html>What was my original plan?</html>");
        title.setBounds(260, 100, 1400, 200);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        //title.setBorder(border);

        label.setText("<html>Actually, my original plan was just to put a song called \"Dance of eternity\". The song is a 6-7 minute long instrumental piece that has a lot of genres and changes of rythms and speeds. I was going to say something like \"I have read a large variety of books and this song represents that\" or something like that.</html>");
        label.setBounds(260, 400, 1400, 563);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBorder(border);
        label.setIcon(metropolis);
        label.setIconTextGap(10); // sets gap of text to image

        frame4.add(backButton);
        frame4.add(label);
        frame4.add(title);

        backButton.addActionListener(back -> {mainLayout();});

        frame4.setVisible(true);
    }
}

package QuizApplication.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
   JButton rules;       // Button for accessing the rules
   JButton back;        // Button for going back
   JTextField tfname;   // Text field for entering the player's name

   // Constructor for the Login class
   Login() {
      //Background color of the JFrame
      this.getContentPane().setBackground(Color.WHITE);
      this.setLayout((LayoutManager) null);

      // Load and display an image on the JFrame
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("QuizApplication/icons/login.png"));
      JLabel image = new JLabel(i1);
      image.setBounds(0, 0, 600, 500);
      this.add(image);

      //Hheading label
      JLabel heading = new JLabel("Java Quiz");
      heading.setBounds(750, 60, 300, 45);
      heading.setFont(new Font("Comic Sans MS", 1, 40));
      heading.setForeground(new Color(30, 144, 254));
      this.add(heading);

      //Label for entering the name
      JLabel name = new JLabel("Enter your name");
      name.setBounds(810, 150, 300, 20);
      name.setFont(new Font("Mongolian Baiti", 1, 18));
      name.setForeground(new Color(30, 144, 254));
      this.add(name);

      //Text field for entering the name
      this.tfname = new JTextField();
      this.tfname.setBounds(735, 200, 300, 25);
      this.tfname.setFont(new Font("Times New Roman", 1, 20));
      this.add(this.tfname);

      //"Rules" button
      this.rules = new JButton("Rules");
      this.rules.setBounds(735, 270, 120, 25);
      this.rules.setBackground(new Color(30, 144, 254));
      this.rules.setForeground(Color.WHITE);
      this.rules.addActionListener(this);
      this.add(this.rules);

      //"Back" button
      this.back = new JButton("Back");
      this.back.setBounds(915, 270, 120, 25);
      this.back.setBackground(new Color(30, 144, 254));
      this.back.setForeground(Color.WHITE);
      this.back.addActionListener(this);
      this.add(this.back);

      //Size, location, and visibility of the JFrame
      this.setSize(1200, 500);
      this.setLocation(200, 150);
      this.setVisible(true);
   }

   // Action performed when buttons are clicked
   public void actionPerformed(ActionEvent ae) {
      if (ae.getSource() == this.rules) {
         // Get the name entered in the text field
         String name = this.tfname.getText();

         // Hide the current window and open a new window for the "Rules" screen
         this.setVisible(false);
         new Rules(name);
      } else if (ae.getSource() == this.back) {
         // Hide the current window (typically used to go back to a previous screen)
         this.setVisible(false);
      }
   }

   public static void main(String[] args) {
      new Login();
   }
}

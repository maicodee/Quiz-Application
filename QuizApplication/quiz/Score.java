package QuizApplication.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener {
   Score(String name, int score) {
      this.setBounds(400, 150, 750, 550);
      this.getContentPane().setBackground(Color.WHITE);
      this.setLayout((LayoutManager) null);
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("QuizApplication/icons/score.png"));
      Image i2 = i1.getImage().getScaledInstance(300, 250, 1);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(0, 200, 300, 250);
      this.add(image);

      // Display a thank you message with the player's name
      JLabel heading = new JLabel("Thanks for playing!");
      heading.setBounds(45, 30, 700, 30);
      heading.setFont(new Font("Tahoma", 0, 26));
      this.add(heading);

      // Display the player's score
      JLabel lblscore = new JLabel("Scored points are " + score);
      lblscore.setBounds(350, 200, 300, 30);
      lblscore.setFont(new Font("Tahoma", 0, 26));
      this.add(lblscore);

      //"Try Again?" button
      JButton submit = new JButton("Try Again?");
      submit.setBounds(380, 270, 120, 30);
      submit.setBackground(new Color(30, 144, 255));
      submit.setForeground(Color.WHITE);
      submit.addActionListener(this);
      this.add(submit);
      this.setVisible(true);
   }


   // Action performed when the "Try Again?" button is clicked
   public void actionPerformed(ActionEvent ae) {
      
      // Hide the score window and return to the login screen
      this.setVisible(false);
      new Login();
   }

   public static void main(String[] args) {
      new Score("User", 0);
   }
}

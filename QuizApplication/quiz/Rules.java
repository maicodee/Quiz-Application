package QuizApplication.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener {
   String name;
   JButton start;
   JButton back;

   Rules(String name) {
      this.name = name;
      this.getContentPane().setBackground(Color.WHITE);
      this.setLayout((LayoutManager) null);
      JLabel heading = new JLabel("Welcome " + name + " to Java Quiz");
      heading.setBounds(50, 20, 700, 30);
      heading.setFont(new Font("Viner Hand ITC", 1, 28));
      heading.setForeground(new Color(30, 144, 254));
      this.add(heading);
      JLabel rules = new JLabel();
      rules.setBounds(20, 90, 700, 350);
      rules.setFont(new Font("Tahoma", 0, 16));
      rules.setText("<html>" +
            "1. Players must register or log in before participating in the quiz." + "<br><br>" +
            "2. Respond to questions within the allocated time frame." + "<br><br>" +
            "3. Players must not use external resources or aids during the quiz." + "<br><br>" +
            "4. Use provided lifeline sparingly to assist with challenging questions." + "<br><br>" +
            "5. Questions are typically answered once; no retakes are allowed." + "<br><br>" +
            "6. The quiz concludes after a specified number of questions or a set duration." + "<br><br>" +
            "7. Most importantly, have fun and enjoy the quiz experience!" + "<br><br>" +
            "8. You can cry but please do it after quiz" + "<br><br>" +
            "<html>");
      this.add(rules);

      // Back button
      this.back = new JButton("Back");
      this.back.setBounds(250, 500, 100, 30);
      this.back.setBackground(new Color(30, 144, 254));
      this.back.setForeground(Color.WHITE);
      this.back.addActionListener(this);
      this.add(this.back);

      // Start button
      this.start = new JButton("Begin");
      this.start.setBounds(400, 500, 100, 30);
      this.start.setBackground(new Color(30, 144, 254));
      this.start.setForeground(Color.WHITE);
      this.start.addActionListener(this);
      this.add(this.start);
      this.setSize(800, 650);
      this.setLocation(350, 100);
      this.setVisible(true);
   }

   public void actionPerformed(ActionEvent ae) {
      if (ae.getSource() == this.start) {
         this.setVisible(false);
         new Quiz(this.name);
      } else {
         this.setVisible(false);
         new Login();
      }

   }

   public static void main(String[] args) {
      new Rules("User");
   }
}

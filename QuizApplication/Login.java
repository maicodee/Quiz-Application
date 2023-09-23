package QuizApplication;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Login extends JFrame {

    Login() {

        getContentPane().setBackground(Color.white);

        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("QuizApplication/icons.png"));
        // JLabel image = new JLabel(i1);
        // image.setBounds(0 ,0,600,500); 
        // add(image);

        setSize(900, 700);
        setLocation(400, 200);
        setVisible(true);

        JLabel heading = new JLabel("Mystery of Data Structures");
        heading.setBounds(200,60,300,45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,40));
        heading.setForeground(new Color(34 , 154,254));
        add(heading);

        JLabel name = new JLabel("Enter User Name");
        name.setBounds(810,150,40,25);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,40));
        name.setForeground(new Color(205, 133, 63));
        add(name);


    }

    public static void main(String[] args) {

        new Login();
    }

}

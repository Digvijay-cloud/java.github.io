package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    JButton b1, b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(600, 200, 800, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome " + username + " to IBM Mumbai JAVA Quiz");
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        l1.setBounds(50, 20, 700, 30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(20, 90, 600, 350);
        l2.setText(
            "<html>"+ 
                "1. Only Advanced diploma in cloud computing students allowed take test, answer point to point" + "<br><br>" +
                "2. Fill up your personal details carefully." + "<br><br>" +
                "3. All questions are compulsory." + "<br><br>" +
                "4. You are allowed to submit only once, make sure that you have correctly attempted all the questions before submission." + "<br><br>" +
                "5. Attendance is mandatory for all" + "<br><br>" +
                "6. Best of luck." + "<br><br>" +
            "<html>"
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(250, 500, 100, 30);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Start");
        b2.setBounds(400, 500, 100, 30);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Rules("");
    }
}

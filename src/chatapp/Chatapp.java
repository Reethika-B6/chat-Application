/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Chatapp extends JFrame implements ActionListener {
    Chatapp(){
        setLayout(null);
        JPanel p1=new JPanel();
        p1.setBackground(new Color(7,94,84));
        p1.setBounds(0,0,450,70);
        p1.setLayout(null);
        add(p1);
        ImageIcon k1=new ImageIcon(ClassLoader.getSystemResource("icons/i0.png"));
        Image k2=k1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ImageIcon k3=new ImageIcon(k2);
        JLabel back=new JLabel(k3);
        back.setBounds(5,20,25,25);
        p1.add(back);
        back.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent ae){
            System.exit(0);
            //setVisible(false);
        }
    });
         ImageIcon k4=new ImageIcon(ClassLoader.getSystemResource("icons/i5.png"));
        Image k5=k4.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon k6=new ImageIcon(k5);
        JLabel profile=new JLabel(k6);
        profile.setBounds(40,10,50,50);
        p1.add(profile);
        
        ImageIcon k7=new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image k8=k7.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon k9=new ImageIcon(k8);
        JLabel video=new JLabel(k9);
        video.setBounds(300,31,30,30);
        p1.add(video);
        
         ImageIcon k10=new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image k11=k10.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon k12=new ImageIcon(k11);
        JLabel phone=new JLabel(k12);
        phone.setBounds(360,20,35,30);
        p1.add(phone);
        JLabel name=new JLabel("Reethika");
        name.setBounds(110,15,100,18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,18));
        p1.add(name);
        
        JLabel status =new JLabel("Active Now");
        status.setBounds(110,35,100,18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF",Font.BOLD,14));
        p1.add(status);
                
        JPanel a1=new JPanel();
         a1.setBounds(5,75,440,570);
        add(a1);
        
        JTextField text=new JTextField();
        text.setBounds(5,655,310,40);
        text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(text);
        
        JButton send=new JButton("Send");
        send.setBounds(320,655,123,40);
        send.setBackground(new Color(7,94,84));
        send.setForeground(Color.WHITE);
        send.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(send);
        setSize(450,700);
        setLocation(200,50);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
    }  
    public static void main(String[] args){
        new Chatapp();
    }

}

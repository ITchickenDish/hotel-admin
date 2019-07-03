package com.hotel.gui;

import javax.swing.*;
import java.awt.*;


public class LoginGUI extends 	JFrame{
	public LoginGUI() {
		super("登陆");
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	    int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		Container c =this.getContentPane();
		c.setLayout(new BorderLayout());
		JTextField username=new JTextField("账号",30);
		JPasswordField password=new JPasswordField(30);
		JPanel top = new JPanel();
		Component box1 = Box.createVerticalStrut(100);
		top.add(box1);
		top.add(username);
		top.add(password);
		c.add(top);
		JPanel down = new JPanel();
		JButton login = new JButton("登陆");
		JButton registered = new JButton("注册");
		Dimension preferredSize = new Dimension(60,30);
		login.setPreferredSize(preferredSize );
		login.setPreferredSize(preferredSize);
		down.add(login);
		down.add(registered);
		c.add(down,BorderLayout.SOUTH);
		JPanel east = new JPanel();
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setSize(600, 450);
		this.setBounds((width - 600) / 2,(height - 500) / 2, 600, 500);
		this.setResizable(false);
		
	}
	public static void main(String[] args) {
		try

		{

		   for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())

		        if ("Nimbus".equals(info.getName()))

		        {

		           javax.swing.UIManager.setLookAndFeel(info.getClassName());

		           break;

		        }

		}

		catch (Exception e)

		{

		   e.printStackTrace();

		}
		new LoginGUI();

	}
}

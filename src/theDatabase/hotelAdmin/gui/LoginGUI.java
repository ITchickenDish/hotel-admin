package theDatabase.hotelAdmin.gui;

import java.awt.*;
import javax.swing.*;


public class LoginGUI extends 	JFrame{
	public LoginGUI() {
		super("登录");
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	    int height = Toolkit.getDefaultToolkit().getScreenSize().height;//获取屏幕的长宽
		Container c =this.getContentPane();
		c.setLayout(new BorderLayout());
		JTextField username=new JTextField("用户名",30);
		JPasswordField password=new JPasswordField(30);
		JPanel top = new JPanel();
		Component box1 = Box.createVerticalStrut(100);
		top.add(box1);
		top.add(username);
		top.add(password);
		c.add(top);
		JPanel down = new JPanel();
		JButton login = new JButton("登录");
		JButton registered = new JButton("注册");
		Dimension preferredSize = new Dimension(60,30);
		login.setPreferredSize(preferredSize );//设置按钮大小
		login.setPreferredSize(preferredSize);
		down.add(login);
		down.add(registered);
		c.add(down,BorderLayout.SOUTH);
		JPanel east = new JPanel();
		this.pack();
		this.setVisible(true);//窗体可见
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setSize(600, 450);
		this.setBounds((width - 600) / 2,(height - 500) / 2, 600, 500);//窗体大小，居中
		this.setResizable(false);//禁止拉伸窗口，最大化
		
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

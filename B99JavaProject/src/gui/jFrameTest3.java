package gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class jFrameTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,350);
		frame.setLocation(200,100);
		frame.setTitle("Gridlayout Page");
		frame.setIconImage(new ImageIcon("src/zz.png").getImage());
		
		frame.setLayout(new GridLayout());
		
		JButton btnlogin=new JButton();
		btnlogin.setText("Login");
		btnlogin.setBackground(Color.red);
		
		frame.add(btnlogin);
		
		JButton btncancel=new JButton();
		btncancel.setText("Cancel");
		btncancel.setBackground(Color.green);
		
		frame.add(btncancel);
		
		JLabel lbl=new JLabel();
		lbl.setText("Hello World");
		lbl.setForeground(Color.cyan);
		
		frame.add(lbl);
		
		JButton btnok=new JButton();
		btnok.setText("OK");
		btnok.setBackground(Color.blue);
		
		frame.add(btnok);

	}

}

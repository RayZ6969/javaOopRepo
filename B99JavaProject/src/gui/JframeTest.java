package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JframeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame=new JFrame();
		
		frame.setVisible(true);
		frame.setSize(new Dimension(600,450));
		frame.setLocation(new Point(500,250));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
		frame.setTitle("Login Form");
		
		frame.setLayout(new FlowLayout());
		
		JButton btn=new JButton();
		btn.setText("Click me");
		btn.setSize(new Dimension(1000,1000));
		btn.setBackground(Color.lightGray);
		btn.setForeground(Color.blue);
		
		
		frame.add(btn);
		
		JLabel lbl=new JLabel();
		lbl.setText("Enter your name");
		lbl.setForeground(Color.red);
		
		frame.add(lbl);
		
		JTextField txt=new JTextField();
		txt.setText("Su Su");
		txt.setColumns(10);
		txt.setSize(new Dimension(300,300));
		txt.setForeground(Color.BLUE);
		
		frame.add(txt);
		
		JButton btn2=new JButton();
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name=txt.getText();
				JOptionPane.showMessageDialog(null,name+" is login successfully");
				
			}
		}); 
		btn2.setText("Login");
		btn2.setForeground(Color.green);
		
		frame.add(btn2);
		
		
		

	}

}

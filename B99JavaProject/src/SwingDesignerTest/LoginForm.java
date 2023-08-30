package SwingDesignerTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtusername;
	private JPasswordField txtpw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setBackground(new Color(0, 0, 255));
		setForeground(new Color(0, 0, 0));
		setTitle("Login Page");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Htet Arkar Saw Naung\\Downloads\\user-image-with-black-background.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 428);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtusername = new JTextField();
		txtusername.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtusername.setForeground(new Color(0, 0, 128));
		txtusername.setBounds(263, 101, 96, 19);
		contentPane.add(txtusername);
		txtusername.setColumns(10);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setBackground(new Color(0, 0, 128));
		btnlogin.setForeground(new Color(255, 255, 255));
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnlogin.setBounds(179, 165, 85, 21);
		contentPane.add(btnlogin);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(179, 101, 100, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(179, 136, 101, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btncancel = new JButton("Cancel");
		btncancel.setBackground(new Color(0, 0, 128));
		btncancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btncancel.setForeground(new Color(255, 255, 255));
		btncancel.setBounds(274, 165, 85, 21);
		contentPane.add(btncancel);
		
		txtpw = new JPasswordField();
		txtpw.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtpw.setForeground(new Color(0, 0, 128));
		txtpw.setBounds(263, 135, 95, 20);
		contentPane.add(txtpw);
	}
}

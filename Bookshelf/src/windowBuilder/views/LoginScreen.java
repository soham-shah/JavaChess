package windowBuilder.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import com.bookshelf.Authentication;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class LoginScreen {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen window = new LoginScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/Jen/Development/Bookshelf/JavaChess/Bookshelf/resources/booklogo.png"));
		lblNewLabel.setBounds(144, 20, 208, 128);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(114, 176, 67, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(114, 204, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(207, 171, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(207, 199, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				char[] p = textField_1.getPassword();
				String pass = new String(p);
				Authentication auth = new Authentication();
				int answer = auth.validate(name, pass);

				if(answer == 0){
					JOptionPane.showMessageDialog(frame, "User not found" + answer);
				}
				else if(answer == 1){
					JOptionPane.showMessageDialog(frame, "User found");
				}
				else{
					JOptionPane.showMessageDialog(frame, "Admin found");
				}
			}
		});
		btnSubmit.setBounds(114, 242, 88, 16);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnNewUser = new JButton("New User");
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				char[] p = textField_1.getPassword();
				String pass = new String(p);
				Authentication auth = new Authentication();

				auth.addUser(name, pass);
			}
		});
		btnNewUser.setBounds(231, 242, 88, 16);
		frame.getContentPane().add(btnNewUser);
	}
}

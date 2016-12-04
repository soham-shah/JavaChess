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
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextPane;

public class LoginScreen {

	private JFrame frame;
	
	private JTextField textField;
	private JPasswordField textField_1;
	
	private JPanel LogIn;
	private JPanel UserScreen;
	private JPanel AdminScreen;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	
	private JButton btnSubmit;
	private JButton btnNewUser;
	
	private JSeparator separator;
	private JLabel lblBookshelfme;
	private JLabel label;
	private JButton btnLogOut_1;
	private JSeparator separator_1;
	

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
		frame.setBounds(100, 100, 511, 767);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		LogIn = new JPanel();
		frame.getContentPane().add(LogIn, "name_13514574295050");
		LogIn.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(118, 185, 248, 168);
		LogIn.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("/Users/Jen/Development/Bookshelf/JavaChess/Bookshelf/resources/books.png"));
		
		lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(140, 382, 62, 16);
		LogIn.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(143, 420, 59, 16);
		LogIn.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(226, 377, 130, 26);
		LogIn.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(226, 415, 130, 26);
		LogIn.add(textField_1);
		textField_1.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(143, 462, 88, 29);
		LogIn.add(btnSubmit);
		
		btnNewUser = new JButton("New User");
		btnNewUser.setBounds(243, 462, 103, 29);
		LogIn.add(btnNewUser);
		
		lblBookshelfme = new JLabel("Bookshelf.me");
		lblBookshelfme.setBounds(66, 86, 378, 73);
		LogIn.add(lblBookshelfme);
		lblBookshelfme.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookshelfme.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		
		UserScreen = new JPanel();
		frame.getContentPane().add(UserScreen, "name_13531542104794");
		UserScreen.setLayout(null);
		
		lblNewLabel_3 = new JLabel("Welcome to Bookshelf.me");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(66, 47, 378, 73);
		UserScreen.add(lblNewLabel_3);
		
		separator = new JSeparator();
		separator.setBounds(66, 120, 378, 12);
		UserScreen.add(separator);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserScreen.setVisible(false);
				LogIn.setVisible(true);
			}
		});
		btnLogOut.setBounds(388, 6, 117, 29);
		UserScreen.add(btnLogOut);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.setBackground(Color.WHITE);
		btnSettings.setBounds(6, 6, 117, 29);
		UserScreen.add(btnSettings);
		
		AdminScreen = new JPanel();
		frame.getContentPane().add(AdminScreen, "name_13539955094575");
		AdminScreen.setLayout(null);
		
		label = new JLabel("Welcome to Bookshelf.me");
		label.setBounds(65, 47, 378, 73);
		AdminScreen.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		
		btnLogOut_1 = new JButton("Log out");
		btnLogOut_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminScreen.setVisible(false);
				LogIn.setVisible(true);
			}
		});
		btnLogOut_1.setBounds(388, 6, 117, 29);
		AdminScreen.add(btnLogOut_1);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(65, 111, 378, 12);
		AdminScreen.add(separator_1);
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				char[] p = textField_1.getPassword();
				String pass = new String(p);
				Authentication auth = new Authentication();

				auth.addUser(name, pass);
			}
		});
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				char[] p = textField_1.getPassword();
				String pass = new String(p);
				Authentication auth = new Authentication();
				int answer = auth.validate(name, pass);

				if(answer == 0){
					JOptionPane.showMessageDialog(frame, "User not found, try again");
				}
				else if(answer == 1){
					LogIn.setVisible(false);
					UserScreen.setVisible(true);
				}
				else{
					LogIn.setVisible(false);
					AdminScreen.setVisible(true);
				}
			}
		});
	}
}

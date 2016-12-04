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
	
	private JTextField loginUsernameField;
	private JPasswordField loginPasswordField;
	
	private JPanel LogIn;
	private JPanel UserScreen;
	private JPanel AdminScreen;
	
	private JLabel bookPic;
	private JLabel loginUsernameLabel;
	private JLabel loginPasswordLabel;
	private JLabel userScreenTitle;
	
	private JButton loginSubmitButton;
	private JButton newUserButton;
	
	private JSeparator separator;
	private JLabel bookshelfTitle;
	private JLabel label;
	private JButton btnLogOut_1;
	private JSeparator separator_1;
	private JPanel Settings;
	private JLabel label_1;
	private JButton button;
	private JSeparator separator_2;
	private JTextField textField_2;
	private JTextField textField_3;
	

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
		
		bookPic = new JLabel("");
		bookPic.setEnabled(false);
		bookPic.setVerticalAlignment(SwingConstants.TOP);
		bookPic.setHorizontalAlignment(SwingConstants.CENTER);
		bookPic.setBounds(118, 185, 248, 168);
		LogIn.add(bookPic);
		bookPic.setIcon(new ImageIcon("/Users/Jen/Development/Bookshelf/JavaChess/Bookshelf/resources/books.png"));
		
		loginUsernameLabel = new JLabel("Username");
		loginUsernameLabel.setBounds(140, 382, 62, 16);
		LogIn.add(loginUsernameLabel);
		
		loginPasswordLabel = new JLabel("Password");
		loginPasswordLabel.setBounds(143, 420, 59, 16);
		LogIn.add(loginPasswordLabel);
		
		loginUsernameField = new JTextField();
		loginUsernameField.setBounds(226, 377, 130, 26);
		LogIn.add(loginUsernameField);
		loginUsernameField.setColumns(10);
		
		loginPasswordField = new JPasswordField();
		loginPasswordField.setBounds(226, 415, 130, 26);
		LogIn.add(loginPasswordField);
		loginPasswordField.setColumns(10);
		
		loginSubmitButton = new JButton("Submit");
		loginSubmitButton.setBounds(143, 462, 88, 29);
		LogIn.add(loginSubmitButton);
		
		newUserButton = new JButton("New User");
		newUserButton.setBounds(243, 462, 103, 29);
		LogIn.add(newUserButton);
		
		bookshelfTitle = new JLabel("Bookshelf.me");
		bookshelfTitle.setBounds(66, 86, 378, 73);
		LogIn.add(bookshelfTitle);
		bookshelfTitle.setHorizontalAlignment(SwingConstants.CENTER);
		bookshelfTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		
		UserScreen = new JPanel();
		frame.getContentPane().add(UserScreen, "name_13531542104794");
		UserScreen.setLayout(null);
		
		userScreenTitle = new JLabel("Welcome to Bookshelf.me");
		userScreenTitle.setHorizontalAlignment(SwingConstants.CENTER);
		userScreenTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		userScreenTitle.setBounds(66, 47, 378, 73);
		UserScreen.add(userScreenTitle);
		
		separator = new JSeparator();
		separator.setBounds(66, 120, 378, 12);
		UserScreen.add(separator);
		
		JButton userScreenLogoutButton = new JButton("Log out");
		userScreenLogoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserScreen.setVisible(false);
				LogIn.setVisible(true);
			}
		});
		userScreenLogoutButton.setBounds(388, 6, 117, 29);
		UserScreen.add(userScreenLogoutButton);
		
		JButton userScreenSettingsButton = new JButton("Settings");
		userScreenSettingsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserScreen.setVisible(false);
				Settings.setVisible(true);
			}
		});
		userScreenSettingsButton.setBackground(Color.WHITE);
		userScreenSettingsButton.setBounds(6, 6, 117, 29);
		UserScreen.add(userScreenSettingsButton);
		
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
		
		Settings = new JPanel();
		Settings.setLayout(null);
		frame.getContentPane().add(Settings, "name_194355372463");
		
		label_1 = new JLabel("Welcome to Bookshelf.me");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		label_1.setBounds(65, 47, 378, 73);
		Settings.add(label_1);
		
		button = new JButton("Log out");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Settings.setVisible(false);
				LogIn.setVisible(true);
			}
		});
		button.setBounds(388, 6, 117, 29);
		Settings.add(button);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(65, 111, 378, 12);
		Settings.add(separator_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Settings.setVisible(false);
				UserScreen.setVisible(true);
			}
		});
		btnBack.setBounds(0, 6, 117, 29);
		Settings.add(btnBack);
		
		JLabel lblChangePassword = new JLabel("Change Password");
		lblChangePassword.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblChangePassword.setBounds(169, 132, 176, 16);
		Settings.add(lblChangePassword);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(170, 175, 69, 16);
		Settings.add(lblUsername);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setBounds(143, 203, 96, 16);
		Settings.add(lblNewPassword);
		
		textField_2 = new JTextField();
		textField_2.setBounds(251, 170, 130, 26);
		Settings.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(251, 198, 130, 26);
		Settings.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblYourStatistics = new JLabel("Your Statistics");
		lblYourStatistics.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblYourStatistics.setBounds(184, 297, 140, 16);
		Settings.add(lblYourStatistics);
		
		JButton btnSubmit_1 = new JButton("Submit");
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField_2.getText();
				String pass = textField_3.getText();

				auth.changePassword(name, pass);
			}
		});
		btnSubmit_1.setBounds(196, 232, 117, 29);
		Settings.add(btnSubmit_1);
		
		JLabel lblNumberOfBooks = new JLabel("Number of Books Read");
		lblNumberOfBooks.setBounds(143, 339, 151, 16);
		Settings.add(lblNumberOfBooks);
		newUserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = loginUsernameField.getText();
				char[] p = loginPasswordField.getPassword();
				String pass = new String(p);
				Authentication auth = new Authentication();

				auth.addUser(name, pass);
			}
		});
		loginSubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = loginUsernameField.getText();
				char[] p = loginPasswordField.getPassword();
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

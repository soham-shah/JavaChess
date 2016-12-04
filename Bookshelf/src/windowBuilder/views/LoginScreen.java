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
import javax.swing.JScrollPane;

public class LoginScreen {

	private Authentication auth = new Authentication();
	
	private JFrame frame;
	
	private JTextField loginUsernameField;
	private JPasswordField loginPasswordField;
	private JTextField settingsUsernameField;
	private JTextField settingsNewPasswordField;
	
	private JPanel LogIn;
	private JPanel UserScreen;
	private JPanel AdminScreen;
	private JPanel Settings;
	
	private JLabel bookPic;
	private JLabel loginUsernameLabel;
	private JLabel loginPasswordLabel;
	private JLabel userScreenTitle;
	private JLabel bookshelfTitle;
	private JLabel adminScreenTitle;
	private JLabel settingsTitle;
	
	private JButton loginSubmitButton;
	private JButton newUserButton;
	private JButton adminScreenLogoutButton;
	private JButton settingsLogoutButton;
	
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JTable table;
	private JScrollPane scrollPane;

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
		
		adminScreenTitle = new JLabel("Welcome to Bookshelf.me");
		adminScreenTitle.setBounds(65, 47, 378, 73);
		AdminScreen.add(adminScreenTitle);
		adminScreenTitle.setHorizontalAlignment(SwingConstants.CENTER);
		adminScreenTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		
		adminScreenLogoutButton = new JButton("Log out");
		adminScreenLogoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminScreen.setVisible(false);
				LogIn.setVisible(true);
			}
		});
		adminScreenLogoutButton.setBounds(388, 6, 117, 29);
		AdminScreen.add(adminScreenLogoutButton);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(65, 111, 378, 12);
		AdminScreen.add(separator_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(478, 156, -445, 563);
		AdminScreen.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(Color.WHITE);
		
		Settings = new JPanel();
		Settings.setLayout(null);
		frame.getContentPane().add(Settings, "name_194355372463");
		
		settingsTitle = new JLabel("Welcome to Bookshelf.me");
		settingsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		settingsTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		settingsTitle.setBounds(65, 47, 378, 73);
		Settings.add(settingsTitle);
		
		settingsLogoutButton = new JButton("Log out");
		settingsLogoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Settings.setVisible(false);
				LogIn.setVisible(true);
			}
		});
		settingsLogoutButton.setBounds(388, 6, 117, 29);
		Settings.add(settingsLogoutButton);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(65, 111, 378, 12);
		Settings.add(separator_2);
		
		JButton settingsBackButton = new JButton("Back");
		settingsBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Settings.setVisible(false);
				UserScreen.setVisible(true);
			}
		});
		settingsBackButton.setBounds(0, 6, 117, 29);
		Settings.add(settingsBackButton);
		
		JLabel changePasswordTitle = new JLabel("Change Password");
		changePasswordTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		changePasswordTitle.setBounds(169, 132, 176, 16);
		Settings.add(changePasswordTitle);
		
		JLabel settingsUsernameLabel = new JLabel("Username");
		settingsUsernameLabel.setBounds(170, 175, 69, 16);
		Settings.add(settingsUsernameLabel);
		
		JLabel settingsNewPasswordTitle = new JLabel("New Password");
		settingsNewPasswordTitle.setBounds(143, 203, 96, 16);
		Settings.add(settingsNewPasswordTitle);
		
		settingsUsernameField = new JTextField();
		settingsUsernameField.setBounds(251, 170, 130, 26);
		Settings.add(settingsUsernameField);
		settingsUsernameField.setColumns(10);
		
		settingsNewPasswordField = new JTextField();
		settingsNewPasswordField.setBounds(251, 198, 130, 26);
		Settings.add(settingsNewPasswordField);
		settingsNewPasswordField.setColumns(10);
		
		JLabel settingsStatsTitle = new JLabel("Your Statistics");
		settingsStatsTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		settingsStatsTitle.setBounds(184, 297, 140, 16);
		Settings.add(settingsStatsTitle);
		
		JButton settingsChangePasswordButton = new JButton("Submit");
		settingsChangePasswordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = settingsUsernameField.getText();
				String pass = settingsNewPasswordField.getText();
				
				if(auth.changePassword(name, pass)){
					JOptionPane.showMessageDialog(frame, "Password changed!");
				}
				else{
					JOptionPane.showMessageDialog(frame, "User not found, try again");
				}
				
			}
		});
		settingsChangePasswordButton.setBounds(196, 232, 117, 29);
		Settings.add(settingsChangePasswordButton);
		
		JLabel settingsBooksReadLabel = new JLabel("Number of Books Read");
		settingsBooksReadLabel.setBounds(143, 339, 151, 16);
		Settings.add(settingsBooksReadLabel);
		newUserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = loginUsernameField.getText();
				char[] p = loginPasswordField.getPassword();
				String pass = new String(p);

				auth.addUser(name, pass);
			}
		});
		loginSubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = loginUsernameField.getText();
				char[] p = loginPasswordField.getPassword();
				String pass = new String(p);
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

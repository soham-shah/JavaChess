package windowBuilder.views;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import com.bookshelf.Authentication;
import com.bookshelf.Book;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JSpinner;

public class LoginScreen {

	Authentication auth = Authentication.getInstance( );
	/*private Authentication auth = new Authentication();*/
	
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
	private JLabel settingsNumBooksRead;
	private JTable usertable;
	private JPanel AddBookScreen;
	private JButton btnBack;
	private JLabel lblLetsAddA;
	private JLabel lblFillInAs;
	private JLabel lblTitle;
	private JLabel lblAuthor;
	private JLabel lblGenre;
	private JLabel lblIsbn;
	private JLabel lblHaveYouRead;
	private JTextField titleText;
	private JTextField authorText;
	private JTextField genreText;
	private JTextField isbnText;
	private JScrollPane scrollPane;
	private JTable booktable;
	private JScrollPane scrollPane_1;
	private JButton btnDeleteBook;
	private JButton btnEditBook;
	private JTextField editTitleText;
	private JTextField editAuthorText;
	private JTextField editGenreText;
	private JTextField editISBNText;

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
				settingsNumBooksRead.setText(String.valueOf(auth.currentUser.getBooksRead()));
			}
		});
		userScreenSettingsButton.setBackground(Color.WHITE);
		userScreenSettingsButton.setBounds(6, 6, 117, 29);
		UserScreen.add(userScreenSettingsButton);
		
		JButton addNewBookButton = new JButton("Add a new Book");
		addNewBookButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserScreen.setVisible(false);
				AddBookScreen.setVisible(true);
			}
		});
		addNewBookButton.setBounds(191, 132, 132, 29);
		UserScreen.add(addNewBookButton);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(19, 173, 472, 549);
		UserScreen.add(scrollPane_1);
		
		booktable = new JTable();
		scrollPane_1.setViewportView(booktable);
		
		btnDeleteBook = new JButton("Delete Book");
		btnDeleteBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowIndex = booktable.getSelectedRow();
				auth.currentUser.deleteBook(rowIndex);
				booktable.setModel(auth.getBookModel());
			}
		});
		btnDeleteBook.setBounds(38, 132, 117, 29);
		UserScreen.add(btnDeleteBook);
		
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
		scrollPane.setBounds(20, 131, 462, 586);
		AdminScreen.add(scrollPane);
		
		usertable = new JTable();
		scrollPane.setViewportView(usertable);

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
		
		settingsNumBooksRead = new JLabel();
		settingsNumBooksRead.setBounds(320, 339, 61, 16);
		Settings.add(settingsNumBooksRead);
		
		AddBookScreen = new JPanel();
		frame.getContentPane().add(AddBookScreen, "name_6790348537154");
		AddBookScreen.setLayout(null);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddBookScreen.setVisible(false);
				UserScreen.setVisible(true);
			}
		});
		btnBack.setBounds(6, 6, 75, 29);
		AddBookScreen.add(btnBack);
		
		lblLetsAddA = new JLabel("Lets add a book to your bookshelf!");
		lblLetsAddA.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblLetsAddA.setBounds(40, 49, 438, 61);
		AddBookScreen.add(lblLetsAddA);
		
		lblFillInAs = new JLabel("Fill in as much information as you can");
		lblFillInAs.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblFillInAs.setBounds(66, 110, 373, 29);
		AddBookScreen.add(lblFillInAs);
		
		lblTitle = new JLabel("Title");
		lblTitle.setBounds(92, 175, 61, 16);
		AddBookScreen.add(lblTitle);
		
		lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(92, 214, 61, 16);
		AddBookScreen.add(lblAuthor);
		
		lblGenre = new JLabel("Genre");
		lblGenre.setBounds(92, 259, 61, 16);
		AddBookScreen.add(lblGenre);
		
		lblIsbn = new JLabel("ISBN");
		lblIsbn.setBounds(92, 308, 61, 16);
		AddBookScreen.add(lblIsbn);
		
		lblHaveYouRead = new JLabel("Have you read this book?");
		lblHaveYouRead.setBounds(92, 360, 167, 16);
		AddBookScreen.add(lblHaveYouRead);
		
		final JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setBounds(329, 356, 61, 23);
		
		final JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBounds(268, 356, 67, 23);
		rdbtnNo.setSelected(true);
		
		ButtonGroup radioBtnGroup = new ButtonGroup();
		radioBtnGroup.add(rdbtnNo);
		radioBtnGroup.add(rdbtnYes);
		
		AddBookScreen.add(rdbtnNo);
		AddBookScreen.add(rdbtnYes);
		
		JLabel lblRateThisBook = new JLabel("Rate this book? (1-5 stars)");
		lblRateThisBook.setBounds(109, 401, 174, 16);
		AddBookScreen.add(lblRateThisBook);
		
		JLabel lblComments = new JLabel("Comments?");
		lblComments.setBounds(110, 442, 81, 16);
		AddBookScreen.add(lblComments);
		
		final JTextArea commentsText = new JTextArea();
		commentsText.setBounds(109, 470, 280, 141);
		commentsText.setEnabled(false);
		AddBookScreen.add(commentsText);
		
		SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1,1,5,1);
		final JSpinner bookRating = new JSpinner(spinnerModel);
		bookRating.setBounds(295, 396, 52, 26);
		bookRating.setEnabled(false);
		AddBookScreen.add(bookRating);
		
		rdbtnNo.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	commentsText.setEnabled(false);
	        	bookRating.setEnabled(false);
	        }
	    });

	    rdbtnYes.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	commentsText.setEnabled(true);
	        	bookRating.setEnabled(true);
	        }
	    });
		
		titleText = new JTextField();
		titleText.setBounds(165, 170, 241, 26);
		AddBookScreen.add(titleText);
		titleText.setColumns(10);
		
		authorText = new JTextField();
		authorText.setColumns(10);
		authorText.setBounds(165, 209, 241, 26);
		AddBookScreen.add(authorText);
		
		genreText = new JTextField();
		genreText.setColumns(10);
		genreText.setBounds(165, 254, 241, 26);
		AddBookScreen.add(genreText);
		
		isbnText = new JTextField();
		isbnText.setColumns(10);
		isbnText.setBounds(165, 303, 241, 26);
		AddBookScreen.add(isbnText);
		
		JButton addBookSubmit = new JButton("Submit");
		addBookSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Save a book
				String title = titleText.getText();
				String author = authorText.getText();
				String genre = genreText.getText();
				String isbn = isbnText.getText();
				boolean read = false;
				int rating = 0;
				String comment = "";
				if(rdbtnYes.isSelected()){
					read = true;
					rating = (int) bookRating.getValue();
					comment = commentsText.getText();
				}
				Book newBook = new Book(title, author, genre, isbn, read, rating, comment);
				auth.currentUser.addBook(newBook);
				
				//Clear input
				titleText.setText("");
				authorText.setText("");
				genreText.setText("");
				isbnText.setText("");
				rdbtnNo.setSelected(true);
				bookRating.setValue(1);
				commentsText.setText("");
				commentsText.setEnabled(false);
	        	bookRating.setEnabled(false);
				
				//move back to user page
				booktable.setModel(auth.getBookModel());
				AddBookScreen.setVisible(false);
				UserScreen.setVisible(true);
			}
		});
		addBookSubmit.setBounds(189, 642, 117, 29);
		AddBookScreen.add(addBookSubmit);
		
		final JPanel EditBookScreen = new JPanel();
		EditBookScreen.setLayout(null);
		frame.getContentPane().add(EditBookScreen, "name_14329025544932");
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditBookScreen.setVisible(false);
				UserScreen.setVisible(true);
			}
		});
		button.setBounds(6, 6, 75, 29);
		EditBookScreen.add(button);
		
		JLabel lblLetsEditA = new JLabel("Lets edit a book in your bookshelf!");
		lblLetsEditA.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblLetsEditA.setBounds(40, 49, 438, 61);
		EditBookScreen.add(lblLetsEditA);
		
		JLabel label_1 = new JLabel("Fill in as much information as you can");
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label_1.setBounds(66, 110, 373, 29);
		EditBookScreen.add(label_1);
		
		JLabel editTitle = new JLabel("Title");
		editTitle.setBounds(92, 175, 61, 16);
		EditBookScreen.add(editTitle);
		
		JLabel editAuthor = new JLabel("Author");
		editAuthor.setBounds(92, 214, 61, 16);
		EditBookScreen.add(editAuthor);
		
		JLabel editGenre = new JLabel("Genre");
		editGenre.setBounds(92, 259, 61, 16);
		EditBookScreen.add(editGenre);
		
		JLabel editISBN = new JLabel("ISBN");
		editISBN.setBounds(92, 308, 61, 16);
		EditBookScreen.add(editISBN);
		
		JLabel readLabel = new JLabel("Have you read this book?");
		readLabel.setBounds(92, 360, 167, 16);
		EditBookScreen.add(readLabel);
		
		final JRadioButton radioButton = new JRadioButton("No");
		radioButton.setSelected(true);
		radioButton.setBounds(268, 356, 67, 23);
		
		final JRadioButton radioButton_1 = new JRadioButton("Yes");
		radioButton_1.setBounds(329, 356, 61, 23);
		
		ButtonGroup radioBtnGroup1 = new ButtonGroup();
		radioBtnGroup1.add(radioButton);
		radioBtnGroup1.add(radioButton_1);
		
		EditBookScreen.add(radioButton);
		EditBookScreen.add(radioButton_1);
		
		JLabel rateLabel = new JLabel("Rate this book? (1-5 stars)");
		rateLabel.setBounds(109, 401, 174, 16);
		EditBookScreen.add(rateLabel);
		
		JLabel commentLabel = new JLabel("Comments?");
		commentLabel.setBounds(110, 442, 81, 16);
		EditBookScreen.add(commentLabel);
		
		final JTextArea editCommentText = new JTextArea();
		editCommentText.setEnabled(false);
		editCommentText.setBounds(109, 470, 280, 141);
		EditBookScreen.add(editCommentText);
		
		final JSpinner editRatingText = new JSpinner(spinnerModel);
		editRatingText.setEnabled(false);
		editRatingText.setBounds(295, 396, 52, 26);
		EditBookScreen.add(editRatingText);
		
		editTitleText = new JTextField();
		editTitleText.setColumns(10);
		editTitleText.setBounds(165, 170, 241, 26);
		EditBookScreen.add(editTitleText);
		
		editAuthorText = new JTextField();
		editAuthorText.setColumns(10);
		editAuthorText.setBounds(165, 209, 241, 26);
		EditBookScreen.add(editAuthorText);
		
		editGenreText = new JTextField();
		editGenreText.setColumns(10);
		editGenreText.setBounds(165, 254, 241, 26);
		EditBookScreen.add(editGenreText);
		
		editISBNText = new JTextField();
		editISBNText.setColumns(10);
		editISBNText.setBounds(165, 303, 241, 26);
		EditBookScreen.add(editISBNText);
		
		radioButton.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	editCommentText.setEnabled(false);
	        	editRatingText.setEnabled(false);
	        }
	    });

	    radioButton_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	editCommentText.setEnabled(true);
	        	editRatingText.setEnabled(true);
	        }
	    });
	    
		btnEditBook = new JButton("Edit Book");
		btnEditBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowIndex = booktable.getSelectedRow();
				if(rowIndex <= 0){
					JOptionPane.showMessageDialog(frame, "Select an existing Book");
				}
				else{
					Book temp = auth.currentUser.bookshelf.get(rowIndex-1);
					editTitleText.setText(temp.getTitle());
					editAuthorText.setText(temp.getAuthor());
					editGenreText.setText(temp.getGenre());
					editISBNText.setText(temp.getIsbn());
					if(temp.getRead()){
						editRatingText.setValue(temp.getRating());
						editCommentText.setText(temp.getComment());
						radioButton_1.setSelected(true);
						editRatingText.setEnabled(true);
						editCommentText.setEnabled(true);
					}
					
					UserScreen.setVisible(false);
					EditBookScreen.setVisible(true);
					
					auth.currentUser.deleteBook(rowIndex);
				}
			}
		});
		btnEditBook.setBounds(360, 132, 117, 29);
		UserScreen.add(btnEditBook);
		
		JButton editBookSubmit = new JButton("Submit");
		editBookSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Save a book
				String title = editTitleText.getText();
				String author = editAuthorText.getText();
				String genre = editGenreText.getText();
				String isbn = editISBNText.getText();
				boolean read = false;
				int rating = 0;
				String comment = "";
				if(radioButton_1.isSelected()){
					read = true;
					rating = (int) editRatingText.getValue();
					comment = editCommentText.getText();
				}
				Book newBook = new Book(title, author, genre, isbn, read, rating, comment);
				auth.currentUser.addBook(newBook);
				
				//move back to user page
				booktable.setModel(auth.getBookModel());
				EditBookScreen.setVisible(false);
				UserScreen.setVisible(true);
			}
		});
		editBookSubmit.setBounds(189, 642, 117, 29);
		EditBookScreen.add(editBookSubmit);
		
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
				//Go to the User view
				else if(answer == 1){
					booktable.setModel(auth.getBookModel());
					LogIn.setVisible(false);
					UserScreen.setVisible(true);
				}
				//go to the admin view
				else{
					usertable.setModel(auth.getModel());
					LogIn.setVisible(false);
					AdminScreen.setVisible(true);
				}
			}
		});
	}
}

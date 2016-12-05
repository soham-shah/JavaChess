package com.bookshelf;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Authentication {

	private static Authentication singleton = new Authentication( );
	
	/* A private Constructor prevents any other
	    * class from instantiating.
	*/
	private Authentication () {}
	
	public static Authentication getInstance( ) {
	      return singleton;
	   }
	
    private static ArrayList<User> users = new ArrayList<User>();
    private static ArrayList<Admin> admins = new ArrayList<Admin>();
    public static User currentUser;

    public Authentication(){
    	this.addUser("User", "User");
    	this.addAdmin("Admin", "Admin");
    }
    
    public void addUser(String username, String password){
        users.add(new User(username, password));
    }

    public boolean removeUser(String username, String password){
        int location;
        for(int i = 0; i < users.size(); i++){
            if (users.get(i).getUsername() == username){
                if (users.get(i).getPassword() == password){
                    users.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public void printUsers(){
        for(int i = 0; i < users.size(); i++){
            System.out.println(users.get(i).getUsername());
        }
    }

    public void addAdmin(String username, String password){
        admins.add(new Admin(username, password));
    }

    public boolean removeAdmin(String username, String password){
        int location;
        for(int i = 0; i < admins.size(); i++){
            if (admins.get(i).getUsername() == username){
                if (admins.get(i).getPassword() == password)
                    admins.remove(i);
                return true;
            }
        }
        return false;
    }

    public void printAdmins(){
        for(int i = 0; i < admins.size(); i++){
            System.out.println(admins.get(i).getUsername());
        }
    }

    public int validate (String username, String password){
        for(int i = 0; i < users.size(); i++){
            if (users.get(i).getUsername().equals(username)){
                if (users.get(i).getPassword().equals(password)){
                	currentUser = getUser(username, password);
                    return 1;
                }
            }
        }
        for(int i = 0; i < admins.size(); i++){
            if (admins.get(i).getUsername().equals(username)){
                if (admins.get(i).getPassword().equals(password)){
                    return 2;
                }
            }
        }

        return 0;
    }

    public User getUser(String username, String password){
        for(int i = 0; i < users.size(); i++){
            if (users.get(i).getUsername().equals(username)){
                if (users.get(i).getPassword().equals(password)){
                    return users.get(i);
                }
            }
        }
        return new User("null", "null");
    }

    public Admin getAdmin(String username, String password) {
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getUsername().equals(username)) {
                if (admins.get(i).getPassword().equals(password)) {
                    return admins.get(i);
                }
            }
        }
        return new Admin("null", "null");
    }

    public Boolean changePassword(String username, String password){
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                User tempUser = users.get(i);
                users.remove(i);
                tempUser.setPassword(password);
                users.add(tempUser);
                return true;
            }
        }
        return false;
    }
    
    public TableModel getModel(){

        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{{}},
                new Object[]{"Username", "Password", "# Books Read", "# Books in shelf"}
        );
        for (int i = 0; i< users.size(); i++){
            User temp = users.get(i);
            model.addRow(new Object[] {temp.getUsername(), temp.getPassword(), temp.getBooksRead(), temp.bookCount()});
        }

        return model;
    }

    public TableModel getBookModel(){
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{{}},
                new Object[]{"Title", "Author", "Genre", "Read", "Rating", "Comments"}
        );
        for (int i = 0; i< currentUser.bookshelf.size(); i++){
            Book temp = currentUser.bookshelf.get(i);
            model.addRow(new Object[] {temp.getTitle(), temp.getAuthor(), temp.getGenre(), temp.getRead(), temp.getRating(), temp.getComment()});
        }
        return model;
    }

}

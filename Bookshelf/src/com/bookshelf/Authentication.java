package com.bookshelf;

import java.util.ArrayList;

public class Authentication {

    private static ArrayList<User> users = new ArrayList<User>();
    private static ArrayList<Admin> admins = new ArrayList<Admin>();

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


}

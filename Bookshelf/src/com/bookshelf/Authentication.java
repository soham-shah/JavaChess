package com.bookshelf;

import java.util.ArrayList;

public class Authentication {

    private static ArrayList<User> users = new ArrayList<User>();
    private static ArrayList<Admin> admins = new ArrayList<Admin>();

    public void addUser(User person){
        users.add(person);
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
        for(int i = 0; i < admins.size(); i++){
            System.out.println(admins.get(i).getUsername());
        }
    }

    public void addAdmin(Admin person){
        admins.add(person);
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

    public String validate (String username, String password){
        for(int i = 0; i < users.size(); i++){
            if (users.get(i).getUsername() == username){
                if (users.get(i).getPassword() == password){
                    return "user";
                }
            }
        }
        for(int i = 0; i < admins.size(); i++){
            if (admins.get(i).getUsername() == username){
                if (admins.get(i).getPassword() == password){
                    return "admin";
                }
            }
        }

        return "none";
    }



}

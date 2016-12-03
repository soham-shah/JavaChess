package com.bookshelf;

import java.util.ArrayList;

/**
 * Created by soham on 12/3/16.
 */
public class Authentication {

    private static ArrayList<User> users = new ArrayList<User>();

    public void addUser(User person){
        users.add(person);
    }

    // TODO: 12/3/16 come back and implement an if check to actually know if that user is in the list of users
    public boolean removeUser(String username, String password){
        int location;
        for(int i = 0; i < users.size(); i++){
            if (users.get(i).getUsername() == username){
                if (users.get(i).getPassword() == password)
                    users.remove(i);
                    return true;
            }
        }
        return false;
    }

    public void printUsers(){
        for(int i = 0; i < users.size(); i++){
            System.out.println(users.get(i).getUsername());
        }
    }

}

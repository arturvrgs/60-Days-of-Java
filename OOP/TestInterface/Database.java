package OOP.TestInterface;

import java.util.ArrayList;

public class Database {
    ArrayList<User> usersDatabase = new ArrayList<>();

    public void addUser(User user) {
        usersDatabase.add(user);
        System.out.println("User registered.");
    }

    public void showAllUsers() {
        for(User user : usersDatabase) {
            System.out.println("Username: " + user.username);
            System.out.println("Password: " + user.password);
            System.out.println("------------------------------");
        }
    }

}

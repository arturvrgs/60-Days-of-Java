package OOP.TestInterface;

import javax.xml.crypto.Data;

public class User implements UserRequirements {

    String username;
    String password;

    public User(String username, String password, Database db) {

        userRegister(db);

        this.username = username;
        this.password = password;
    }

    @Override
    public void userRegister(Database db) {
        db.addUser(this);
    }
}

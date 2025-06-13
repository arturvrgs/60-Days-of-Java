package OOP.TestInterface;

public interface UserRequirements {
    default void userRegister(Database db){}
    default void userLogIn(String username, String password){}
}

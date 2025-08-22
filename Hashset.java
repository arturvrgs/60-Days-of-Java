import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("George");
        names.add("Thomas");
        names.add("Bill");
        names.add("Donald");
        names.add("Bill");

        for(String name : names) {
            System.out.println("Name: " + name);
        }
    }

}

import java.util.Scanner;

public class TextBasedAdventure {

    public enum Key {
        RIGHT, LEFT, UP, DOWN
    }

    public enum Action {
        JUMP, CRAWL, SWIM, WALK, RUN
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("You are in the center of the city, where do you wanna go?\n" +
                           "Type a key:");
        String type = scan.nextLine();

        Key key;

        switch (type.toUpperCase()) {
            case "W" -> key = Key.UP;
            case "A" -> key = Key.LEFT;
            case "S" -> key = Key.DOWN;
            case "D" -> key = Key.RIGHT;

            default -> System.out.println("Tecla inválida!");
        }



    }
}


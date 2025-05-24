package OOP.LuckyDiceAdventure;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static int targetScore = new Random().nextInt(1, 81);
    static Dice dice = new Dice();
    static Player player = new Player();

    static void startGame() {
        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        char choice = 'y';

        while (true) {

            if (player.getScore() >= targetScore) {
                System.out.println("Congratulations! You've won with " + tries + " tries!");
                break;
            }

            tries++;
            Random random = new Random();

            dice.setFirstRoll(random.nextInt(1, 7));
            dice.setSecondRoll(random.nextInt(1, 7));

            System.out.println("Target Score " + targetScore);
            System.out.println("Your score: " + player.getScore());

            System.out.println("Dice 1: " + dice.getFirstRoll());
            System.out.println("Dice 2: " + dice.getSecondRoll());

            int score = dice.getFirstRoll() == dice.getSecondRoll()
                                             ? (dice.getFirstRoll() + dice.getSecondRoll())*2
                                             : dice.getFirstRoll() + dice.getSecondRoll();
            player.setScore(score);

            System.out.println("You've earned " + (score) + " points!");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Do you want to continue? y or n");

            choice = scanner.next().charAt(0);

            if(choice != 'y') {
                System.out.println("Exiting game...");
                break;
            }
        }
    }
}

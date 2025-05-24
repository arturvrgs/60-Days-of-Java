package OOP.LuckyDiceAdventure;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Lucky Dice Adventure Game!");
        System.out.println("Roll the dice until your score reach the target!");
        System.out.println("Twins dices scores x2!");

        System.out.println("Do you want to start?: y or n ");
        char start = scan.next().charAt(0);

        if(start != 'y') {
            System.out.println("Exiting game..");
            return;
        }

        Game.startGame();

    }


}

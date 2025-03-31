// Importing the necessary Java package for standard input-output
import java.util.Scanner;

public class Exercise1 {
    public void displayText() {
        // Prompt the user to enter a message
        System.out.println("Enter your message:");
        // Use a Scanner to read the user's input
        //TODO
            Scanner scan = new Scanner(System.in);
            String message = scan.nextLine();
        // Print the message using println (with a newline)
        //TODO
            System.out.println("Using println:");
            System.out.print(message);
        // Print the message using print (without a newline)
        //TODO
            System.out.print("Using print:");
            System.out.print(message);
        // Print a new line with escape sequences
        //TODO
        System.out.println("Text with scape sequences:");
        System.out.println("Hello,\"Java Masterclass\"\nstudents!\nWelcome to Day 1\nLet's get started!");
    }
}


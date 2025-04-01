// Importing the necessary Java package for standard input-output
import java.util.Scanner;

public class Exercise2 {
    public void manipulateVariables() {
        // Declare and initialize variables of different types
        int wholeNumber = 10;
        double floatingPointNumber = 5.75;
        char singleCharacter = 'A';
        boolean isTrue = true;
        String text = "Java Programming";

        // Display the initialized variables
        System.out.println("Initial Variables:");
        //TODO

        System.out.println("Integer: " + wholeNumber);
        System.out.println("Double: " + floatingPointNumber);
        System.out.println("Char: " + singleCharacter);
        System.out.println("Boolean: " + isTrue);
        System.out.println("String: " + text);

        // Perform arithmetic operations
        System.out.println("\nPerforming Arithmetic Operations:");
        //TODO

        System.out.println("Sum of wholeNumber + 20: " + (wholeNumber+20));
        System.out.println("Division of floatingNumber by 2.0: " + (floatingPointNumber/2.0));

        // Demonstrate typecasting
        System.out.println("\nTypecasting Demonstration:");
        //TODO

        System.out.println("Casted floatingPointNumber to int:" + (int)floatingPointNumber);

        // Manipulate string variables
        System.out.println("\nString Manipulation:");
        //TODO

        System.out.println("Combined String: "+ text + " is fun!");

        // Demonstrate boolean logic
        System.out.println("\nBoolean Logic:");
        //TODO

        System.out.println("Negation of isTrue: " +(!isTrue));
    }
}

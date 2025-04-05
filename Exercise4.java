// Importing the necessary Java package for handling user input
import java.util.Scanner;

public class Exercise4 {
    public void stringManipulation() {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a full sentence
        System.out.println("Enter a full sentence:");
        String sentence = scanner.nextLine();

        // Print the length of the sentence
        //TODO
        System.out.println("Length of the sequence: " + sentence.length());
        // Print the first and last character of the sentence
        //TODO
        System.out.println("First and last character of the sequence: " + sentence.charAt(0) + "," + sentence.charAt(sentence.length() - 1));
        // Ask for another string to compare
        //TODO
        System.out.println("Enter other sentence: ");
        String sentence2 = scanner.nextLine();
        // Compare the two sentences using equals and equalsIgnoreCase
        //TODO
        System.out.println("Comparison using equals(): : " + (sentence.equals(sentence2)));
        System.out.println("Comparison using equalsIgnoreCase(): " + (sentence.equalsIgnoreCase(sentence2)));
        // Lexicographical comparison using compareTo
        //TODO
        System.out.println("Using lexicographical comparison: ");
        if(sentence.compareTo(sentence2) > 0) {
            System.out.println(sentence + " is lexicographically above " + sentence2);
        } else if(sentence.compareTo(sentence2) < 0) {
            System.out.println(sentence + " is lexicographically under " + sentence2);
        } else {
            System.out.println("Both sequences have the same lexicographically value");
        }
        // Demonstrate substring and replace methods
        //TODO
        System.out.println("Sentence1 changing 'o' to 'a': " + sentence.replace("a", "o"));
        System.out.println("Using substring to catch the first word: " + sentence.substring(0, sentence.indexOf(" ")));
        // Convert sentence to upper and lower case
        //TODO
        System.out.println("First sentence in Upper Case: " + sentence.toUpperCase());
        System.out.println("Second sentence in Lower Case: " + sentence.toLowerCase());
    }
}

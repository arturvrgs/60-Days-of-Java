// Importing the necessary Java package for handling user input
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the cost price and selling price
        System.out.println("Enter the cost price of the item:");
        double costPrice = scanner.nextDouble();

        System.out.println("Enter the selling price of the item:");
        double sellingPrice = scanner.nextDouble();

        // Calculate the profit or loss
        //TODO
        boolean isProfit = (costPrice < sellingPrice);

        if(isProfit)
            System.out.println("Profit: " + (sellingPrice - costPrice));
        else
            System.out.println("Loss: " + (sellingPrice - costPrice));
        // Display the result with relational operators
        //TODO
        System.out.println("Demonstrating Unary Operators: ");
        // Demonstrate unary operators
        //TODO
        int soldUnits = 10;
        System.out.println("Initial units sold: " + soldUnits);
        System.out.println("Units sold after increment: " + soldUnits++);
        System.out.println("Units sold after decrement: " + soldUnits--);
        // Demonstrate compound operators
        //TODO
        System.out.println("Demonstrating Compound Operators");
        double revenue = soldUnits*sellingPrice;
        System.out.printf("Total revenue after selling %d units: %.2f ", soldUnits, revenue);
        // Use the modulo operator
        //TODO
        System.out.println("Demonstrating Module Operator:\nRemainder when units sold is\ndivided bt 3: " + soldUnits%3);
    }
}

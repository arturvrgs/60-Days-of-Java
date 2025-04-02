import java.util.ArrayList;
import java.util.Scanner;

public class CalorieCounterPro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> foodItems = new ArrayList<>();
        ArrayList<Short> calorieValues = new ArrayList<>();

        int calorieCounter = 0;

        while(true) {

            System.out.println("Enter a food: ");
            String foodItem = scan.nextLine();

            System.out.println("Enter its calorie: ");
            short calorieValue = scan.nextShort();

            foodItems.add(foodItem);
            calorieValues.add(calorieValue);
            calorieCounter += calorieValue;

            System.out.println("Do you want to continue?");
            System.out.println("1 = Yes");
            System.out.println("2 = No");

            int choice = scan.nextInt();
            scan.nextLine();

            if(choice != 1) break;
        }
        scan.close();

        System.out.println("Your Calorie Intake: ");

        for(int i = 0; i < foodItems.size(); i++) {
            System.out.printf("%d: %s - %d calories\n", i+1, foodItems.get(i), calorieValues.get(i));
        }

        System.out.println("Your Calorie Total Intake: " + calorieCounter);

    }
}
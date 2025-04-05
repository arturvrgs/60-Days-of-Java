import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {

            System.out.println("Enter principal amount: ");
            double amount = scan.nextDouble();

            System.out.println("Enter annual interest rate (in percentage): ");
            double interest = scan.nextDouble();

            System.out.println("Enter time period (in years): ");
            double timePeriod = scan.nextDouble();

            if(amount <= 0 || interest <= 0 || timePeriod <= 0) {
                System.out.println("All values must be greater than zero."); break;
            }

            double simpleInterest = (amount*interest*timePeriod) / 100;

            System.out.printf("Simple Interest: $%.2f\n", simpleInterest);

            System.out.println("==================\n");
            System.out.println("Do you want to do again:?");
            System.out.println("1 = YES\n2 = NO");
            System.out.println("==================");
            int choice = scan.nextInt();
            scan.close();

            if(choice != 1) break;
        }
    }
}

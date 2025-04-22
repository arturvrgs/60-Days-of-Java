import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        int originalNumber = n;
        int sumOfDigits = 0;

        while(n > 0) {
            sumOfDigits += (n%10);
            n /= 10;
        }

        if (originalNumber % sumOfDigits == 0) {
            System.out.println("The number is a Harshad number");
        } else {
            System.out.println("The number is not a Harshad number");
        }
    }
}

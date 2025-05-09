import java.util.Scanner;

public class MachineGuessByBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Think a number between 1 and 100");
        System.out.println("Enter h to say that is higher, l to lower and c to correct!");

        int low = 1;
        int high = 1000;

        boolean correct = false;
        while (!correct) {

            int guess = low + (high - low)/2;
            System.out.println(guess + "?");

            char userEnter = scan.next().charAt(0);

            if(userEnter == 'h') {
                low = guess + 1;
            }

            if(userEnter == 'l') {
                high = guess - 1;
            }

            if(userEnter == 'c') {
                System.out.println("Thanks for playing!");
                correct = true;
            }
        }
    }
}

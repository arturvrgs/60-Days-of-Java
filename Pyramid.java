import java.util.Scanner;

public class Pyramid {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many layers will the pyramid have: ");
        int layers = scan.nextInt();

        for(int i = 1; i <= layers; i++) {
            for(int j = 0; j < layers - i; j++) {
                System.out.print(" ");
            }

            for(int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de casas Fibonacci: ");
        int n = scan.nextInt();

        int first = 0;
        int second = 1;

        if(n == 1) {
            System.out.print(first);
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                int sum = first + second;
                first = second;
                second = sum;

            }
        }

    }
}

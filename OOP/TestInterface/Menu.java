package OOP.TestInterface;

import java.util.Scanner;

public class Menu {
    public static void menu() {



        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("1 - REGISTER");
            System.out.println("2 - LOG IN");
            System.out.println("3 - SHOW DB");
            System.out.println("------------------");
            int escolha = scan.nextInt();

            if(escolha == 1) menuRegister();
            if(escolha == 2) menuLogIn();
            if(escolha == 3) ;
        }
    }


}

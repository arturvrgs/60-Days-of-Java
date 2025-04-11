import java.util.Scanner;

public class SimpleJavaChatbot {
    public void SimpleJavaChatbot() {

        Scanner scan = new Scanner(System.in);

        while(true) {

            System.out.println("==MENU==");
            System.out.println("1 - Start chat");
            System.out.println("2 - Exit chat");

            int choice = scan.nextInt();
            scan.nextLine();
            if(choice == 2) {
                break;
            }

            System.out.println("First, enter your name: ");
            String name = scan.nextLine();

            System.out.println("Say hi to the Chatbot!");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("Hi") || input.equalsIgnoreCase("Hello")) {
                System.out.println("Hello! How can i help you?");
                input = scan.nextLine();

                 if (input.equalsIgnoreCase("Weather") || input.equalsIgnoreCase("What’s the weather like")) {
                    System.out.println("I don’t have real-time weather data, but it's always sunny in the digital world!\"");
                    input = scan.nextLine();

                } else if (input.equalsIgnoreCase("Bye") || input.equalsIgnoreCase("Goodbye")) {
                    System.out.println("Goodbye! Have a great day!");


                } else {
                    System.out.println("Sorry, i didn't understand.");
                }
            }
        }


    }
}

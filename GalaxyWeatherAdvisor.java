import java.util.Scanner;

public class GalaxyWeatherAdvisor {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("WELCOME TO THE GALAXY WEATHER ADVISOR");
        System.out.println("======================================\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a planet name: ");
        String planet = scan.nextLine();

        System.out.println("Enter its current temperature (Celsius): ");
        int temperature = scan.nextInt();

        if(temperature >= 16 && temperature <= 26) {
            System.out.printf("%d is a perfect temperature! Let's go to %s", temperature, planet);
        }
        else if(temperature > 45) {
            System.out.printf("You can't survive much time in %s, %dC is a high temperature!", planet, temperature);
        } else if (temperature < 15) {
            System.out.printf("You should bring a coat with you, %s is a little cold!", planet);
        } else if (temperature < 0 && temperature > -20) {
            System.out.printf("Bring all your cloths! %d is a low temperature");
        } else {
            System.out.printf("You can't survive much time in %s, %dC is a low temperature!", planet, temperature);
        }
    }
}

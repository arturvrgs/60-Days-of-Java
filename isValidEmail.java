import java.util.Scanner;

public class isValidEmail {

    public static boolean isValidEmail(String email) {
        // Verifica se há espaço
        if (email.contains(" ")) {
            System.out.println("Invalid email: no blank spaces allowed.");
            return false;
        }

        // Verifica se há exatamente um '@'
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex != email.lastIndexOf('@')) {
            System.out.println("Invalid email: exactly one '@' is required.");
            return false;
        }

        // Verifica se tem pelo menos um caractere antes e depois do '@'
        if (atIndex == 0 || atIndex == email.length() - 1) {
            System.out.println("Invalid email: must have characters before and after '@'.");
            return false;
        }

        // Verifica se há pelo menos um '.' após o '@'
        String domainPart = email.substring(atIndex + 1);
        if (!domainPart.contains(".")) {
            System.out.println("Invalid email: must contain at least one '.' after '@'.");
            return false;
        }

        // Verifica se '.' é o primeiro ou último caractere após o '@'
        if (domainPart.startsWith(".") || domainPart.endsWith(".")) {
            System.out.println("Invalid email: '.' cannot be the first or last character after '@'.");
            return false;
        }

        // Se passou por todas as verificações
        System.out.println("Email is valid.");
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scan.nextLine();

        isValidEmail(email);
    }
}

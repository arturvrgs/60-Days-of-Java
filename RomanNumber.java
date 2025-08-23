import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Map<Character, Integer> dicionario = new HashMap<>();

        dicionario.put('I', 1);
        dicionario.put('V', 5);
        dicionario.put('X', 10);
        dicionario.put('L', 50);
        dicionario.put('C', 100);
        dicionario.put('D', 500);
        dicionario.put('M', 1000);

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o algarismo romano para ser convertido para número inteiro");
        String numeroRomano = scan.nextLine().toUpperCase();

        int numeroInteiro = 0;

        for (int i = 0; i < numeroRomano.length() ; i++) {

            int valorAtual = dicionario.get(numeroRomano.charAt(i));

            if(i + 1 < numeroRomano.length() && valorAtual < dicionario.get(numeroRomano.charAt(i + 1))) {
                numeroInteiro -= valorAtual;
                continue;
            }
                numeroInteiro += valorAtual;

        }

        System.out.println(numeroInteiro);
    }
}

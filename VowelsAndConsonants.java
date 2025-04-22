import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String phrase = scan.nextLine();

        checkLettersType(phrase);
    }

    public static void checkLettersType(String sentence) {
        //check each letter

        int vowelCounter = 0;
        int consonantCounter = 0;

        sentence = sentence.toLowerCase();
        sentence = sentence.replace(" ", "");

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for(int i = 0; i < sentence.length(); i++) {
            boolean isVowel = false;
            for(int j = 0; j < vowels.length; j++) {

                if(!Character.isLetter(sentence.charAt(i))) continue;

                if (sentence.charAt(i) == vowels[j]) {
                    vowelCounter++;
                    isVowel = true;
                    break;
                }
            }

            if(!isVowel) {
                consonantCounter++;
            }
        }

        System.out.println("Vowels: " + vowelCounter);
        System.out.println("Consonants: " + consonantCounter);
    }
}

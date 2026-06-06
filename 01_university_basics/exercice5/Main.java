package exercice5;

public class Main {


    public static void main(String[] args) {

        // 1. TEST formatName
        String fullName = "   Jean Dupont   ";
        System.out.println("formatName:");
        System.out.println(StringManipulation.formatName(fullName));

        System.out.println("--------------------------------");

        // 2. TEST reverseString
        String text = "Java";
        System.out.println("reverseString:");
        System.out.println(StringManipulation.reverseString(text));

        System.out.println("--------------------------------");

        // 3. TEST countWords
        String sentence = "Java is very powerful language";
        System.out.println("countWords:");
        System.out.println(StringManipulation.countWords(sentence));

        System.out.println("--------------------------------");

        // 4. TEST replaceVowels
        String word = "Hello Java";
        char symbol = '*';

        System.out.println("replaceVowels:");
        System.out.println(StringManipulation.replaceVowels(word, symbol));
    }
}
package exercises;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountingChar {

    public static void main(String[] args) {

        HashMap<Character, Integer> charCount = new HashMap<>();
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        String sentence = in.nextLine();

        char[] charactersInSentence = sentence.toCharArray();

        for (Character character : charactersInSentence) {

            charCount.put(character, 0);

        }

        for (Map.Entry<Character, Integer> counter : charCount.entrySet()) {

            Integer cnt = counter.getValue();
            for (Character sentenceChar : charactersInSentence) {

                if (sentenceChar.equals(counter.getKey())) {

                    cnt++;

                }

            }

            charCount.put(counter.getKey(), cnt);

        }

        System.out.println("\n              Character Count");
        System.out.println("              ---------------");

        Integer spacer = 0;
        for (Map.Entry<Character, Integer> print_statement : charCount.entrySet()) {

            if (!spacer.equals(5)) {
                System.out.print(print_statement.getKey() + ": " + print_statement.getValue() + "\t");
                spacer++;
            } else {
                spacer = 0;
                System.out.println(print_statement.getKey() + ": " + print_statement.getValue());
            }

        }

    }

}

package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {

        HashMap<Character, Integer> letter_cnt = new HashMap<>();
        letter_cnt.put('a', 0); letter_cnt.put('b', 0); letter_cnt.put('c', 0); letter_cnt.put('d', 0); letter_cnt.put('e', 0); letter_cnt.put('f', 0);
        letter_cnt.put('g', 0); letter_cnt.put('h', 0); letter_cnt.put('i', 0); letter_cnt.put('j', 0); letter_cnt.put('k', 0); letter_cnt.put('l', 0);
        letter_cnt.put('m', 0); letter_cnt.put('n', 0); letter_cnt.put('o', 0); letter_cnt.put('p', 0); letter_cnt.put('q', 0); letter_cnt.put('r', 0);
        letter_cnt.put('s', 0); letter_cnt.put('t', 0); letter_cnt.put('u', 0); letter_cnt.put('v', 0); letter_cnt.put('w', 0); letter_cnt.put('x', 0);
        letter_cnt.put('y', 0); letter_cnt.put('z', 0);
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        String sentence = in.nextLine();
        String sentence_lower = sentence.toLowerCase();

        char[] charactersInSentence = sentence_lower.toCharArray();

        for(Map.Entry<Character, Integer> counter : letter_cnt.entrySet()) {

            Integer cnt = counter.getValue();
            for(Character character : charactersInSentence) {
                //character.toLowerCase(Character character_lower);
                if(character.equals(counter.getKey())) {
                    cnt += 1;
                }
            letter_cnt.put(counter.getKey(), cnt);
            }

        }
        System.out.println("\n               Letter Count");
        System.out.println("               ------------");

        Integer spacer = 0;
        for(Map.Entry<Character, Integer> print_statement : letter_cnt.entrySet()) {

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

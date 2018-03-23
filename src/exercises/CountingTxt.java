package exercises;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;

public class CountingTxt {

    public static void main(String[] args) {

        HashMap<Character, Integer> charCount = new HashMap<>();
        File file = new File("dracula.txt");
        String sentence = "";
        int totCnt = 0;

        try {

            Scanner in = new Scanner(file);

            while(in.hasNextLine()) {

                sentence += in.nextLine();
            }

            in.close();

        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        char[] charactersInSentence = sentence.toCharArray();

        for (Character character : charactersInSentence) {

            charCount.put(character, 0);

        }

        for (Map.Entry<Character, Integer> counter : charCount.entrySet()) {

            Integer cnt = counter.getValue();
            for (Character sentenceChar : charactersInSentence) {

                if (sentenceChar.equals(counter.getKey())) {

                    cnt++;
                    totCnt++;

                }

            }

            charCount.put(counter.getKey(), cnt);

        }

        System.out.println("\n                          Character Count");
        System.out.println("                          ---------------");

        Integer spacer = 0;
        for (Map.Entry<Character, Integer> print_statement : charCount.entrySet()) {

            if (!spacer.equals(5)) {
                System.out.print(print_statement.getKey() + ": " + print_statement.getValue() + "\t");
                if(print_statement.getValue() < 10000) {
                    System.out.print("\t");
                }
                spacer++;
            } else {
                spacer = 0;
                System.out.println(print_statement.getKey() + ": " + print_statement.getValue());
            }

        }

        System.out.print("\nTotal Count: " + totCnt);

    }

}
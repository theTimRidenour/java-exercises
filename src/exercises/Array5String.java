package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Array5String {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        String word = " ";
        System.out.println("Type words (ENTER to end):");

        while(!word.equals("")) {
            word = in.nextLine();
            words.add(word);
        }

        System.out.println("Words that are 5 characters");
        for (String check : words) {
            if (check.length() == 5) {
                System.out.println(check);
            }
        }
    }
}

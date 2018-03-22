package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String alice_txt = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner in = new Scanner(System.in);

        System.out.println("Search the text of Alice's Adventures in Wonderland");
        System.out.println("---------------------------------------------------");

        System.out.println("What word are you looking for?");
        String word = in.next();

        if (alice_txt.toLowerCase().contains(word.toLowerCase())) {
            System.out.println("The word " + word + " is in Alice's Adventures in Wonderland. Hurray!");
        } else{
            System.out.println("I'm sorry, the word " + word + " is not in Alice's Adventures in Wonderland. Bummer");
        }
    }

}

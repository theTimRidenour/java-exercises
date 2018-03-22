package exercises;
import java.util.Scanner;

public class HelloGuest {
    public static void main(String[] args) {
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is your name? ");
        String message = in.next();

        System.out.println("Hello, " + message + "!");
    }
}

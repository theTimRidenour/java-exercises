package exercises;
import java.util.Scanner;

public class MpgCalc {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Miles per Gallon Calculator");
        System.out.println("---------------------------");

        System.out.println("How many miles have you driven?");
        float miles = in.nextFloat();

        System.out.println("How many gallon of gas have you used?");
        float gas = in.nextFloat();

        System.out.println("You are getting " + (miles / gas) + " miles to the gallon.");
    }

}

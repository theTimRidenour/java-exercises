package exercises;
import java.util.Scanner;

public class RecArea {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Area of a Rectangle");
        System.out.println("-------------------");

        System.out.println("Length: ");
        float length = in.nextFloat();

        System.out.println("Height: ");
        float height = in.nextFloat();

        System.out.println("The area of your rectangle is " + (length * height));
    }

}

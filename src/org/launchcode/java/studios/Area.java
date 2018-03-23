package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float rad;

        System.out.println("Area of a Circle");
        System.out.println("----------------");
        System.out.println("Enter a radius: ");

        rad = in.nextFloat();

        while(rad <= 0) {
            System.out.println("ERROR: Radius must be a positive number greater than 0.");
            System.out.println("Enter a radius: ");
            rad = in.nextFloat();
        }

        System.out.println("The area of a circle of radius " + rad + " is: " + 3.14 * rad * rad);

    }
}

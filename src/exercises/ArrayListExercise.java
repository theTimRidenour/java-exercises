package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Integer number = -1;
        Integer sum = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter a positive integer (-1 to stop): ");
            number = in.nextInt();

            if(number != -1) {
                if(number % 2 == 0) {
                    sum += number;
                }
                numbers.add(number);
            }
        } while (number != -1);

        System.out.println("The sum of all even numbers in the list " + numbers +" is: " + sum);
    }
}

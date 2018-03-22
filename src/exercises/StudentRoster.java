package exercises;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class StudentRoster {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        String student = " ";

        System.out.println("Add New Students (press ENTER when done)");
        while(!student.equals("")) {
            System.out.print("Name: ");
            student = in.nextLine();
            if(!student.equals("")) {
                System.out.print("Student Number: ");
                Integer stud_num = in.nextInt();
                students.put(stud_num, student);
                in.nextLine();
            }
        }

        System.out.println("\n\nStudent Roster");
        for (Map.Entry<Integer, String> newStudent : students.entrySet()) {
            System.out.println(newStudent.getKey() + " - " + newStudent.getValue());
        }
    }
}

package assignment7;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Students st = new Students();
        while (true){
            System.out.println("Welcome to Students Management Program");
            System.out.println("1. Add student");
            System.out.println("2. Edit student");
            System.out.println("3. Delete student");
            System.out.println("4. Sort student by gpa");
            System.out.println("5. Sort student by name");
            System.out.println("6. Show student");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Select from 0 -> 6: ");
            int x = scanner.nextInt();
            if (x == 1){
                st.addStudent();
            } else if (x == 2){
                st.editStudent();
            } else if (x == 3){
                st.deleteStudent();
            } else if (x == 4){
                st.sortStudentbyGpa();
            } else if (x == 5){
                st.sortStudentbyName();
            } else if (x == 6){
                st.showStudent();
            } else if (x == 0){
                System.out.println("Exit.");
                break;
            } else {
               System.out.println("Not valid. Please select again.");
            }
        }
    }
}

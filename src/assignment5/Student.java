package assignment5;

import java.util.Scanner;

public class Student extends Person {
    public int year;

    public void inputInfo(){
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Year of birthday: ");
        year = scanner.nextInt();
    }

    public void checkAge(){
        if ( year > 2001) {
            System.out.println("Chua du 18 tuoi");
        } else {
            System.out.println("Du 18 tuoi.");
        }

    }
}

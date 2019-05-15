package practical;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        EmployeeFullTime emFT = new EmployeeFullTime();
        EmplyeePartime emPT = new EmplyeePartime();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input base-salary of full-time employee: ");
        emFT.baseSalary = scanner.nextFloat();

        System.out.println("Input base-salary of part-time employee: ");
        emPT.baseSalary = scanner.nextFloat();

        emFT.getSalary();
        System.out.println("Salary of full-time employee: " + emFT.getSalary());

        emPT.getSalary();
        System.out.println("Salary of part-time employee: " + emPT.getSalary());

    }
}

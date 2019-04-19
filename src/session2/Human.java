package session2;

import java.util.Scanner;

public class Human {

    public String name;
    public int age;
    public String country;

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();

        System.out.println("Tuoi: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quoc gia: ");
        country = scanner.nextLine();

    }

    public void showInfo(){
        System.out.println("Ten: "+ name);
        System.out.println("Tuoi: "+ age);
        System.out.println("Quoc Gia: "+ country);
    }

    public void sayHello(){
        System.out.println("Hello World");
    }
}

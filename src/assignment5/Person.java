package assignment5;

import java.util.Scanner;

public class Person {
    public String name;
    public String gender;
    public String birthday;
    public String address;

    public Person() {
    }

    public Person(String name, String gender, String birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        name = scanner.nextLine();
        System.out.println("Gender:");
        gender = scanner.nextLine();
        System.out.println("Birthday:");
        birthday = scanner.nextLine();
        System.out.println("Address:");
        address = scanner.nextLine();
    }

    public void showInfo(){
        System.out.println("Name: " +name);
        System.out.println("Gender: " +gender);
        System.out.println("Birthday: " +birthday);
        System.out.println("Address: " +address);
    }


}

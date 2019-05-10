package assignment7;

import assignment5.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Students {
    public int id;
    public String name;
    public int age;
    public String address;
    public float gpa;

    public ArrayList<Students> StudentList = new ArrayList();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public Students() {

    }

    public Students(int id, String name, int age, String address, float gpa, ArrayList<Students> studentList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
        StudentList = studentList;
    }

    public void addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("GPA: ");
        int gpa = scanner.nextInt();

        Students st = new Students();
        st.setId(id);
        st.setName(name);
        st.setAge(age);
        st.setAddress(address);
        st.setGpa(gpa);
        StudentList.add(st);
    }

    public void editStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("I want to edit ID: ");
        int id = scanner.nextInt();
        for (Students st : StudentList) {
            if (st.getId() == id) {
                System.out.println("Edit name: ");
                String name = scanner.nextLine();
                System.out.println("Edit age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Edit address: ");
                String address = scanner.nextLine();
                System.out.println("Edit gpa: ");
                int gpa = scanner.nextInt();
                st.setName(name);
                st.setAge(age);
                st.setAddress(address);
                st.setGpa(gpa);
            }
        }
    }

    public void deleteStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("I want to delete ID: ");
        int id = scanner.nextInt();
        for (Students st : StudentList){
            if(st.getId() == id){
                StudentList.remove(st);
            }
        }
    }

    public void sortStudentbyGpa(){
        Collections.sort(StudentList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return Float.compare(o1.getGpa(), o2.getGpa());
            }
        });

    }

    public void sortStudentbyName(){
        Collections.sort(StudentList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void showStudent(){
        for(Students st : StudentList){
            System.out.println("ID: " +st.id);
            System.out.println("Name: " +st.name);
            System.out.println("Age: " +st.age);
            System.out.println("Address: " +st.address);
            System.out.println("GPA: " +st.gpa);
        }
    }

}

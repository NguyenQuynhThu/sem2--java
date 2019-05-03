package session5;

public class Human {
    public String name;
    public int age;

    public void eat(){
        System.out.println("eating...");
    }

    public Human(String name, int age){
        this.name = name + "Hello";
        this.age = age;
    }

}

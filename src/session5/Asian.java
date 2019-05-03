package session5;

public class Asian extends Human{
    public String language;

    public Asian(String name, int age, String language){
        super(name, age);
        this.language = language;
    }
    public void run() {
        System.out.println("Running 5km/h");
    }
    public void run(int x){
        System.out.println("Running" + x + "km/h");
    }
    public void run(String y){
        System.out.println("Running" + y);
    }
    public void run(int x, String y){
        System.out.println("...");
    }
    public void eat(){
        System.out.println("ăn cơm");
    }
}


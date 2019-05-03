package session5;

public class Vietnam extends Asian{
    public Vietnam(String name, int age, String language){
        super(name, age, language);
    }
    public void eat(){
        super.eat();
        System.out.println("ăn tối ....");
    }
}



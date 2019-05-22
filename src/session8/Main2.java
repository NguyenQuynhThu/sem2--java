package session8;

import java.util.ArrayList;

public class Main2 {
    public static void main(String args[]){
        //Chi ap dung cho interface co duy nhat mot phuong thuc
            DemoInterface demo = new DemoInterface() {
                @Override
                public void demo() {

                }
            };

            DemoInterface demo2 = ()->{
                System.out.println("demo...");
            };
            demo2.demo();

            //StreamAPI
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("abc");
        arr.add("bac");
        arr.add("aaacccb");

        arr.stream().filter(s -> s.startsWith("a"))
                .sorted()
                .map(s -> {
                    return s.toUpperCase();
                })
                .forEach(s -> {
                System.out.println(s);
            });

        for (String str : arr){
            System.out.println(str);
        }

        Human human = new Human();
        human.run();
        human.eat();

        human.run().eat();


    }
}

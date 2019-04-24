package session3;

import java.util.Scanner;

public class Triangle {
    public int a;
    public int b;
    public int c;

    public Triangle() {
    }

    //Constructor nạp 3 giá trị số nguyên vào 3 cạnh. Nếu không phải 3 cạnh tam giác nhập lại cho đúng
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static void main(String args[]) {
        Triangle t = new Triangle();
        t.input();
        t.validateTriangle();
        t.perimeter();
        t.square();
    }


    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a triangle: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }


    //Phương thức kiểm tra 3 giá trị có phải 3 cạnh 1 tam giác hay không.
    public boolean validateTriangle() {
        if ((a+b>c) && (a+c>b) && (b+c>a) && a>0 && b>0 && c>0){
            return true;
        } else {
            System.out.println("This is not a triangle.");
            input();
        }
        return true;
    }

    //Phương thức tính chu vi
    public double perimeter(){
        double p = a + b +c;
        System.out.println("This triangle's perimeter is: "+p);
        return p;
    }
    //Phương thức tính diện tích
    public double square(){
        float p2 = (float)(a+b+c)/2;
        float s;
        s = (float)Math.sqrt(p2*(p2-a)*(p2-b)*(p2-c));
        System.out.println("This triangel's square is: " +s);
        return s;
    }
}

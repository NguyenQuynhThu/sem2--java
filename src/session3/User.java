package session3;

import java.util.Scanner;

public class TamGiac {
    public int a;
    public int b;
    public int c;


    public TamGiac(){
    }

    public TamGiac(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void nhap3Canh() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        a = scanner.nextInt();
        System.out.print("Nhap canh b: ");
        b = scanner.nextInt();
        System.out.print("Nhap canh c: ");
        c = scanner.nextInt();

    }





    public boolean kiemTraBaCanh(){
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            System.out.println("Đây là tam giác !");
            return true;
        }
    }

    public static void main(String args[]){
        TamGiac tg = new TamGiac();

    }
}



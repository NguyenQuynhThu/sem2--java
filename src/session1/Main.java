package session1;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

import session2.HinhChuNhat;
import session2.Human;

public class Main {
//    int x=10;
//    static int y = 20;
//    static final int z = 40;


    public static void main(String[] args){
//        Human human = new Human();
//        human.name = "abc";
//        human.inputInfo();
//        human.showInfo();
//
//        Human h2 = new Human();
//        h2.age = 20;
//        h2.sayHello();

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapCanh();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
    }


    public static void main2(String[] args){

//Viet chuong trinh yeu cau nhap vao 1 so, bao gio duoc so chan thi dung lai

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a%2 > 0){
            System.out.println("Nhap lai so khac");
            a = scanner.nextInt();
        }
        System.out.println("So vua nhap la: "+a);


//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println("So vua nha la: " + n);
//        double n2 = scanner.nextDouble();//nhap vao 1 so thuc
//        String str = scanner.nextLine();//nhap vao 1 chuoi
//
//        for (int i=0; i<10; i++){
//            System.out.println("i="+i);
//        }
//        Main m = new Main();
//        System.out.println(m.x);
//        m.x = m.x +10;
//        System.out.println(m.x);
//
//        System.out.println("y=" + Main.y);
//        Main.y +=10;
//        System.out.println("y=" + Main.y);
//
//        System.out.println("z=" + Main.z);
//        //Main.z++;
//
//        Main.y = m.x%2==0 ? m.x : 20;
//
//        if(m.x %2==0){
//            Main.y = m.x;
//        } else {
//            Main.y = 20;
//        }


    }
}

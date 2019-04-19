package session2;

import java.util.Scanner;

public class HinhChuNhat {

    public double a;
    public double b;

    public void nhapCanh(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh thu nhat: ");
        a = scanner.nextDouble();

        System.out.print("Nhap canh thu hai: ");
        b = scanner.nextDouble();
    }

    public double tinhChuVi(){
        double p = (a + b)*2;
        System.out.println("Chu vi hinh chu nhat la: " + p);
        return p;
    }

    public double tinhDienTich(){
        double s = a * b;
        System.out.println("Dien tich hinh chu nhat la: " + s);
        return s;
    }


}

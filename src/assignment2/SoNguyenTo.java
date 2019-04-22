package assignment2;

import session2.Human;

import java.util.Scanner;

public class SoNguyenTo {

    public int a;

    public int get_a() {
        return a;
    }

    public void set_a(int a) {
        if (isSoNguyenTo(a)){
            this.a = a;
            System.out.println(+a+ " la so nguyen to.");
        } else {
            System.out.println("Vi "+a+" khong la so nguyen to nen khong the set.");
            nhapSo();
        }
    }

    public void nhapSo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        set_a(scanner.nextInt());
    }


    public boolean isSoNguyenTo(int x){
        if (x < 2) {
            return false;
        }
        int CanBacHai = (int) Math.sqrt(x);
        for (int i = 2; i <= CanBacHai; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void timSoNguyenToLienKe(){
        for (int i=a+1; ; i++){
            if(isSoNguyenTo(i)){
                System.out.println(i+" la so nguyen to lien ke cua "+a);
                break;
            }
        }
    }
}

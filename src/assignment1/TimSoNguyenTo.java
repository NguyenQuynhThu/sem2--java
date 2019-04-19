package assignment1;

import java.util.Scanner;

public class TimSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Các số nguyên tố nhỏ hơn " +n+ " là: ");
        for (int i = 0; i < n; i++) {
            if (laSoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean laSoNguyenTo(int x){
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


}

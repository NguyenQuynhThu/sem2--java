package assignment1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\nTổng của "+n+" số đầu tiên trong dãy số Fibonacci là: " + tingTong(n));
   }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1 || n == 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


    public static int tingTong(int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong = tong + fibonacci(i);
        }

        return tong;
    }


}

package assignment3;

import java.security.PublicKey;
import java.util.Scanner;

public class Fraction {
    //* Các thuộc tính: Tử số, mẫu số.
    private int numerator;
    private int denominator;

    //* Hàm tạo không đối số và hai đối số để khởi tạo giá trị cho tử số và mẫu số.
    public Fraction(){
    }

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    //* Các phương thức setter và getter.

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //*Phương thức Nhập phân số
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numerator and denominator: ");
        numerator = scanner.nextInt();
        denominator = scanner.nextInt();
    }
    //*Phương thức in phân số
    public void display(){
        if (denominator ==0){
            System.out.println("Denominator can't be 0.");
            input();
        }
        System.out.println("Fraction: "+numerator+"/"+denominator);
    }
    //*Phương thức rút gọn phân số
    //Để rút gọn phân số cần tìm ước chung lớn nhất của tử số và mẫu số.
    public int findGCD(int a, int b){
        while (a !=b){
            if (a > b){
                a = a - b;
            } else {
                b = b-a;
            }
        }
        return a;
    }

    public void reduce(){
        int i = findGCD(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / i);
        this.setDenominator(this.getDenominator() / i);
    }

    //*Phương thức nghịch đảo phân số
    public void inverse(){
        if ( numerator != 0) {
            int temp = numerator;
            numerator = denominator;
            denominator = temp;
        } else {
            System.out.println("Can not inverse beacause numerator is 0.");
        }
    }

    //*Phương thức cộng, trừ, nhân, chia 2 phân số
    public void add(Fraction f2){
        int n = this.getNumerator() * f2.getDenominator() + f2.getNumerator() * this.getDenominator();
        int d = this.getDenominator() * f2.getDenominator();
        Fraction F = new Fraction(n, d);
        F.reduce();
        System.out.println("f1 + f2 = " + F.numerator + "/" + F.denominator);
    }

    public void sub(Fraction f2){
        int n = this.getNumerator() * f2.getDenominator() - f2.getNumerator() * this.getDenominator();
        int d = this.getDenominator() * f2.getDenominator();
        Fraction F = new Fraction(n, d);
        F.reduce();
        System.out.println("f1 - f2 = " + F.numerator + "/" + F.denominator);
    }

    public void mul(Fraction f2){
        int n = this.getNumerator() * f2.getNumerator();
        int d = this.getDenominator() * f2.getDenominator();
        Fraction F = new Fraction(n, d);
        F.reduce();
        System.out.println("f1 x f2 = " + F.numerator + "/" + F.denominator);
    }

    public void div(Fraction f2){
        int n = this.getNumerator() * f2.getDenominator();
        int d = this.getDenominator() * f2.getNumerator();
        Fraction F = new Fraction(n, d);
        F.reduce();
        System.out.println("f1 : f2 = " + F.numerator + "/" + F.denominator);
    }

}

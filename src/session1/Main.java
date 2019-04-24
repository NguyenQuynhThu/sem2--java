package session1;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

import assignment2.SoNguyenTo;
import session3.Triangle;
import assignment3.Fraction;

public class Main {

    public static void main(String args[]){
        Fraction f = new Fraction();
        f.input();
        f.display();
        f.reduce();
        f.inverse();

        Fraction f1 = new Fraction(7,11);
        Fraction f2 = new Fraction(3,5);
        System.out.println("f1 = 7/11");
        System.out.println("f2 = 3/5");

        f1.add(f2);
        f1.sub(f2);
        f1.mul(f2);
        f1.div(f2);
    }

}

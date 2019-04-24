package session1;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

import assignment2.SoNguyenTo;
import session3.Triangle;

public class Main {

    public static void main(String args[]) {
        Triangle t = new Triangle();
        t.input();
        t.validateTriangle();
        t.perimeter();
        t.square();
    }
}

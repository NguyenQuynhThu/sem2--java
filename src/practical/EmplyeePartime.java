package practical;

import java.util.Scanner;

public class EmplyeePartime extends SalaryPolicy {

    public float rate = (float)2.5;

    @Override
    public float getSalary() {
        float salary;
        return salary = rate * baseSalary;
    }
}

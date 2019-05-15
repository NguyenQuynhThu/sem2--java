package practical;

import java.util.Scanner;

public class EmployeeFullTime extends SalaryPolicy {

    public float rate = 4;

    @Override
    public float getSalary() {
        float salary = rate * baseSalary;
        return salary;
    }
}

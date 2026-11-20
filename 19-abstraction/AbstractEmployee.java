import java.util.Scanner;

abstract class Employee {
    private final String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateMonthlyPay();

    void displayPay() {
        System.out.printf("%s's monthly pay: %.2f%n", name, calculateMonthlyPay());
    }
}

class SalariedEmployee extends Employee {
    private final double monthlySalary;

    SalariedEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateMonthlyPay() {
        return monthlySalary;
    }
}

public class AbstractEmployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        if (!input.hasNextLine()) {
            System.out.println("Please enter a name and a finite, non-negative salary.");
            return;
        }
        String name = input.nextLine().trim();

        System.out.print("Enter monthly salary: ");
        if (name.isEmpty() || !input.hasNextDouble()) {
            System.out.println("Please enter a name and a finite, non-negative salary.");
            return;
        }
        double salary = input.nextDouble();
        if (input.hasNext() || !Double.isFinite(salary) || salary < 0) {
            System.out.println("Please enter a name and a finite, non-negative salary.");
            return;
        }

        Employee employee = new SalariedEmployee(name, salary);
        employee.displayPay();
    }
}

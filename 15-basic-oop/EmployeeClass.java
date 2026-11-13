import java.util.Locale;
import java.util.Scanner;

public class EmployeeClass {
    private static class Employee {
        String name;
        int id;
        double monthlySalary;

        double annualSalary() {
            return monthlySalary * 12;
        }

        void displayDetails() {
            System.out.println("Employee details:");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.printf(Locale.US, "Monthly salary: %.2f%n", monthlySalary);
            System.out.printf(Locale.US, "Annual salary: %.2f%n", annualSalary());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Enter employee name: ");
        if (!input.hasNextLine()) {
            System.out.println("Employee name cannot be empty.");
            return;
        }
        employee.name = input.nextLine().trim();
        if (employee.name.isEmpty()) {
            System.out.println("Employee name cannot be empty.");
            return;
        }

        System.out.print("Enter positive employee ID: ");
        if (!input.hasNextLine()) {
            System.out.println("ID must be a positive whole number.");
            return;
        }
        try {
            employee.id = Integer.parseInt(input.nextLine().trim());
        } catch (NumberFormatException exception) {
            System.out.println("ID must be a positive whole number.");
            return;
        }
        if (employee.id < 1) {
            System.out.println("ID must be a positive whole number.");
            return;
        }

        System.out.print("Enter non-negative monthly salary: ");
        if (!input.hasNextLine()) {
            System.out.println("Salary must be a finite non-negative number.");
            return;
        }
        try {
            employee.monthlySalary = Double.parseDouble(input.nextLine().trim());
        } catch (NumberFormatException exception) {
            System.out.println("Salary must be a finite non-negative number.");
            return;
        }
        if (!Double.isFinite(employee.monthlySalary) || employee.monthlySalary < 0
                || !Double.isFinite(employee.annualSalary())) {
            System.out.println("Salary must be a finite non-negative number.");
            return;
        }

        employee.displayDetails();
    }
}

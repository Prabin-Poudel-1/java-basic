import java.util.Locale;
import java.util.Scanner;

public class EmployeeInformation {
    private static class Employee {
        String name;
        int employeeId;
        double monthlySalary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        Employee employee = new Employee();

        System.out.print("Enter employee name: ");
        if (!input.hasNextLine()) {
            System.out.println("A name is required.");
            return;
        }
        employee.name = input.nextLine().trim();
        if (employee.name.isEmpty()) {
            System.out.println("A name is required.");
            return;
        }

        System.out.print("Enter employee ID: ");
        if (!input.hasNextInt()) {
            System.out.println("ID must be positive and salary must be non-negative.");
            return;
        }
        employee.employeeId = input.nextInt();
        if (!input.hasNextDouble()) {
            System.out.println("ID must be positive and salary must be non-negative.");
            return;
        }
        employee.monthlySalary = input.nextDouble();
        if (input.hasNext() || employee.employeeId < 1
                || !Double.isFinite(employee.monthlySalary) || employee.monthlySalary < 0) {
            System.out.println("ID must be positive and salary must be non-negative.");
            return;
        }

        System.out.println("Employee information:");
        System.out.println("Name: " + employee.name);
        System.out.println("Employee ID: " + employee.employeeId);
        System.out.printf(Locale.US, "Monthly salary: %.2f%n", employee.monthlySalary);
    }
}

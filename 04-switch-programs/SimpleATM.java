import java.util.NoSuchElementException;
import java.util.Scanner;

/** In-memory ATM practice with whole currency units and a switch menu. */
public class SimpleATM {
    public static void main(String[] args) {
        long balance = 1000;
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("1. Balance\n2. Deposit\n3. Withdraw\n0. Exit");
                System.out.print("Choice: ");
                int choice = Integer.parseInt(input.nextLine().trim());
                switch (choice) {
                    case 0:
                        System.out.println("Goodbye.");
                        return;
                    case 1:
                        System.out.println("Balance: " + balance);
                        break;
                    case 2: {
                        System.out.print("Deposit amount (whole units): ");
                        long amount = Long.parseLong(input.nextLine().trim());
                        if (amount <= 0) {
                            System.out.println("Amount must be positive.");
                        } else if (amount > Long.MAX_VALUE - balance) {
                            System.out.println("Deposit would exceed the balance limit.");
                        } else {
                            balance += amount;
                            System.out.println("Balance: " + balance);
                        }
                        break;
                    }
                    case 3: {
                        System.out.print("Withdrawal amount (whole units): ");
                        long amount = Long.parseLong(input.nextLine().trim());
                        if (amount <= 0) {
                            System.out.println("Amount must be positive.");
                        } else if (amount > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance -= amount;
                            System.out.println("Balance: " + balance);
                        }
                        break;
                    }
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input.");
        }
    }
}

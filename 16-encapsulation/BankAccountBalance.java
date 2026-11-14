import java.util.Locale;
import java.util.Scanner;

public class BankAccountBalance {
    private static class BankAccount {
        private double balance;

        BankAccount(double initialBalance) {
            balance = initialBalance;
        }

        double getBalance() {
            return balance;
        }

        boolean deposit(double amount) {
            if (!Double.isFinite(amount) || amount < 0 || !Double.isFinite(balance + amount)) {
                return false;
            }
            balance += amount;
            return true;
        }

        boolean withdraw(double amount) {
            if (!Double.isFinite(amount) || amount < 0 || amount > balance) {
                return false;
            }
            balance -= amount;
            return true;
        }
    }

    private static Double readAmount(Scanner input) {
        if (!input.hasNextDouble()) {
            return null;
        }
        double amount = input.nextDouble();
        return Double.isFinite(amount) && amount >= 0 ? amount : null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        Double initial = readAmount(input);
        if (initial == null) {
            System.out.println("Amounts must be finite and non-negative.");
            return;
        }
        BankAccount account = new BankAccount(initial);

        System.out.print("Enter deposit amount: ");
        Double deposit = readAmount(input);
        if (deposit == null || !account.deposit(deposit)) {
            System.out.println("Deposit amount is invalid.");
            return;
        }
        System.out.print("Enter withdrawal amount: ");
        Double withdrawal = readAmount(input);
        if (withdrawal == null) {
            System.out.println("Amounts must be finite and non-negative.");
            return;
        }
        if (!account.withdraw(withdrawal)) {
            System.out.println("Withdrawal declined: insufficient balance.");
        } else {
            System.out.println("Withdrawal successful.");
        }
        System.out.printf(Locale.US, "Balance: %.2f%n", account.getBalance());
    }
}

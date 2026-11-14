import java.util.Locale;
import java.util.Scanner;

public class BankAccountClass {
    private static class BankAccount {
        String holder;
        String accountNumber;
        double balance;

        void deposit(double amount) {
            balance += amount;
        }

        boolean withdraw(double amount) {
            if (amount > balance) {
                return false;
            }
            balance -= amount;
            return true;
        }

        void displayBalance() {
            System.out.printf(Locale.US, "Current balance: %.2f%n", balance);
        }
    }

    private static Double readMoney(Scanner input) {
        if (!input.hasNextLine()) {
            return null;
        }
        try {
            double value = Double.parseDouble(input.nextLine().trim());
            return Double.isFinite(value) && value >= 0 ? value : null;
        } catch (NumberFormatException exception) {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount();
        System.out.print("Enter account holder: ");
        if (!input.hasNextLine() || (account.holder = input.nextLine().trim()).isEmpty()) {
            System.out.println("Account holder cannot be empty.");
            return;
        }
        System.out.print("Enter account number: ");
        if (!input.hasNextLine() || (account.accountNumber = input.nextLine().trim()).isEmpty()) {
            System.out.println("Account number cannot be empty.");
            return;
        }
        System.out.print("Enter initial balance: ");
        Double initial = readMoney(input);
        if (initial == null) {
            System.out.println("Balance and transaction amounts must be finite non-negative numbers.");
            return;
        }
        account.balance = initial;

        System.out.print("Enter deposit amount: ");
        Double deposit = readMoney(input);
        if (deposit == null || !Double.isFinite(account.balance + deposit)) {
            System.out.println("Balance and transaction amounts must be finite non-negative numbers.");
            return;
        }
        account.deposit(deposit);

        System.out.print("Enter withdrawal amount: ");
        Double withdrawal = readMoney(input);
        if (withdrawal == null) {
            System.out.println("Balance and transaction amounts must be finite non-negative numbers.");
            return;
        }

        System.out.println("Account holder: " + account.holder);
        System.out.println("Account number: " + account.accountNumber);
        account.displayBalance();
        if (!account.withdraw(withdrawal)) {
            System.out.println("Withdrawal declined: insufficient balance.");
        } else {
            System.out.println("Withdrawal successful.");
        }
        account.displayBalance();
    }
}

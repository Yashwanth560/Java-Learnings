import java.util.Scanner;

public class BankTransactionHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;
        String transactionHistory = "";

        do {
            System.out.println("\nBank Menu:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Balance");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    transactionHistory += "Deposited: $" + deposit + "\n";
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdraw;
                        transactionHistory += "Withdrew: $" + withdraw + "\n";
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: $" + balance);
                    System.out.println("Transaction History:\n" + transactionHistory);
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (true);
    }
}

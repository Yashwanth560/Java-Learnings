class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double minimumBalance;

    public SavingsAccount(String accountHolderName, String accountNumber, double balance, double minimumBalance) {
        super(accountHolderName, accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance requirement not met.");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountHolderName, String accountNumber, double balance) {
        super(accountHolderName, accountNumber, balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Alice", "SA123", 1000, 500);
        CurrentAccount current = new CurrentAccount("Bob", "CA456", 2000);

        savings.checkBalance();
        savings.withdraw(600);
        savings.deposit(200);
        savings.checkBalance();

        current.checkBalance();
        current.withdraw(1000);
        current.checkBalance();
    }
}

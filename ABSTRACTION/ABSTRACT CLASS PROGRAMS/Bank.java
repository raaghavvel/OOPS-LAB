abstract class BankAccount {
    protected double balance;
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    
  
    public abstract void withdraw(double amount);
    public abstract double calculateInterest();
    
   
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.05;
    
   
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
   
    public double calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        return interest;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount();
        account.deposit(1000);
        account.withdraw(200);
        System.out.println("Interest earned: " + account.calculateInterest());
        account.displayBalance();
    }
}
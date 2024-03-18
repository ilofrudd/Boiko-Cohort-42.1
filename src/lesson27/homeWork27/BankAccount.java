package lesson27.homeWork27;

public class BankAccount implements PaymentSystem {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void transferMoney(double amount, String recipient) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid transfer amount or insufficient funds.");
            return;
        }
        balance -= amount;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
            return;
        }
        balance -= amount;
    }

    @Override
    public double checkBalance() {
        System.out.println("Current balance in account: EUR" + balance);
        return balance;
    }
}

package lesson27.homeWork;

public class ElectronicWallet implements PaymentSystem{
    private double balance;

    public ElectronicWallet(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void transferMoney(double amount, String recipient) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid transfer amount or insufficient funds.");
            return;
        }
        balance -= amount;
        System.out.println("Transferred EUR" + amount + " to " + recipient);
    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("Electronic wallets cannot withdraw money. Please transfer to a bank account.");
    }

    @Override
    public double checkBalance() {
        System.out.println("Current balance in electronic wallet: EUR" + balance);
        return balance;
    }
}

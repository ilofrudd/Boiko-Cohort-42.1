package lesson27.homeWork27;

public interface PaymentSystem {
    void transferMoney(double amount, String recipient);
    void withdrawMoney(double amount);
    double checkBalance();
}
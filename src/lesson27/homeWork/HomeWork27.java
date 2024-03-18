package lesson27.homeWork;
/**
 * AIT-TR, cohort 42.1, Java Basic, HW #27
 * @author Boiko Yaroslav
 * @version 18.03.24
 */
public class HomeWork27 {
    public static void main(String[] args) {
        System.out.println("___Task 1___");

        //Task1
        BankAccount bankAccount = new BankAccount(1000);
        ElectronicWallet electronicWallet = new ElectronicWallet(500);

        bankAccount.transferMoney(313, "Recipient's Bank Account");
        bankAccount.checkBalance();

        electronicWallet.transferMoney(125, "Recipient's Electronic Wallet");
        electronicWallet.checkBalance();

        System.out.println("___Task 2___");

        //Task2
        Triathlete triathlete = new Triathlete();

        triathlete.run();
        triathlete.swim();

    }
}
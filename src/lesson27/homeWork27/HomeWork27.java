package lesson27.homeWork27;
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

        bankAccount.checkBalance();
        bankAccount.transferMoney(313);
        bankAccount.checkBalance();
        bankAccount.withdrawMoney(105);
        bankAccount.checkBalance();

        electronicWallet.checkBalance();
        electronicWallet.transferMoney(125);
        electronicWallet.checkBalance();
        electronicWallet.withdrawMoney(215);
        electronicWallet.checkBalance();

        System.out.println("___Task 2___");

        //Task2
        Triathlete triathlete = new Triathlete();

        triathlete.run();
        triathlete.swim();

    }
}
public class BankAccountTest {

    public static void main(String[] args) {

        System.out.println("===== TEST CASE 1: NORMAL WITHDRAWAL =====");

        CheckingAccount account1 = new CheckingAccount();

        account1.setFirstName("Noki");
        account1.setLastName("Shohid");
        account1.setAccountID(1001);
        account1.setInterestRate(2.50);

        account1.deposit(1000.00);
        account1.processWithdrawal(250.00);
        account1.displayAccount();

        System.out.println();
        System.out.println("===== TEST CASE 2: OVERDRAFT =====");

        CheckingAccount account2 = new CheckingAccount();

        account2.setFirstName("Test");
        account2.setLastName("Customer");
        account2.setAccountID(1002);
        account2.setInterestRate(1.75);

        account2.deposit(100.00);
        account2.processWithdrawal(150.00);
        account2.displayAccount();

        System.out.println();
        System.out.println("===== TEST CASE 3: DEPOSIT AND WITHDRAWAL =====");

        CheckingAccount account3 = new CheckingAccount();

        account3.setFirstName("Sample");
        account3.setLastName("User");
        account3.setAccountID(1003);
        account3.setInterestRate(3.00);

        account3.deposit(300.00);
        account3.withdrawal(50.00);
        account3.displayAccount();
    }
}
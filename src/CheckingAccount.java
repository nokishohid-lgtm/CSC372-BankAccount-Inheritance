public class CheckingAccount extends BankAccount {

    private double interestRate;

    public CheckingAccount() {
        super();
        interestRate = 0.0;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void processWithdrawal(double amount) {
        if (amount > getBalance()) {
            withdrawal(amount + 30.00);
            System.out.println("Overdraft fee of $30.00 assessed.");
        } else {
            withdrawal(amount);
            System.out.println("Withdrawal completed without an overdraft fee.");
        }

        System.out.printf("Balance after withdrawal: $%.2f%n", getBalance());
    }

    public void displayAccount() {
        accountSummary();
        System.out.printf("Interest Rate: %.2f%%%n", interestRate);
    }
}
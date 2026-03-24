package entities;

public class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double balanceAccount;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        depositValue(initialDeposit);
    }

    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;

    }

    public void depositValue(double amount) {
        this.balanceAccount += amount;
    }

    public void withdrawValue(double amount) {
        this.balanceAccount -= (amount + 5.00);
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", "
                + "Holder: "
                + accountHolder
                + ", Balance: $ "
                + String.format("%.2f", balanceAccount);
    }


}

public class BankAccount {
    // Fields : properties
    private double balance;
    private String accountName;

    // Constructor
    public BankAccount(String name, double initialBalance) {
        this.accountName = name;
        this.balance = initialBalance;
        System.out.println(accountName+"'s initialBalance is "+balance);
    }
    // Getters and Setters
    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // method
    public void deposit(double amount) { // Parameter: Variable in method declaration (double amount)
        if(amount > 0){
            this.balance += amount;
            System.out.println(accountName+ " Deposited $"+amount+ " ...");
        }

    }
}

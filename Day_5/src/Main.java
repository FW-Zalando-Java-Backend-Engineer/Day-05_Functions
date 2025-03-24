//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //  Brackets names :
        // () : parenthesis
        // [] : brackets
        // {} : braces

        BankAccount account1 = new BankAccount("Safwan", 1000.00);
        BankAccount account2 = new BankAccount("Ornella", 10000.00);

        double myBalance =  account1.getBalance();
        System.out.println("my balance is " + myBalance); // my balance is 1000.0
        // System.out.println(account1.setBalance(100.00)); // Cannot resolve method 'println(void)'

        double inputBalance = 100.00;
        account1.deposit(inputBalance); // Argument: Value passed when calling deposit(100.00)


        System.out.println("Hello World");

    }
}
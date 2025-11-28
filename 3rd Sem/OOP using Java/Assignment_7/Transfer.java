/*
6.	Write a class called Account with the following properties and methods:
Properties: String name, int acc_no, double balance
Methods:  void deposit (double amt)
void withdraw (double amt), 
void transfer (Account acc1, Account acc2, double amt)
Assume that an account needs to have a minimum balance of 500. If an attempt is made to withdraw or transfer, 
which results in balance going below 500, throw a user defined exception called MinimumBalanceException. 
Use throw and throws wherever necessary.
*/

//Code:
class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String msg) {
        super(msg);
    }
}
class Account {
    String name;
    int acc_no;
    double balance;
    public Account(String name, int acc_no, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }
    void deposit(double amt) {
        balance += amt;
        System.out.println(name + " deposited " + amt + ", Balance: " + balance);
    }
    void withdraw(double amt) throws MinimumBalanceException {
        if (balance - amt < 500)
            throw new MinimumBalanceException("Withdrawal Failed! Balance can’t be less than 500.");
        balance -= amt;
        System.out.println(name + " withdrew " + amt + ", Balance: " + balance);
    }
    void transfer(Account Acc1, Account Acc2, double amt) throws MinimumBalanceException {
        if (Acc1.balance - amt < 500)
            throw new MinimumBalanceException("Transfer Failed! Minimum Balance should be 500.");
        Acc1.balance -= amt;
        Acc2.balance += amt;
        System.out.println("Transferred " + amt + " from " + Acc1.name + " to " + Acc2.name);
    }
}
public class Transfer {
    public static void main(String[] args) {
        Account a1 = new Account("Ronit", 1001, 2000);
        Account a2 = new Account("Kumar", 2002, 1500);
        try {
            a1.transfer(a1, a2, 600);
            a1.transfer(a1, a2, 1000);
        } catch (MinimumBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

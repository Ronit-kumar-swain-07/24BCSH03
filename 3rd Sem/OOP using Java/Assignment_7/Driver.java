/*
5.	Write a class called Account with the following properties and methods:
Properties: String name, int acc_no, double balance
Methods:  void deposit (double amt), void withdraw (double amt) 
Assume that an account needs to have a minimum balance of 500. If an attempt is made to withdraw, 
which results in balance going below 500, throw a user defined exception called MinimumBalanceException. 
Use throw and throws wherever necessary.
*/

//Code:
class MinimumBalanceException extends Exception {
    MinimumBalanceException(String msg) {
        super(msg);
    }
}

class Account {
    String name;
    int accno;
    double balance;

    Account(String name, int accno, int balance) {
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposit: " + amt);
        System.out.println("The Current Balance : " + balance);
    }

    void withdraw(double amt) throws MinimumBalanceException {
        if (balance - amt < 500) {
            throw new MinimumBalanceException("Exception: The Minimum Required Balance is : Rs. 500");
        }
        balance -= amt;
        System.out.println("You have Withdrwal : Rs. " + amt);
        System.out.println("Your Current Balance is : Rs. " + balance);
    }
}

class Driver {
    public static void main(String args[]) {
        Account acc = new Account("Ronit", 2024321, 50000);
        acc.deposit(5000);
        try {
            acc.withdraw(100000);
            acc.withdraw(30000);
        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
import java.util.Scanner;

class BaseAccount {
    String customerName;
    int accountNo;

    BaseAccount(String name, int number) {
        this.customerName = name;
        this.accountNo = number;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNo);
    }
}

class SavingsAccount extends BaseAccount {
    double min_bal;
    double saving_bal;

    SavingsAccount(String name, int number, double min_bal, double saving_bal) {
        super(name, number);
        this.min_bal = min_bal;
        this.saving_bal = saving_bal;
    }

    void show() {
        super.display();
        System.out.println("Minimum Balance: " + min_bal);
        System.out.println("Saving Balance: " + saving_bal);
    }
}

class Account_Details extends SavingsAccount {
    double deposit;
    double withdrawl;

    Account_Details(String name, int number, double min_bal, double saving_bal,
                    double deposit, double withdrawl) {
        super(name, number, min_bal, saving_bal);
        this.deposit = deposit;
        this.withdrawl = withdrawl;
    }

    void show1() {
        super.show();
        System.out.println("Deposit: " + deposit);
        System.out.println("Withdrawal: " + withdrawl);
        System.out.println("Final Balance: " + (saving_bal + deposit - withdrawl));
    }
}

public class Account {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Name: ");
        String s = sc.nextLine();
        System.out.print("Enter The Account Number: ");
        int a = sc.nextInt();
        System.out.print("Enter The Minimum Balance: ");
        double min = sc.nextDouble();
        System.out.print("Enter The Savings Balance: ");
        double bal = sc.nextDouble();
        System.out.print("Enter The Deposit Amount: ");
        double dep = sc.nextDouble();
        System.out.print("Enter The Withdrawal Amount: ");
        double with = sc.nextDouble();

        System.out.println("\nCustomer Details ");
        System.out.println("*****************");

        Account_Details accdet = new Account_Details(s, a, min, bal, dep, with);
        accdet.show1();
        sc.close();
    }
}

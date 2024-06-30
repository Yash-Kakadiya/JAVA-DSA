//37. Create a class BankAccount with attributes like account number, balance, account  holder  and  name.  Create  an  array  of  BankAccount  objects  to  store bank  accounts.  Implement  methods  to  deposit  money,  withdraw  money and check balance.

import java.util.Scanner;

class BankAccount {

    private String actNo;
    private double balance;
    private String accountHolder;
    private String name;

    public BankAccount(String actNo, double balance, String accountHolder, String name) {
        this.actNo = actNo;
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.name = name;
    }

    public String getActNo() {
        return actNo;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Account Number: " + actNo);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Name: " + name);
        System.out.println("Balance: Rs." + balance);
        System.out.println("----------------------------------------------------------------");
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many accounts details you will enter? : ");
        int n = sc.nextInt();

        BankAccount[] accounts = new BankAccount[n];

        for (int i = 0; i < accounts.length; i++) {

            System.out.println("Enter details for account " + (i + 1) + " : ");

            System.out.print("Enter account number : ");
            String actNo = sc.next();

            System.out.print("Enter account holder : ");
            String accountHolder = sc.next();

            System.out.print("Enter Name : ");
            String name = sc.next();

            System.out.print("Enter available balance : ");
            double balance = sc.nextDouble();
            System.out.print("--------------------------------------------------------");

            accounts[i] = new BankAccount(actNo, balance, accountHolder, name);
        }
        System.out.println("--------------------------------------------------------");

        while (true) {
            System.out.println("Options : ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("Enter anything else to exit...");
            System.out.print("Enter one option : ");
            int op = sc.nextInt();

            System.out.println("====================================================");

            if (op != 1 && op != 2 && op != 3) {
                System.out.println("Exiting...");
                sc.close();
                return;
            } else {
                System.out.print("Enter account number : ");
                String actNo = sc.next();

                if (op == 1) {
                    boolean found = false;
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i].getActNo().equalsIgnoreCase(actNo)) {
                            System.out.print("Enter amount to deposit : ");
                            double amount = sc.nextDouble();
                            accounts[i].deposit(amount);
                            accounts[i].displayAccountDetails();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found !");
                    }
                } else if (op == 2) {
                    boolean found = false;
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i].getActNo().equalsIgnoreCase(actNo)) {
                            System.out.print("Enter amount to withdraw : ");
                            double amount = sc.nextDouble();
                            accounts[i].withdraw(amount);
                            accounts[i].displayAccountDetails();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found !");
                    }
                } else {
                    boolean found = false;
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i].getActNo().equalsIgnoreCase(actNo)) {
                            double b = accounts[i].checkBalance();
                            System.out.println("Available balance : " + b);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found !");
                    }
                }
            }
        }
    }
}

/* WAP to create Account class, which is representing a bank a1 
    where  we  can  deposit  and  withdraw  money.  if  we  want  to  withdraw 
    money which exceed our bank balance? We will not be allowed, create 
    InSufficientFundException  to  handle  above  situation  and  display 
    proper error message. */

public class AccountDemo {
    public static void main(String[] args) {
        Account a1 = new Account(10000);

        try {
            a1.deposit(5000);
            a1.withdraw(3000);
            a1.withdraw(15000);
        } catch (InsufficientFundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Current Balance: Rs." + a1.getBalance());
    }
}

class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("You Deposited: Rs." + amount);
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (amount > balance) {
            throw new InsufficientFundException("Insufficient Balance. Wanted to withdraw: " + amount);
        }
        balance -= amount;
        System.out.println("You Withdraws: Rs." + amount);
    }
}

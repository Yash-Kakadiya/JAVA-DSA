/*Create  a  class  named  Bank_Account  with  data  memebers  accountNo, 
    userName, email, accountType and accountBalance, Also create methods 
    setAccountDetails() and displayAccountDetails(). */

public class Bank_Account {

    private int accountNo;
    private String userName;
    private String email;
    private String accountType;
    private double accountBalance;

    public void setAccountDetails(int accountNo, String userName, String email, String accountType,
            double accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: ₹" + accountBalance);
    }

    public static void main(String[] args) {

        Bank_Account a1 = new Bank_Account();

        a1.setAccountDetails(123456789, "Tony Stark", "tonystark3000@stark.com", "Current",
                5483000.0);

        a1.displayAccountDetails();
    }
}

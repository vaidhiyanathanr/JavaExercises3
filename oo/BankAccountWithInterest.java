package task3.oo;

public class BankAccountWithInterest {

    /**
     * TODO: We want to create a Bank Account which will allow
     * for interest rate to be set for **all** object of this
     * class. Would you change the class definition?
     */

    private double interestRate;//what change should be done here
    //to allow this interest rate to affect any and all objects of
    //this class. This will also impact the getter & setter of interest
    //what should be the default value? Should you set it?

    public void setInterestRate(double rateIn)
    {
        interestRate = rateIn;
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    /**
     * Add the interest to the balance.
     */
    public void addInterest()
    {
        //update the code to update the balance with the interest set
    }

    public static void main(String[] args) {
        // create a bank account
        BankAccountWithInterest account1 = new BankAccountWithInterest("99786754","Gayle Forcewind");
        // create another bank account
        BankAccountWithInterest account2 = new BankAccountWithInterest("99887776","Stan Dandy-Liver");
        // make a deposit into the first account
        account1.deposit(1000);
        // make a deposit into the second account
        account2.deposit(2000);
        // set the interest rate
        BankAccountWithInterest.setInterestRate(10);
        // add interest to accounts
        account1.addInterest();
        account2.addInterest();
        // display the account details
        System.out.println("Account number: " + account1.getAccountNumber());
        System.out.println("Account name: " + account1.getAccountName());
        System.out.println("Interest Rate " + account1.getInterestRate());
        System.out.println("Current balance: " + account1.getBalance());
        System.out.println(); // blank line
        System.out.println("Account number: " + account2.getAccountNumber());
        System.out.println("Account name: " + account2.getAccountName());
        System.out.println("Interest Rate " + BankAccountWithInterest.getInterestRate());
        System.out.println("Current balance: " + account2.getBalance());
    }
}

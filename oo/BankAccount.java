package task3.oo;

import java.util.ArrayList;
import java.util.List;

public class BankAccount
{
    // TODO: add three attributes
    //  a) Account number = string
    //  b) Account name = string
    //  c) Account balance =  should be double as it can have decimals
   // Question: what would be their scope private/public/package?

    // the constructor
    public BankAccount(String numberIn, String nameIn)
    {
        this.accountNumber = numberIn;
        this.accountName = nameIn;
        //TODO: decision to make; what should the balance be?
    }

    // Getters
    public String getAccountName()
    {
        return accountName;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    //TODO: do we need setters for these?
    //Think about if we want the client class (whoever is using this)
    //to modify the values randomly using setters?
    //if there was an address associated may be yes, but
    //account number and name are **very very** important
    //attributes and hence care should be taken to add
    //setters

    /**
     * deposit money to the bank account
     * @param amountIn
     */
    public void deposit(double amountIn)
    {
        //TODO: add the deposit amount to balance
    }

    /**
     * withdraw money from the bank account
     * @param amountOut
     * @return
     */
    public boolean withdraw(double amountOut)
    {
        //TODO: add the code to remove the money
        //from the account balance
        //HINT: remember that there might be a
        //case where the balance might be less than
        //the amountOut. What would you want to
        //do in that case?
    }

    //The main method is written for you so you can test your class
    public static void main(String[] args)
    {
        // create an array of references
        List<BankAccount> accountList = new ArrayList<>();

        // create three new accounts, referenced by each element in the array
        accountList.add(new BankAccount("99786754","Susan Richards"));
        accountList.add(new BankAccount("44567109","Delroy Jacobs"));
        accountList.add(new BankAccount("46376205","Sumana Khan"));

        // make various deposits and withdrawals
        accountList.get(0).deposit(1000);
        accountList.get(2).deposit(150);
        accountList.get(0).withdraw(500);

        // print details of all three accounts
        for(BankAccount item : accountList)//this is the for-each for objects
        {
            System.out.println("Account number: " + item.getAccountNumber());
            System.out.println("Account name: " + item.getAccountName());
            System.out.println("Current balance: " + item.getBalance());
            System.out.println();
        }
    }
}
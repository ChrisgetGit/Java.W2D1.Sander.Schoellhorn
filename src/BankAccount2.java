public class BankAccount2 {

    private double balance;


    public BankAccount2()
    {
        balance = 0;

    }

    public BankAccount2(double initialBalance)
    {
        balance = initialBalance;
        System.out.println("Initial Balance is: "+initialBalance+"\n");

    }

    public void payment(double amount)
    {
        if (amount>=0){
            balance = balance + amount;
            System.out.println("Deposit: "+amount+"\n");
        }
        else {
            balance = balance + amount;
            System.out.println("Withdraw : " + amount+"\n");
            }


    }

/*    public void withdraw(double amount)
    {
        balance = balance + amount;
    }
*/

    public double getBalance()
    {
        return balance;
    }
}

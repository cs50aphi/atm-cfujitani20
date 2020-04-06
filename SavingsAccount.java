public class SavingsAccount
{
    // Instance variables
    private double saveAmount;

    // Constructors
    public SavingsAccount()
    {
        saveAmount = 100;
    }
    public SavingsAccount(double startbal)
    {
        saveAmount = startbal;
    }

    // Methods
    // Returns current balance in each account
    public double getsavingsAmount()
    {
        return saveAmount;
    }

    // Withdraw and Deposit and get balance
    public void withdrawsave(double num)
    {
        saveAmount -= num;
    }
    public void depositsave(double num)
    {
         saveAmount += num;
    }
    public void addIntrest()
    {
        saveAmount += (saveAmount * 0.1);
    }
    public double getsavebal()
    {
        return saveAmount;
    }
}
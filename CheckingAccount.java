public class CheckingAccount
{
    // Instance variables
    private double checkAmount;

    // Constructors
    public CheckingAccount()
    {
        checkAmount = 50;
    }
    public CheckingAccount(double startbal)
    {
        checkAmount = startbal;
    }

    // Methods
    // Returns current balance in each account
    public double getcheckingAmount()
    {
        return checkAmount;
    }

     // Add and subtract
    public void withdrawcheck(double num)
    {
        checkAmount -= num;
    }
    public void depositcheck(double num)
    {
         checkAmount += num;
    }
    public double getcheckbal()
    {
        return checkAmount;
    }
}
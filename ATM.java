import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        // Initialize scanner and accounts
        Scanner in = new Scanner(System.in);
        CheckingAccount check = new CheckingAccount();
        SavingsAccount save = new SavingsAccount();
        int calc = 0;
        // Initialize booelan for loop
        boolean done = false;
        // UI
        System.out.println("Hi! Welcome to ATM!");
        System.out.println("How may I serve you?");
        while (!done)
        {
            System.out.println("Do you want to: (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit?");
            String response = in.nextLine();
            switch (response)
            {
                case "C":
                case "c":
                    System.out.println("Your checking account has " + check.getcheckingAmount());
                    System.out.println("Your savings account has " + save.getsavingsAmount());
                    break;

                case "W":
                case "w":
                    System.out.println("Withdraw from: (1)Checking or (2)Savings?");
                    int answer = in.nextInt();
                    switch (answer)
                    {
                        case 2:
                            System.out.println("How much do you want to withdraw?");
                            num = in.nextInt();
                            if (save.getsavingsAmount() < num)
                            {
                                System.out.println("Insufficient funds.");
                            }
                            else
                            {
                                System.out.println("Your savings account has " + save.subSavings(num));
                            }
                        case 1:
                            System.out.println("How much do you want to withdraw?");
                            double num2 = in.nextInt();
                            if (check.getcheckingAmount() < num2)
                            {
                                System.out.println("Insufficient funds.");
                            }
                            else
                            {
                                System.out.println("Your checking account has " + check.subChecking(num));
                            }
                    }
                case "D":
                case "d":
                    System.out.println("Deposit to: (1)Checking or (2)Savings?");
                    int answer2 = in.nextInt();
                    switch (answer2)
                    {
                        case 2:
                            System.out.println("How much do you want to deposit?");
                            double num = in.nextDouble();
                            save.deposit(num)
                                System.out.println("Your savings account has " + save.getsavingsAmount);
                        case 1:
                            System.out.println("How much do you want to deposit?");
                            double num2 = in.nextDouble();
                            System.out.println("Your checking account has " + check.getcheckingAmount);
                    }
                case "T":
                case "t":
                    System.out.println("Transfer from: (1)Checking to Savings or (2)Savings to Checking?");
                    int answer3 = in.nextInt();
                    switch (answer3)
                    {
                        case 2:
                            System.out.println("Amount to transfer?");
                            double num = in.nextDouble();
                            System.out.println("Your checking account has " + check.getcheckingAmount() + num);
                        case 1:
                            System.out.println("Amount to transfer?");
                            double num2 = in.nextDouble();
                            System.out.println("Your savings account has " + save.getsavingsAmount() + num2);
                    }
                case "Q":
                case "q":
                    done = true;
                    break;
                default:
                    System.out.println("Not an option!");
            }
            if ((calc % 5) == 0)
            {
                System.out.println("Interest calculated!");
                save.addIntrest();
                System.out.println("Your checking account has " + check.getcheckingAmount());
                System.out.println("Your savings account has " + save.getsavingsAmount());
            }
        }

    }
}

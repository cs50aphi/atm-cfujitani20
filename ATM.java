import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        // Initialize scanner and accounts
        Scanner in = new Scanner(System.in);
        CheckingAccount check = new CheckingAccount();
        SavingsAccount save = new SavingsAccount();
        double num = 0;
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
                    System.out.println("Your checking account has " + check.getcheckbal());
                    System.out.println("Your savings account has " + save.getsavebal());
                    break;

                case "W":
                case "w":
                    System.out.println("Withdraw from: (1)Checking or (2)Savings?");
                    int answer = in.nextInt();
                    System.out.println("How much do you want to withdraw?");
                    num = in.nextInt();
                    switch (answer)
                    {
                        case 2:
                            if (save.getsavingsAmount() < num)
                            {
                                System.out.println("Insufficient funds.");
                            }
                            else
                            {
                                save.withdrawsave(num);
                            }
                        case 1:
                            if (check.getcheckingAmount() < num)
                            {
                                System.out.println("Insufficient funds.");
                            }
                            else
                            {
                                check.withdrawcheck(num);
                            }
                    }
                    System.out.println("Your savings account has " + save.getsavingsAmount());
                    System.out.println("Your checking account has " + check.getcheckingAmount());
                    break;
                case "D":
                case "d":
                    System.out.println("Deposit to: (1)Checking or (2)Savings?");
                    int answer2 = in.nextInt();
                    System.out.println("How much do you want to deposit?");
                    num = in.nextInt();
                    switch (answer2)
                    {
                        case 2:
                            save.depositsave(num);
                        case 1:
                            check.depositcheck(num);
                    }
                    System.out.println("Your savings account has " + save.getsavingsAmount());
                    System.out.println("Your checking account has " + check.getcheckingAmount());
                    break;
                case "T":
                case "t":
                    System.out.println("Transfer from: (1)Checking to Savings or (2)Savings to Checking?");
                    int answer3 = in.nextInt();
                    System.out.println("Amount to transfer?");
                    num = in.nextInt();
                    switch (answer3)
                    {
                        case 2:
                            if (check.getcheckbal() < num)
                            {
                                System.out.println("Insufficient funds.");
                            }
                            else
                            {
                                save.withdrawsave(num);
                                check.depositcheck(num);
                            }
                        case 1:
                            if (save.getsavebal() < num)
                            {
                                System.out.println("Insufficient funds.");
                            }
                            else
                            {
                                check.withdrawcheck(num);
                                save.depositsave(num);
                            }
                    }
                    System.out.println("Your savings account has " + save.getsavingsAmount());
                    System.out.println("Your checking account has " + check.getcheckingAmount());
                    break;
                case "Q":
                case "q":
                    done = true;
                    break;
            }
            calc++;
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

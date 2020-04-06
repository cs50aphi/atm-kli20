// by Kate Li

// Make deposits/withdrawls
// Transfer credits between accs

import java.util.Scanner;

public class ATM
{
    public static void main(String[] args)
    {
        // Instantiate Scanner and Calculator objects
        Scanner in = new Scanner(System.in);
        CheckingAccount checking = new CheckingAccount();
        SavingsAccount savings = new SavingsAccount();
        // Initialize done to false
        boolean done = false;
        // Greet user
        System.out.println("Welcome to the ATM! How may I serve you?\n");
        // while done is false:
        while (!done)
        {
            // Display user prompt for (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit
            System.out.println("Do you want to: (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit? ");
            // Declare String response
            String response = in.nextLine();
            // Switch based on response
            switch (response)
            {
                // Depositing
                case "D":
                case "d":
                    System.out.print("Deposit to: (1)Checking or (2)Savings? ");
                    int acc = in.nextInt();
                    System.out.print("How many credits do you want to deposit? ");
                    int amount = in.nextInt();
                    // deposit into checkings or savings
                    if (acc == 1) {
                        // deposit to checking, print new savings balance
                        System.out.println("Your checking account has" + checking.depositMoney(amount) + "credits. ");
                        System.out.println("Your savings account has" + savings.getSavingsBalance(amount) + "credits. ");
                    }
                    else {
                        // deposit to savings, print new savings balance
                        System.out.println("Your savings account has" + savings.depositMoney(amount) + "credits. ");
                        System.out.println("Your checking account has" + checking.getCheckingBalance(amount) + "credits. ");
                    }
                    break;
                // Withdrawing
                case "W":
                case "w":
                    System.out.print("Withdraw from: (1)Checking or (2)Savings? ");
                    int acc = in.nextInt();
                    System.out.print("How many credits do you want to withdraw? ");
                    int amount = in.nextInt();
                    // withdraw from checkings or savings
                    if (acc == 1) {
                        // withdraw from checkings
                        System.out.println("Your checking account has" + checking.withdrawMoney(amount) + "credits. ");
                        System.out.println("Your savings account has" + savings.getSavingsBalance(amount) + "credits. ");
                    }
                    else {
                        // withdraw from savings
                        System.out.println("Your savings account has" + savings.depositMoney(amount) + "credits. ");
                        System.out.println("Your checking account has" + checking.getCheckingBalance(amount) + "credits. ");
                    }
                    break;
                // // Transfering
                // case "T":
                // case "t":
                //     System.out.print("Transfer from: (1)Checking to Savings or (2)Savings to Checking? ");
                //     int acc = in.nextInt();
                //     System.out.print("Amount to transfer? ");
                //     int amount = in.nextInt();
                //     // transfer from checkings or savings
                //     if (acc == 1) {
                //         // withdraw from checkings
                //         // deposit into savings
                //     }
                //     else {
                //         // withdraw from savings
                //         // deposit in checkings
                //     }
                //     break;
                case "Q":
                case "q":
                    done = true;
                    break;
            }
        }
        // Print summary of checking and savings account balance
        // System.out.println("Your checking account has" + _____ "credits. ");
        // System.out.println("Your savings account has" + _____ "credits. ");

        // int finalNum = calc.getNumberOfOperations();
        // System.out.println("The total amount of operations used was " + finalNum + ".");
    }


}
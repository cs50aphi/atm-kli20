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
        System.out.println("Welcome to the ATM! Would you like to start with (1)Default balances or (2)Pick your own balance? ");
        int chooseBalance = in.nextInt();
        if (chooseBalance == 2) {
            // Custom user-inputted balances
            System.out.println("How much is in your savings account?");
            int savingsUser = in.nextInt();
            savings.userSavingsBalance(savingsUser);
            System.out.println("How much is in your checking account?");
            int checkingUser = in.nextInt();
            checking.userCheckingBalance(checkingUser);
        }
        System.out.println("Your savings account has " + savings.getSavingsBalance() + " credits. ");
        System.out.println("Your checking account has " + checking.getCheckingBalance() + " credits. \n");
        // while done is false:
        while (!done)
        {
            // Display user prompt for (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit
            System.out.printf("Do you want to: (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit? \n");
            // Declare String response
            String response = in.next();
            // Switch based on response
            switch (response)
            {
                // Depositing
                case "D":
                case "d": {
                    System.out.print("Deposit to: (1)Checking or (2)Savings? ");
                    int acc = in.nextInt();
                    System.out.print("How many credits do you want to deposit? ");
                    int amount = in.nextInt();
                    // deposit into checkings or savings
                    if (acc == 1) {
                        // deposit to checking, print new savings balance
                        System.out.println("Your savings account has " + savings.getSavingsBalance() + " credits. ");
                        System.out.println("Your checking account has " + checking.depositMoney(amount) + " credits. \n");
                    }
                    else {
                        // deposit to savings, print new savings balance
                        System.out.println("Your savings account has " + savings.depositMoney(amount) + " credits. ");
                        System.out.println("Your checking account has " + checking.getCheckingBalance() + " credits. \n");
                    }
                    break;
                }
                // Withdrawing
                case "W":
                case "w": {
                    System.out.print("Withdraw from: (1)Checking or (2)Savings? ");
                    int acc = in.nextInt();
                    System.out.print("How many credits do you want to withdraw? ");
                    int amount = in.nextInt();
                    // withdraw from checkings or savings
                    if (acc == 1) {
                        // withdraw from checkings
                        int newTotal = checking.withdrawMoney(amount);
                        if (newTotal < 0) {
                           System.out.println("Insufficient funds. ");
                        }
                        System.out.println("Your savings account has " + savings.getSavingsBalance() + " credits. ");
                        System.out.println("Your checking account has " + checking.withdrawMoney(amount) + " credits. \n");
                    }
                    else {
                        // withdraw from savings
                        double newTotal = savings.withdrawMoney(amount);
                        if (newTotal < 0) {
                           System.out.println("Insufficient funds. ");
                        }
                        System.out.println("Your savings account has " + savings.withdrawMoney(amount) + " credits. ");
                        System.out.println("Your checking account has " + checking.getCheckingBalance() + " credits. \n");
                    }
                    break;
                }
                case "C":
                case "c":
                    System.out.println("Your savings account has " + savings.getSavingsBalance() + " credits. ");
                    System.out.println("Your checking account has " + checking.getCheckingBalance() + " credits. \n");
                    break;
                // Transfering
                case "T":
                case "t": {
                    System.out.print("Transfer from: (1)Checking to Savings or (2)Savings to Checking? ");
                    int acc = in.nextInt();
                    System.out.print("Amount to transfer? ");
                    int amount = in.nextInt();
                    // transfer from checkings or savings
                    if (acc == 1) {
                        // deposit amount into savings
                        System.out.println("Your savings account has " + savings.depositMoney(amount) + " credits. ");
                        // withdraw amount from checking
                        System.out.println("Your checking account has " + checking.withdrawMoney(amount) + " credits. \n");
                    }
                    else {
                        // withdraw amount from savings
                        System.out.println("Your savings account has " + savings.withdrawMoney(amount) + " credits. ");
                        // deposit amount into checking
                        System.out.println("Your savings account has " + checking.depositMoney(amount) + " credits. ");
                    }
                    break;
                }
                case "Q":
                case "q":
                    done = true;
                    break;
            }
            // Get number of total transactions from accs
            int totalTransactions = savings.getNumTransactions() + checking.getNumTransactions();
            // Every 5 transactions, add interest
            if (totalTransactions % 5 == 0)
            {
                System.out.println("Interest calculated! ");
                savings.addInterest();
                System.out.println("Your savings account has " + savings.getSavingsBalance() + " credits. ");
                System.out.println("Your checking account has " + checking.getCheckingBalance() + " credits. ");
            }
        }
        // to do: insufficient funds
    }


}
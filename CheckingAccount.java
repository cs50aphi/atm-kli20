// by Kate Li

// Keeps track of balance

public class CheckingAccount
{
    // Instance variables
    private int checkingBalance;
    private int checkingNumTransactions;

    // default constructor with default balance (10 credits)
    public CheckingAccount()
    {
        checkingBalance = 10;
        checkingNumTransactions = 0;
    }

    // Methods
    
    // Changes checking balance to user input
    public void userCheckingBalance(int checkingUser) {
        checkingBalance = checkingUser;
    }
    // Returns the current checking balance
    public int getCheckingBalance() {
        return checkingBalance;
    }
    // Withdraw money
    public int withdrawMoney(int amount) {
        if (checkingBalance - amount < 0)
        {
            return -1;
        }
        checkingNumTransactions++;
        checkingBalance -= amount;
        return checkingBalance;
    }
    // Deposit into acc
    public int depositMoney(int amount) {
        checkingNumTransactions++;
        // return new balance
        checkingBalance += amount;
        return checkingBalance;
    }
    // Return number of transactions
    public int getNumTransactions() {
        return checkingNumTransactions;
    }

}
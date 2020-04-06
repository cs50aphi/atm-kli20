// by Kate Li

// Keeps track of balance
// User can withdraw, get balance, and deposit into acc
public class CheckingAccount
{
    // Instance variables
    private int checkingBalance;
    private int checkingNumTransactions;
        
    // default constructor with default balance (10 credits)
    public DefaultBalance()
    {
        checkingBalance = 10;
        checkingNumTransactions = 0;
    }
    // custom constructor with user-inputed starting balance
    
    
    // Methods

    // Returns the current checking balance
    public int getCheckingBalance() {
        return checkingBalance;
    }
    // Withdraw money
    public int withdrawMoney() {
        checkingNumTransactions++;
        checkingBalance =- amount;
        return checkingBalance;
    }
    // Get balance
    // Deposit into acc
    public int depositMoney(int amount) {
        checkingNumTransactions++;
        // return new balance
        checkingBalance =+ amount;
        return checkingBalance;
    }

}
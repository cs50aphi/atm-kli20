// by Kate Li

// Keeps track of balance and interest rate

// default constructor with default balance (10 credits)
// custom constructor with user-inputed starting balance
public class SavingsAccount
{

// Instance variables
    private int savingsBalance;
    private int savingsNumTransactions;

    // default constructor with default balance (10 credits)
    public DefaultBalance()
    {
        savingsBalance = 100;
        savingsNumTransactions = 0;
    }

    // Methods

    // Returns the current savings balance
    public int getSavingsBalance() {
        return savingsBalance;
    }
    // Withdraw money
    public int withdrawMoney() {
        savingsNumTransactions++;
        savingsBalance =- amount;
        return savingsBalance;
    }
    // Get balance
    // Deposit into acc
    public int depositMoney(int amount) {
        savingsNumTransactions++;
        // return new balance
        savingsBalance =+ amount;
        return savingsBalance;
    }
}    

// Withdraw money
// Get balance
// Deposit into acc

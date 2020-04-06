// by Kate Li

// Keeps track of balance and interest rate

public class SavingsAccount
{

// Instance variables
    private double savingsBalance;
    private int savingsNumTransactions;

    // default constructor with default balance (10 credits)
    public SavingsAccount()
    {
        savingsBalance = 100;
        savingsNumTransactions = 0;
    }

    // Methods

    // Changes savings balance to user input
    public void userSavingsBalance(int savingsUser) {
        savingsBalance = savingsUser;
    }
    // Returns the current savings balance
    public double getSavingsBalance() {
        return savingsBalance;
    }
    // Withdraw money
    public double withdrawMoney(int amount) {
        if (savingsBalance - amount < 0)
        {
            return -1;
        }
        savingsNumTransactions++;
        savingsBalance -= amount;
        return savingsBalance;
    }
    // Deposit into acc
    public double depositMoney(int amount) {
        savingsNumTransactions++;
        // return new balance
        savingsBalance += amount;
        return savingsBalance;
    }
    // Increases the balance by an interest rate (5%) and update new balance
    public void addInterest() {
        savingsBalance = 1.05*savingsBalance;
    }
    // Return number of transactions
    public int getNumTransactions() {
        return savingsNumTransactions;
    }
    
}
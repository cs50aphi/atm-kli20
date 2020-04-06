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
    public int getSavingsBalance() {
        return savingsBalance;
    }
    // Withdraw money
    public int withdrawMoney(int amount) {
        savingsNumTransactions++;
        savingsBalance -= amount;
        return savingsBalance;
    }
    // Deposit into acc
    public int depositMoney(int amount) {
        savingsNumTransactions++;
        // return new balance
        savingsBalance += amount;
        return savingsBalance;
    }
    // after 5 transactions, 
    // increases the balance by an interest rate and update new balance
    public int addInterest() {
        
    }
    
    
}
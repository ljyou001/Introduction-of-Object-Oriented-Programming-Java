public abstract class Account
{
    private String accountNum;
    private double balance;
    public Account(String accountNum, double balance)
    {
        this.accountNum = accountNum;
        this.balance = balance;        
    }
    public String getAccountNum()
    {
        return accountNum;
    }
    public double getBalance()
    {
        return balance;
    }   
    public void credit(double amount)
    {
        balance = balance + amount;
    }
    public boolean debit(double amount)
    {
        if(balance < amount)
        {
            return false;
        }
        balance = balance - amount;
        return true;
    }
    public String toString()
    {
        return accountNum + " $" + String.format("%.2f", balance);
    }
}
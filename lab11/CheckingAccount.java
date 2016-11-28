public class CheckingAccount extends Account
{
    private double monthlyFee;
    public CheckingAccount(String accountNum, double balance, double monthlyFee)
    {
        super(accountNum,balance);
        this.monthlyFee = monthlyFee;
    }
    public double getMonthlyFee()
    {
        return monthlyFee;
    }
    public void setMonthlyFee(double monthlyFee)
    {
        this.monthlyFee = monthlyFee;
    }
    public void chargeFee()
    {
        super.debit(monthlyFee);
    }
    public String toString()
    {
        return super.getAccountNum() + "\t$" +super.getBalance() + "\tMonthly Fee:" + monthlyFee; 
    }
}

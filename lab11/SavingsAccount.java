public class SavingsAccount extends Account
{
    private double annualInterestRate;
    public SavingsAccount(String accountNum, double balance, double annualInterestRate)
    {
        super(accountNum,balance);
        this.annualInterestRate = annualInterestRate;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }
    public void addInterest()
    {
        double monthlyIR = annualInterestRate / 12;
        super.credit(super.getBalance() * monthlyIR);
    }
    public String toString()
    {
        return super.getAccountNum() + "\t$" +super.getBalance() + "\tAnnual Rate:" + annualInterestRate; 
    }
}

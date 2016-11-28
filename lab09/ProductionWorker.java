public class ProductionWorker extends Employee
{
    private int shift;
    private double hourlyPayRate;
    public ProductionWorker(String name, String id, int shift, double hourlyPayRate)
    {
        super(name, id);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }
    public String getShift()
    {
        if (shift == 1)
        {
            return "Day";
        }else
        {
            return "Night";
        }
    }
    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }
    public void setShift(int shift)
    {
        this.shift = shift;
    }
    public void setHourlyPayRate(double hourlyPayRate)
    {
        this.hourlyPayRate = hourlyPayRate;
    }
}

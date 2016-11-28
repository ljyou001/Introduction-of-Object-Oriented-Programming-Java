public class ShiftSupervisor extends Employee
{
    private double salary;
    private double bonus;
    public ShiftSupervisor(String name, String id, double salary, double bonus)
    {
        super(name, id);
        this.salary = salary;
        this.bonus = bonus;
    }
    public double getSalary()
    {
        return salary;
    }
    public double getBonus()
    {
        return bonus;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public void setBouns(double bonus)
    {
        this.bonus = bonus;
    }
}

public class Employee
{
    private String name;
    private int inNumber;
    private String department;
    private String position;
    public Employee(String name, int inNumber, String department, String position)
    {
        this.name = name;
        this.inNumber = inNumber;
        this.department = department;
        this.position = position;
    }
    public Employee(String name, int inNumber)
    {
        this.name = name;
        this.inNumber = inNumber;
        this.department = "";
        this.position = "";
    }
    public Employee()
    {
        this.name = "";
        this.inNumber = 0;
        this.department = "";
        this.position = "";
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return inNumber;
    }
    public String getDepartment()
    {
        return department;
    }
    public String getPosition()
    {
        return position;
    }
}

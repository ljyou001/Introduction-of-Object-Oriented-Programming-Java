public class User
{
    private String roll;
    private String name;
    private String id;
    private String department;
    public User(String roll, String name, String id)
    {
        this.roll = roll;
        this.name = name;
        this.id = id;
    }
    public User(String roll, String name, String id, String department)
    {
        this.roll = roll;
        this.name = name;
        this.id = id;
        this.department = department;
    }
    public String getRoll()
    {
        return roll;
    }
    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return id;
    }
    public String getStringDepartment()
    {
        return department;
    }
    public String[] getDepartment()
    {
        return department.split(";");
    }
    public void setRoll(String roll)
    {
        this.roll = roll;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }
}

import java.util.ArrayList;
public class Door
{
    private String id;
    private String startTime;
    private String endTime;
    private String department;
    private String rool;
    private String exceptionList;
    public Door(String id, String startTime, String endTime, String department, String rool, String exceptionList)
    {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.department = department;
        this.rool = rool;
        this.exceptionList = exceptionList;
    }
    public String getId()
    {
        return id;
    }
    public int getStartTime()
    {
        String[] ttokens = startTime.split(":");
        return Integer.parseInt(ttokens[0]+ttokens[1]+ttokens[2]);
    }
    public int getEndTime()
    {
        String[] ttokens = endTime.split(":");
        return Integer.parseInt(ttokens[0]+ttokens[1]+ttokens[2]);
    }
    public String getStringStartTime()
    {
        return startTime;
    }
    public String getStringEndTime()
    {
        return endTime;
    }
    public String[] getDepartment()
    {
        return department.split(";");
    }
    public String[] getExceptionList()
    {
        return exceptionList.split(";");
    }
}
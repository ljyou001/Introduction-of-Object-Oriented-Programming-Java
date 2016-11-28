public class Record{
    private String doorName;
    private String accessTime;
    private String accessUser;
    public Record(String doorName, String accessUser, String accessTime)
    {
        this.doorName = doorName;
        this.accessTime = accessTime;
        this.accessUser = accessUser;
    }
    public String toString()
    {
        return doorName + "\t" + accessUser + "\t" + accessTime;
    }
    public String getDoorName()
    {
        return doorName;
    }
}

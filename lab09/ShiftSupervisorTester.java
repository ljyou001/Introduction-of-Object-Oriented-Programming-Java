public class ShiftSupervisorTester
{
    public static void main(String args[])
    {
        ShiftSupervisor ss = new ShiftSupervisor("Oliver","15251632",1000000,10000);
        System.out.println(ss.getName()+"\t"+ss.getId()+"\t"+ss.getSalary()+"\t"+ss.getBonus());
        ss.setName("youyou");
        ss.setBouns(20000);
        System.out.println(ss.getName()+"\t"+ss.getId()+"\t"+ss.getSalary()+"\t"+ss.getBonus());
    }
}

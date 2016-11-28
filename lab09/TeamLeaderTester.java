public class TeamLeaderTester
{
    public static void main(String args[])
    {
        TeamLeader tl = new TeamLeader("Oliver","15251632",1,200,2000,10,10);
        System.out.println(tl.getName()+"\t"+tl.getShift()+"\t"+tl.getAttendedTrainingHour());
        tl.setName("youyou");
        tl.setShift(2);
        tl.setAttendedTrainingHour(20);
        System.out.println(tl.getName()+"\t"+tl.getShift()+"\t"+tl.getAttendedTrainingHour());
    }
}

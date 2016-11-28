public class ProductionWorkerTester
{
    public static void main(String args[])
    {
        ProductionWorker pw = new ProductionWorker("Oliver","15251632",1,200);
        System.out.println(pw.getName()+"\t"+pw.getId()+"\t"+pw.getShift()+"\t"+pw.getHourlyPayRate());
        pw.setName("youyou");
        pw.setShift(2);
        System.out.println(pw.getName()+"\t"+pw.getId()+"\t"+pw.getShift()+"\t"+pw.getHourlyPayRate());
    }
}
public class Dealer
{
    private int value;
    private int sum;
    Die die = new Die(6);
    public int[] dvalues = new int[6];
    public Dealer()
    {
        sum = 0;
    }
    public void generateNum(){
        for (int i = 0; i < 6; i++)
        {
            dvalues[i] = die.returnNum();
        }
    }
    public int [] value()
    {
        return dvalues;
    }
    public int sum()
    {
        sum = sum + value;
        return sum;
    }
    public String dt()
    {
        if (sum() % 2 == 0)
        {
            return "even";
        }
        else
        {
            return "odd";
        }
    }
}

import java.util.*;
public class SimpleFractionArray
{
    public List<SimpleFraction> fractions = null;
    private SortSimpleFractionArray ORDER = new SortSimpleFractionArray();
    public SimpleFractionArray()
    {    
        fractions = new ArrayList<SimpleFraction>();
    }

    public void addFraction(SimpleFraction f)
    {
        fractions.add(f);
    }

    public SimpleFraction getMax()
    {
        this.dSort();
        return fractions.get(0);
    }

    public SimpleFraction getMin()
    {
        this.aSort();
        return fractions.get(0);
    }

    public void aSort()
    {
        ORDER.ascend = true;
        Collections.sort(fractions, ORDER);
    }

    public void dSort()
    {
        ORDER.ascend = false;
        Collections.sort(fractions, ORDER);
    }
}


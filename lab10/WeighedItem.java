public class WeighedItem extends RetailItem
{
    private double weight;
    public WeighedItem(String name, double unitPrice, double weight)
    {
        super(name, unitPrice);
        this.weight = weight;
    }
    public double getWeight()
    {
        return weight;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public double getPrice()
    {
        return super.getUnitPrice() * getWeight();
    }
    public String toString()
    {
        return super.toString()+"\t"+weight+"kg\t$"+getPrice();
    }
}

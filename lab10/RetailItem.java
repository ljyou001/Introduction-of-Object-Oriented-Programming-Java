public abstract class RetailItem
{
    private String name;
    private double unitPrice;
    public RetailItem()
    {
        this("no item", 0);
    }
    public RetailItem(String name, double unitPrice)
    {
        this.name = name;
        this.unitPrice = unitPrice;
    }
    public abstract double getPrice();
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getUnitPrice()
    {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }
    public String toString()
    {
        return name + "@" + unitPrice;
    }
}

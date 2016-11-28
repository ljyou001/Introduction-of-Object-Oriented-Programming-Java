public class CountedItem extends RetailItem
{
    private int quantity;
    public CountedItem(String name, double unitPrice, int quantity)
    {
        super(name, unitPrice);
        this.quantity = quantity;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public double getPrice()
    {
        return getQuantity() * super.getUnitPrice();
    }
    public String toString()
    {
        return super.toString() + "\t" + getQuantity() + "units\t$" + getPrice();
    }
}

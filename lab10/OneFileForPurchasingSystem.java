import java.io.*;
import java.util.*;
class PurchasingSystem
{
    public static void main(String args[])
    {
        ArrayList<RetailItem> RetailItemList = new ArrayList<RetailItem>();
        Scanner keyboard = new Scanner(System.in);
        int stop = 0;
        while(stop == 0)
        {
            System.out.println("1. Add Weighted Item\n2. Add Counted Item\n3. Print Receipt\n4. Quit\n\nEnter the Option: ");
            int count = keyboard.nextInt();
            keyboard.nextLine();
            if (count == 4)
            {
                stop = 1;
            }
            else if (count == 1)
            {
                System.out.print("Enter the name: ");
                String name = keyboard.nextLine();
                System.out.print("Enter the Unit Price: ");
                double unitPrice = keyboard.nextDouble();
                keyboard.nextLine();
                System.out.print("Enter the Weight(kg): ");
                double weight = keyboard.nextDouble();
                keyboard.nextLine();
                RetailItemList.add(new WeighedItem(name,unitPrice,weight));
                continue;
            }
            else if (count == 2)
            {
                System.out.print("Enter the name: ");
                String name = keyboard.nextLine();
                System.out.print("Enter the Unit Price: ");
                double unitPrice = keyboard.nextDouble();
                keyboard.nextLine();
                System.out.print("Enter the Quantity: ");
                int quantity = keyboard.nextInt();
                keyboard.nextLine();
                RetailItemList.add(new CountedItem(name,unitPrice,quantity));
                continue;
            }
            else if (count == 3)
            {
                double sum = 0;
                for (int i = 0; i < RetailItemList.size(); i++)
                {
                    System.out.println(RetailItemList.get(i));
                    sum = sum + RetailItemList.get(i).getPrice();
                }
                System.out.println("Total: " + sum);
            }
        }
    }
}

abstract class RetailItem
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

class CountedItem extends RetailItem
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

class WeighedItem extends RetailItem
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

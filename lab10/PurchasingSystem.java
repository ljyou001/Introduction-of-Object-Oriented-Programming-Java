import java.io.*;
import java.util.*;
public class PurchasingSystem
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

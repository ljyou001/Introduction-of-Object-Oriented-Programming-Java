import java.util.Scanner;

public class FreezeBoilChecker
{
    public static void main(String[] args)
    {
        System.out.print("Please enter the temperature(in Fahrenheit):");
        Scanner keyboard = new Scanner (System.in);
        int temperature = keyboard.nextInt();
        keyboard.nextLine();
        FreezeBoilPoint temp = new FreezeBoilPoint(temperature);
        if (temp.isEthylFreezing() == true)
        {
            System.out.println("Ethyl Alcohol is freezing");
        }
        else if(temp.isEthylBoiling() == true)
        {
            System.out.println("Ethyl Alcohol is boiling");
        }
        if(temp.isOxygenFreezing() == true)
        {
            System.out.println("Oxygen is freezing");
        }
        else if(temp.isOxygenBoiling() == true)
        {
            System.out.println("Oxygen is boiling");
        }
        if(temp.isWaterFreezing() == true)
        {
            System.out.println("Water is freezing");
        }
        else if(temp.isWaterBoiling() == true)
        {
            System.out.println("Water is boiling");
        }
    }
}

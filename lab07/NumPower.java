import java.util.Scanner;
import java.lang.Math;
public class NumPower
{
    public static void main(String[] args)
    {
        new NumPower();
    }
    public NumPower()
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter the base:");
        double base = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter the power:");
        double power = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println(Math.pow (base, power));
    }
    
}

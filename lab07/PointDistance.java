import java.util.Scanner;
import java.awt.geom.Point2D;
import java.awt.Point;
import java.lang.Math;
public class PointDistance
{
    public static void main(String[] args)
    {
        new PointDistance();
    }
    public PointDistance()
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter the coordinates of point:");
        double x1 = keyboard.nextInt();
        double y1 =  keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter the coordinates of point:");
        double x2 = keyboard.nextInt();
        double y2 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("The distance is:"+Point.distance(x1,y1,x2,y2));
    }
}

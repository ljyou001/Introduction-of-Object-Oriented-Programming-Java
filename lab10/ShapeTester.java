import java.io.*;
import java.util.*;
public class ShapeTester
{
    public static void main(String args[])
    {
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(new Circle());
        shapeList.add(new Circle(10));
        shapeList.add(new Rectangle());
        shapeList.add(new Rectangle(4, 8));
        shapeList.add(new Triangle());
        shapeList.add(new Triangle(6));
        shapeList.add(new Triangle(3, 4));

        for(int i = 0; i < shapeList.size(); i++)
        {
            System.out.println(shapeList.get(i));
            System.out.println("area: " + shapeList.get(i).area());
            System.out.println("perimeter: " + shapeList.get(i).perimeter());
            System.out.println();
        }
    }
}

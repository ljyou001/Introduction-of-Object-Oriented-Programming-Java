import java.io.*;
import java.util.*;

class ShapeTester
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

abstract class Shape
{
   public abstract double area(); 
   public abstract double perimeter();
}

class Triangle extends Shape
{
    public double side1;
    public double side2;
    public double side3;
    public Triangle()
    {
        this(1,1,1);
    }
    public Triangle(double side)
    {
        this(side,side,side);
    }
    public Triangle(double side1, double side2)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = Math.sqrt(side1 * side1 + side2 * side2);
    }
    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double area()
    {
        double area, s, mid;
        s = perimeter();
        mid = s * (s - side1) * (s - side2) * (s - side3);
        area = Math.sqrt(mid);
        return area;
    }
    public double perimeter()
    {
        return side1 + side2 + side3;
    }
    public String toString()
    {
        return "Triangle:\nside1:"+side1+
                "\nside2:"+side2+
                "\nside3:"+side3;
    }
}

class Rectangle extends Shape
{
    private double width;
    private double length;
    public Rectangle()
    {
        this(1, 1);
    }
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    public double area()
    {
        return width * length;
    }
    public double perimeter()
    {
        return (width + length)*2;
    }
    public String toString()
    {
        return "Rectangle:\nwidth: " + width +
        "\nlength: " + length;
    }
}

class Circle extends Shape
{
    private double radius;
    public Circle()
    {
        this(1.0);
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double area()
    {
        return radius * radius * Math.PI;
    }
    public double perimeter()
    {
        return 2 * radius * Math.PI;
    }
    public String toString()
    {
        return "Circle:\nradius:"+radius;
    }
}

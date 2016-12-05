import java.util.*;

class MyShapeTester
{
    public static void main(String args[])
    {
        MyCircle c = new MyCircle(10, 0, 0);
        System.out.println(c);
        System.out.println();
        c.resize(90);
        System.out.println(c);
        System.out.println();
        c.moveUp();
        System.out.println(c);
        System.out.println();
        c.moveDown();
        System.out.println(c);
        System.out.println();
        c.moveLeft();
        System.out.println(c);
        System.out.println();
        c.moveRight();
        System.out.println(c);
        System.out.println();

        MyRectangle r = new MyRectangle(4, 8, 10, 10);
        System.out.println(r);
        System.out.println();
        r.resize(50);
        System.out.println(r);
        System.out.println();
        r.moveUp();
        System.out.println(r);
        System.out.println();
        r.moveDown();
        System.out.println(r);
        System.out.println();
        r.moveLeft();
        System.out.println(r);
        System.out.println();
        r.moveRight();
        System.out.println(r);
        System.out.println();
    }
}

interface Shape
{   
    double MY_PI = 3.14;
    double area();
    double perimeter();    
}

interface Moveable
{
    int MIN_STEP = 1;
    int MAX_STEP = 5;
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

interface Resizeable
{
    public void resize(int percent);
}

class Circle implements Shape
{   
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double area()
    {
        return radius*radius*MY_PI;
    }
    public double perimeter()
    {
        return 2*radius*MY_PI;
    }  
}  

class Rectangle implements Shape
{
    private double width;
    private double height;
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public double area()
    {
        return width * height;
    }
    public double perimeter()
    {
        return 2*(width + height);
    }
}

class MyRectangle extends Rectangle implements Resizeable, Moveable
{
    private int x;
    private int y;
    public MyRectangle(double width, double height, int x, int y)
    {
        super(width, height);
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return "Width: "+getWidth()+"\nHeight: "+getHeight()+"\nCoordinates: ("+x+", "+y+")";
    }
    public void resize(int percent)
    {
        setWidth(getWidth() * percent / 100);
        setHeight(getHeight() * percent / 100);
    }
    public void moveUp()
    {
        y = y + MAX_STEP;
    }
    public void moveDown()
    {
        y = y - MAX_STEP;
    }
    public void moveLeft()
    {
        x = x - MAX_STEP;
    }
    public void moveRight()
    {
        x = x + MAX_STEP;
    }
}

class MyCircle extends Circle implements Resizeable, Moveable
{
    private int x;
    private int y;
    public MyCircle(double radius, int x, int y)
    {
        super(radius);
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return "Radius: "+getRadius()+"\nCoordinates: ("+x+", "+y+")";
    }
    public void resize(int percent)
    {
        setRadius(getRadius() * percent / 100);
    }
    public void moveUp()
    {
        y = y + MIN_STEP;
    }
    public void moveDown()
    {
        y = y - MIN_STEP;
    }
    public void moveLeft()
    {
        x = x - MIN_STEP;
    }
    public void moveRight()
    {
        x = x + MIN_STEP;
    }
}


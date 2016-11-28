public class Circle implements Shape
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


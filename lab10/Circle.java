public class Circle extends Shape
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

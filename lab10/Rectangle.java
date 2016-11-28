public class Rectangle extends Shape
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

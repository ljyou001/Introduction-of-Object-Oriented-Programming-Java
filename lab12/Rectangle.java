public class Rectangle implements Shape
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

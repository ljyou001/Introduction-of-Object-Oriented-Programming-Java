public class Triangle extends Shape
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

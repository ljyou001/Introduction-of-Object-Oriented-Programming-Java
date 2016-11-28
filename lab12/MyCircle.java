public class MyCircle extends Circle implements Resizeable, Moveable
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

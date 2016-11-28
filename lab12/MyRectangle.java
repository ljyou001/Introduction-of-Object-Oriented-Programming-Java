public class MyRectangle extends Rectangle implements Resizeable, Moveable
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

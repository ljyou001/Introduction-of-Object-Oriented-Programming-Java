import java.util.ArrayList;
/**
 * class MyShapeTester
 * 
 * @author COMP2007 
 * @version 1.0
 */
public class MyShapeTester
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

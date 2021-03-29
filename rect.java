
/**
 * Write a description of class rect here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class rect
{
    double length,breadth;
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public static void main()
    {
    double length,breadth;
    rect r = new rect();
    Scanner in = new Scanner(System.in);
    r.length=in.nextDouble();
    r.breadth=in.nextDouble();
    double area=r.length*r.breadth;
    System.out.println(area);
}
    
}


/**
 * Write a description of class rectangle2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rectangle2
{
    private double length;
    private double breadth;
    public rectangle2(double l, double b)
    {
        length=l;
        breadth=b;
    }
    public rectangle2(double s)
    {
        length=breadth=s;
    }
    public double area()
    {
        return length*breadth;
    }
    public static void main(String args[])
    {
        rectangle2 r=new rectangle2(10,5);
        System.out.println(r.area());
    }
        
}

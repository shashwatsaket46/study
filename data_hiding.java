
/**
 * Write a description of class data_hiding here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class data_hiding
{
    // instance variables - replace the example below with your own
    private double length;
    private double breadth;
    public double getLength()
    {
        return length;
    }
    public double getBreadth() 
    {
        return breadth;
    }
    public void setLength(double l)
    {
        length=l;
    }
    public void setBreadth(double b)
    {
        breadth=b;
    }
    public double area()
    {
        return length*breadth;
    }
}


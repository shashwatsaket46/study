
/**
 * Write a description of class overloadarea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.lang.*;
public class overloadarea
{
    static double area(double r)
    {
        r= Math.PI*r*r;
        return r;
    }
    static double area(double a,double b)
    {
        return a*b;
    }
    public static void main(String args[])
    {     
        System.out.println(area(35));
    }
        
}

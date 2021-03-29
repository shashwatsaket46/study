
/**
 * Write a description of class determinant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.*;
public class triangle
{
    public static void main(String args[])
    {
        int a,b,c,s;
        double area;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
    }
        
        
        
    
}

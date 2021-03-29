
/**
 * Write a description of class digits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.lang.*;
public class digits
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,r;
        n=in.nextInt();
        while (n>0)
        {
            r=n%10;
            n=n/10;
            System.out.println(r);
        }
    }
}
    

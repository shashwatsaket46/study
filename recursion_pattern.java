
/**
 * Write a description of class recursion_pattern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class recursion_pattern
{
    public static void pattern(int n, int i)
    {
        if(n==0)
        {
            return;
        }
        if(i<n)
        {
            
            System.out.printf("* ");
            pattern(n,i+1);
        }
        else
        {
            System.out.printf("\n");
            pattern(n-1,0);
            
        }
    }
}

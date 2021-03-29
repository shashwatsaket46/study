
/**
 * Write a description of class recursion_pattern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pattern2
{
    public static void pattern2(int n, int i)
    {
        if(n==0)
        {
            return;
        }
        if(n>i)
        {
            pattern2(n,i+1);
            System.out.printf("* ");
        }
        else
        {
            pattern2(n-1,0);
            
            System.out.printf("\n");
            
        }
    }
    public static void main(String args[])
    {
        pattern2(5,0);
    }
}

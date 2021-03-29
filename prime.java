
/**
 * Write a description of class prime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class prime
{
    static boolean prime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
            
        }
        return true;
    }
    public static void main(String args[])
    {
        System.out.println(prime(49));
    }
    
}

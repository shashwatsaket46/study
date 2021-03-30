
/**
 * This is basically printing number of possibilities to reach last cell of matrix from 1st cell.
 *
 * @author Shashwat Saket
 * @version 30/3/2021
 */

public class mazepath
{
    public static int count=0;
    public static void maze(int i, int j, int n, int m, String o)
    {
        if (i==n-1 && j==m-1)
        {
            count++;
            System.out.println(o);
            return;
        }
        if (i>=n || j>=m)
            return;
        maze(i,j+1,n,m,o +"R");
        maze(i+1,j,n,m,o +"D");
    }
    public static void main(String args[])
    {
        maze(0,0,5,5,"");
        System.out.println(count);
    }
}

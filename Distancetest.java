import java.util.*;
public class Distancetest
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       Distance Do = new Distance();
       
       System.out.println("Enter the X1 co-ordinate");
       int c1 = in.nextInt();
       System.out.println("Enter the Y1 co-ordinate");
       int c2 = in.nextInt();
       System.out.println("Enter the X2 co-ordinate");
       int c3 = in.nextInt();
       System.out.println("Enter the Y2 co-ordinate");
       int c4 = in.nextInt();
       
       Do.dis(c1,c2,c3,c4);
    }
}
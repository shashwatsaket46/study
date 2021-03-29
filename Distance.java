import java.lang.*;
public class Distance
{
  
   public void dis(double a,double b,double c,double d)
    {
       double dis = Math.sqrt((a-c)*(a-c) + (b-d)*(b-d));
       System.out.printf("Distance = %f",dis);
    }
}

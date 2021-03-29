
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.lang.*;
public class test
{
 public static void main(String args[])
 {
     float base,height,area;
     System.out.println("Enter Base  and Height ");
     Scanner sc=new Scanner(System.in);
     base=sc.nextFloat();
     height=sc.nextFloat();
     area=(base*height*0.5f);
     System.out.println(area);
    }
     
}

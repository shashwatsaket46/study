
/**
 * Write a description of class bitwise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.*;
public class bitwise
{
    public static void main(String args[])
    {
        byte a=9,b=12;
        byte c;
        c=(byte)(a<<4);
        c=(byte)(c|b);
        System.out.println((c&0b11110000)>>4);
    }

    
}

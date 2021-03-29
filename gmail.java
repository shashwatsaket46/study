
/**
 * Write a description of class gmail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.lang.*;
public class gmail
{
    public static void main(String args[])
    {
        String str="Shashwat@gmail.com";
        int i=str.indexOf("@");
        String uname=str.substring(0,i);
        String domain=str.substring(i+1,str.length());
        System.out.println("username"+uname);
        System.out.println("domain"+domain);
        System.out.println(domain.startsWith("gmail.com"));
        }
    }



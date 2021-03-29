
/**
 * Write a description of class interfaces here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
interface test1
{
    void meth1();
    void meth2();
}
class my implements test1
{
    public void meth1()
    {
     System.out.println("This is method 1");   
    }
    public void meth2()
    {
        System.out.println("Method 2");
    }
    
}
public class interfaces
{
    public static void main(String args[])
    {
    test1 t = new my();
    t.meth1();
    t.meth2();
    }   
}

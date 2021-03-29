// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;

/**
 * 
 */
public class Test_Account extends account
{

    /**
     * 
     */
    static public void main(String[] arg) throws Exception
    {
        account a1 =  new account("BIT", 65443, 5000);
        account a3 =  new account("Shashwat Saket", 60026, 5000);
        account a4 =  new account("JavaSubject", 65444, 5000);
        account a2 =  new account("BIT", 1332, "Deoghar", "Current account", 5000);
        a1.Address = "Ranchi";
        a1.AccountType = "Savings";
        a1.Deposite(2000);
        a4.show();
        a3.Address = "Delhi";
        a3.AccountType = "FD";
        a3.Deposite(456);
        a4.Address = "Patna";
        a4.AccountType = "FD";
        a4.Deposite(200);
        a2.WithDraw(642);
        a2.Deposite(a2.Getbalance());
        a1.show();
        a2.show();
        a3.show();
    }
}

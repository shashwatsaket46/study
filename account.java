class account 
{
    String AccountName,Address,AccountType;
    double AccountNumber,CurrentBalance;
    account(String Name,double accno,double b)
        { 
            AccountName=Name; 
            AccountNumber=accno; 
            CurrentBalance=b; 
        }
    account(String Name,double accno,String addr,String t,double b)
        {
            AccountName=Name; 
            AccountNumber=accno;
            Address=addr;
            AccountType=t;
            CurrentBalance=b;
        }
    void Deposite(double a)
    {
        CurrentBalance+=a; 
    }
    void WithDraw(double a)
    {
        CurrentBalance-=a;
    }
    double Getbalance()
    {
        return(CurrentBalance); 
    }
    void show()
    {
        System.out.println("************************************************");
        System.out.println(" The Account Details of the person is as follows");
        System.out.println("**************************");
        System.out.println("Account Name : "+AccountName);
        System.out.println("Account No : "+AccountNumber);
        System.out.println("Address : "+Address);
        System.out.println(" Account Type : "+AccountType);
        System.out.println(" Current Balance : "+CurrentBalance);
        System.out.println("*****************************");
    }
}

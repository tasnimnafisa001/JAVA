public class Accout{
    public int accoutNumber;
    public String accountName;
    public double accountBalance;

    public void setaccountNumber(int num)
    {
        accoutNumber = num;
    }
    public int getaccountNumber()
    {
        return accoutNumber;
    }


    public void setaccountName(String n)
    {
        accountName = n;
    }
    public String getaccountName()
    {
        return accountName;
    }

    public void setaccountBalance(double b){
        accountBalance = b;
    }
    public double getaccountBalance()
    {
        return accountBalance;
    }
    public Accout(){
        System.out.println("empty constructor");

    }
    public Accout (int num ,String n,Double b){
        System.out.println("parameterized constructor");
        accoutNumber=num;
        accountName=n;
        accountBalance=b;
    }
    public void showDetails(){
        System.out.println("the accounrNumber is:"+accoutNumber);
        System.out.println("the accounrName is:"+accountName);
        System.out.println("the accounrBalance is:"+accountBalance);
    }
    public static void main(String[] args) {
        Accout obj=new Accout();
        obj.setaccountNumber(45045);
        obj.setaccountName("Tasnim");
        obj.setaccountBalance(2333.52);
        System.out.println("the accountNumber is:"+obj.getaccountNumber());
        System.out.println("the accountName is:"+obj.getaccountName());
        System.out.println("the accounrBalance is:"+obj.getaccountBalance());
             
        Accout obj2 =new Accout(987654,"nafisa",255.444);
        obj2.showDetails();
    }

    
}

    


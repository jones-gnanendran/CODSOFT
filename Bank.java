
public class Bank {
    public   int balance=1000;
    public  void Deposit(int depositAmount)
    {
        balance+=depositAmount;
        System.out.println("Amount Deposited into your Account Sucessfully");
    }
    public  void WithDrawal(int withdrawAmount)
    {
        if(balance<=withdrawAmount)
        {
            balance-=withdrawAmount;
            System.out.println("Amount WithDrawn Successfully");
        }
        else
        {
            System.out.println("Insufficient Balance in your acoount ");
        }
    }
    public  int checkBalance()
    {
        return balance;
    }
    
}

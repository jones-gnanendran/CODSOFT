import java.util.*;
public class ATMInterface {
    public static void main(String[] args)
    {
        Bank  bank=new Bank();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the ATM");
        System.out.println();
        while(true)
        {
        System.out.println("***********************");
        System.out.println("Select the Operation you would like to perform");
        System.out.println("Type 1 and click Enter to Deposit Amount");
        System.out.println("Type 2 and click Enter to Withdraw  Amount");
        System.out.println("Type 3 and click Enter to CheckBalance Amount");
        System.out.println("Type 4 and click Enter to Quit");
        System.out.println("***********************");
        System.out.println();
        System.out.println("Enter the type of the  transaction");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("you have choosen the Option to Deposit an Amount ");
            
           
           
                System.out.print("Enter the amount you want to Deposit: ");
                int Depositeamount=sc.nextInt();
                bank.balance+=Depositeamount;
                System.out.println("Amount Sucessfully Deposited into your Account");
            
        }
        else if(choice==2)
        {
            System.out.println("You have choosen to withdraw money from your account");
           
            
                System.out.print("Enter the amount you want to Withdraw: ");
                int withdrawalamount=sc.nextInt();
                if(bank.balance < withdrawalamount)
                {
                    System.out.println("Insufficient Balance in your account");
                }
                else
                {   
                    bank.balance-=withdrawalamount;
                    System.out.println("Amount Withdrawn from your Account");
                    System.out.println("Bank Balance Updated");
                }
            
            
        }
       else  if(choice==3)
        {
            System.out.println("You have choosen to check your Account Balance");
           
                System.out.println("Your Account balance is: "+ bank.balance);
        }
        else if(choice==4)
        {   sc.close();
            System.exit(0);
            
        }
    
        
    }
}
}

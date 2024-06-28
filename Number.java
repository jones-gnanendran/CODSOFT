import java .util.*;
public class Number
{
    public static void unlimited(int number)
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        
        while(n!=1)
        {
           System.out.println("Please Enter your guess");
            int guess=sc.nextInt();
            if(guess==number)
            {
                System.out.println("Congrats you guessed the number correctly");
                n=1;
            }
            else if(guess>number)
            {
                System.out.println("Oops wrong guess try a little bit lower");
                
            }
            else if(guess<number)
            {
                System.out.println("Oops wrong guess try a little bit higher");
            }
        }
        sc.close();
    }
    public static void limited(int number)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of  tries  you need to Guess the number");
        int limit=sc.nextInt();
        while(limit!=0)
        {   System.out.println("Enter a guess");
            int guess=sc.nextInt();
            if(guess==number)
            {
                System.out.println("Congrats you guessed the number correctly");
                limit=0;
            }
            else if(guess>number)
            {
                System.out.println("Oops wrong guess try a little bit lower");
                limit--;
                System.out.println("No of remaining tries:"+limit);
            }
            else if(guess<number)
            {
                System.out.println("Oops wrong guess try a little bit higher");
                limit--;
                System.out.println("No of remaining tries:"+limit);
            }
        }
        sc.close();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int number=r.nextInt(100);
        System.out.println(number);
       System.out.println("Type 'Limited' for Limited Mode and 'Unlimited' for Unlimited mode");
       String mode=sc.next();
       if(mode.equals("Limited"))
       {
        limited(number);
       }
       else if(mode.equals("Unlimited"))
       {
        unlimited(number);
       }
       else
       {
        System.out.println("Invalid mode");
       }
        sc.close();
    }
}

import java.util.*;
public class StudentGradeCalculator {
    public static String GenerateGrade(float average)
    {
        String Grade="";
        if( average>90)
        {
            Grade+="O";
        }
        else if(average>80 &&  average<=90)
        {
            Grade+="A+";
        }
        else if(average>70 && average<=80)
        {
            Grade+="A";
        }
        else if(average>60 && average<=70)
        {
            Grade+="B+";
        } 
        else if(average>50 && average<=60)
        {
            Grade+="B";
        }
        else if(average>=40 && average<=50)
        {
            Grade+="C";
        }
        else if(average>=35 && average<40)
        {
            Grade+="D";
        }
        else if(average<35)
        {
            Grade+="F";
        }
        String GradeStatement="The Grade for the Student is "+Grade;
        return GradeStatement;

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Subjects:");
        int n=sc.nextInt();
        String[] subjects=new String[n];
        System.out.println("Enter the name of the Subjects:");
        for(int i=0;i<n;i++)
        {
            subjects[i]=sc.next();
        }
        int[] marks=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Marks Obtained in " +subjects[i]+ "(Out of 100) is : ");
            marks[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println();
        int totalmarks=n*100;
        int obtainedmarks=0;
        for(int i:marks)
        {
            obtainedmarks+=i;
        }
        float average=(float)obtainedmarks/n;
        System.out.println("Displaying Detailed Results");
        System.out.println("The Student has Scored "+obtainedmarks+"/"+totalmarks);
        System.out.format("%.2f",average);
        System.out.println();
        System.out.println(GenerateGrade(average));
        sc.close();
    }
}

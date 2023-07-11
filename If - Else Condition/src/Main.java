import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);

        int tamil,english,maths,science,social,total,avg,percentage;

        System.out.println("Enter your Tamil Mark :");
        tamil=in.nextInt();
        System.out.println("Enter your English Mark :");
        english=in.nextInt();
        System.out.println("Enter your Maths Mark :");
        maths=in.nextInt();
        System.out.println("Enter your Science Mark :");
        science=in.nextInt();
        System.out.println("Enter your Social Mark :");
        social=in.nextInt();

        total=tamil+english+maths+science+social;
        avg=total/5;
        percentage=(total*100/500);

        if(total >= 501)
        {
            System.out.println("Invalid Entered Mark");
        }
        else if(total >= 451  &&  total<=500)
        {
            System.out.println("Your Grade is O ");
            System.out.println("Total = "+total);
            System.out.println("Average = "+avg);
            System.out.println("Percentage = "+percentage);
        }
        else if(total >= 401  &&  total<=450)
        {
            System.out.println("Your Grade is A ");
            System.out.println("Total = "+total);
            System.out.println("Average = "+avg);
            System.out.println("Percentage = "+percentage);
        }
        else if(total >= 351  &&  total<=400)
        {
            System.out.println("Your Grade is B ");
            System.out.println("Total = "+total);
            System.out.println("Average = "+avg);
            System.out.println("Percentage = "+percentage);
        }
        else if(total >= 301  &&  total<=350)
        {
            System.out.println("Your Grade is C ");
            System.out.println("Total = "+total);
            System.out.println("Average = "+avg);
            System.out.println("Percentage = "+percentage);
        }
        else if(total >= 201  &&  total<=300)
        {
            System.out.println("Your Grade is D ");
            System.out.println("Total = "+total);
            System.out.println("Average = "+avg);
            System.out.println("Percentage = "+percentage);
        }
        else if(total >= 175  &&  total<=200)
        {
            System.out.println("You are Just Pass ");
            System.out.println("Total = "+total);
            System.out.println("Average = "+avg);
            System.out.println("Percentage = "+percentage);
        }
        else
        {
            System.out.println("You are Fail ");
            System.out.println("Total = "+total);
            System.out.println("Average = "+avg);
            System.out.println("Percentage = "+percentage);
        }
    }
}
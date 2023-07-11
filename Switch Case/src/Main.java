import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int a,b,c,choice;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number :");
        a=in.nextInt();
        System.out.println("Enter second number :");
        b=in.nextInt();
        System.out.println("1.Addition ");
        System.out.println("2.Subtraction ");
        System.out.println("3.Multiplication ");
        System.out.println("4.Division ");
        System.out.println("Enter your choice :");
        choice=in.nextInt();
        switch(choice)
        {
            case 1:
                c=a+b;
                System.out.println("Addition is :"+c);
                break;
            case 2:
                c=a-b;
                System.out.println("Subtraction is :"+c);
                break;
            case 3:
                c=a*b;
                System.out.println("Multiplication is :"+c);
                break;
            case 4:
                c=a/b;
                System.out.println("Division is :"+c);
                break;
            default:
                System.out.println("Invalid Selection");
                break;
        }
    }
}

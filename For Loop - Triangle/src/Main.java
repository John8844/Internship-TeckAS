import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=in.nextLine();
        System.out.println("Enter Limit:");
        int limit=in.nextInt();

        for(int i=1;i<=limit;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
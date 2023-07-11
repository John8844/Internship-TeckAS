import java.util.Scanner;

public class table
{
    public static void main(String args[])
    {
        int table,limit;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter table:");
        table=in.nextInt();55
        System.out.println("Enter limit:");
        limit=in.nextInt();

        int i=1;
        while(i<=limit)
        {
            System.out.println(i+"X"+table+"="+(i*table));
            i++;
        }
    }
}

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Limit :");
        int n=in.nextInt();
        int sum=0,a;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Number "+i+": ");
            a=in.nextInt();
            sum+=a;
        }
        System.out.println("The sum of given number is "+sum);
        System.out.println("The Average of given numbers is "+sum/n);
    }
}
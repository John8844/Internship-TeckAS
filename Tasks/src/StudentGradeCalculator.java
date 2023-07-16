import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        int n,i,mark,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter No. of subjects :");
        n=in.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println("Enter mark from Subject "+i+": ");
            mark=in.nextInt();
            sum+=mark;
        }
        float avg=sum/n;
        System.out.println("The average grade is "+avg);
    }
}
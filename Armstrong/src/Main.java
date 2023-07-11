import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 digit Number:");
        int number=in.nextInt();
        int temp=number;
        int digit1,digit2,digit3;

        digit1=temp%10;
        temp=temp/10;

        digit2=temp%10;
        temp=temp/10;

        digit3=temp%10;

        int result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);

        if (result==number){
            System.out.println(number+" is an Armstrong");
        }
        else {
            System.out.println(number+" is not an Armstrong");
        }
    }
}
import java.util.Scanner;

public class OddEven {
    public static void main(String args[]){
        int even=0,odd=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Number 1 :");
            a[i]=in.nextInt();
        }
        for(int element : a){
            if(element % 2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Total even number is "+even);
        System.out.println("Total odd number is "+odd);
    }
}

import java.util.Random;
import java.util.Scanner;
import java.lang.String;

class  NewGame{
    Scanner in=new Scanner(System.in);
    Random random=new Random();
    int x = random.nextInt(50);
    //int x=5;
    int guess;
    void run(){
        System.out.println("Enter guessing between 1 - 50 :");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter Guessing :");
            guess = in.nextInt();
            if (guess > x && guess<=50) {
                System.out.println("Too High...");
                System.out.println("Try again...");
            }
            else if (guess < x && guess>=1) {
                System.out.println("Too Low...");
                System.out.println("Try again...");
            }
            else if (guess == x) {
                System.out.println("You are Won!");
                break;
            }
            else {
                System.out.println("Guess between 1 - 50 :");
            }
        }
    }
}

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        NewGame obj=new NewGame();
        for(int i=0;i<=50;i++){
            System.out.println("Start New Game (Y/N) :");
            String YesNo=in.nextLine();
            if(YesNo.charAt(0)=='Y' || YesNo.charAt(0)=='y'){
                obj.run();
            }
            else if(YesNo.charAt(0)=='N' || YesNo.charAt(0)=='n'){
                System.out.println("Thank You!");
                break;
            }
        }
    }
}
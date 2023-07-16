import java.util.Random;
import java.util.Scanner;
import java.lang.String;

class  NewGame{
    void run(){
        Scanner in=new Scanner(System.in);
        String[] choices = {"Rock", "Paper", "Scissor"};
        Random random = new Random();
        int randomIndex = random.nextInt(choices.length);
        String computerChoice = choices[randomIndex];
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter your choice (Rock, Paper, or Scissor) :");
            String choice=in.next();
            if((choice.charAt(0)=='R' || choice.charAt(0)=='r') && computerChoice == choices[0]){
                System.out.println("Computer choice :"+computerChoice);
                System.out.println("Player choice :"+choice);
                System.out.println("It's a tie! Try again...");
            }
            else if((choice.charAt(0)=='R' || choice.charAt(0)=='r') && computerChoice == choices[1]){
                System.out.println("Computer choice :"+computerChoice);
                System.out.println("Player choice :"+choice);
                System.out.println("Computer Win!");
                break;
            }
            else if((choice.charAt(0)=='R' || choice.charAt(0)=='r') && computerChoice == choices[2]){
                System.out.println("Computer choice :"+computerChoice);
                System.out.println("Player choice :"+choice);
                System.out.println("Player Win!");
                break;
            }
            else if((choice.charAt(0)=='P' || choice.charAt(0)=='p') && computerChoice == choices[0]){
                System.out.println("Computer choice :"+computerChoice);
                System.out.println("Player choice :"+choice);
                System.out.println("Player Win!");
                break;
            }
            else if((choice.charAt(0)=='P' || choice.charAt(0)=='p') && computerChoice == choices[1]){
                System.out.println("Computer choice :"+computerChoice);
                System.out.println("Player choice :"+choice);
                System.out.println("It's a tie! Try again...");
            }
            else if((choice.charAt(0)=='P' || choice.charAt(0)=='p') && computerChoice == choices[2]){
                System.out.println("Computer choice :"+computerChoice);
                System.out.println("Player choice :"+choice);
                System.out.println("Computer Win!");
                break;
            }
            else if((choice.charAt(0)=='S' || choice.charAt(0)=='s') && computerChoice == choices[0]){
                System.out.println("Computer choice :"+computerChoice);
                System.out.println("Player choice :"+choice);
                System.out.println("Computer Win!");
                break;
            }
            else if((choice.charAt(0)=='S' || choice.charAt(0)=='s') && computerChoice == choices[1]){
                System.out.println("Computer choice :"+computerChoice);
                System.out.println("Player choice :"+choice);
                System.out.println("Player Win!");
                break;
            }
            else if((choice.charAt(0)=='S' || choice.charAt(0)=='s') && computerChoice == choices[2]){
                System.out.println("Computer choice :"+computerChoice);
                System.out.println("Player choice :"+choice);
                System.out.println("It's a tie! Try again...");
            }
            else{
                System.out.println("Enter your choice only (Rock, Paper, or Scissor) :");
            }
        }
    }
}

public class RockPaperScissor {
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
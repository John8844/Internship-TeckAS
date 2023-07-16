import java.util.Scanner;

class count{
    Scanner in=new Scanner(System.in);
    void CountWord(){
        System.out.println("Enter String :");
        String str=in.nextLine();
        StringBuilder sentence=new StringBuilder(str);
        int word=1;
        for(int i=1;i<sentence.length();i++){
            if(sentence.charAt(i)==32){
                i++;
                if(sentence.charAt(i)!=32){
                    word++;
                }else {
                    word++;
                }
            }
        }
        System.out.println("Total count of given sentence is "+word);
    }
}

public class CountWord {
    public static void main(String[] args) {
        count obj=new count();
        obj.CountWord();
    }
}

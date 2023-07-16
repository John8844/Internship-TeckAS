import java.util.Scanner;

class Palindrome{
    void isPalindrome(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the word :");
        String str=in.next();
        StringBuilder word=new StringBuilder(str);
        StringBuilder reverse=new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            reverse.append(word.charAt(i));
        }
        System.out.println(reverse);
        for(int i=0;i<=word.length();i++){
            if(reverse.charAt(i) == word.charAt(i)){
                System.out.println(word+" is a Palindrome");
                break;
            }else {
                System.out.println(word+" is Not a Palindrome");
                break;
            }
        }
    }
}

public class PalindromeOrNot {
    public static void main(String[] args) {
        Palindrome obj=new Palindrome();
        obj.isPalindrome();
    }
}

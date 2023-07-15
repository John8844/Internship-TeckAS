import java.util.Scanner;

public class ASCII {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String :");
        String str=in.nextLine();
        System.out.println("Before Capitalize : "+str);
        StringBuilder a=new StringBuilder(str);

        //First letter manually overriding
        if(a.charAt(0) >=97 && a.charAt(0)<=122){
            int c=(int)a.charAt(0) - 32;
            a.setCharAt(0,(char) c);
        }

        //Space after letter capital
        for(int i=1;i<a.length();i++){
            if(a.charAt(i) == 32){
                i++;
                if(a.charAt(i) >= 97 && a.charAt(i) <=122){
                    int c=(int) a.charAt(i)-32;
                    a.setCharAt(i,(char) c);
                }
                else {
                    if(a.charAt(i) >= 65 && a.charAt(i) <= 90){
                        int c=(int)a.charAt(i) + 32;
                        a.setCharAt(i,(char) c);
                    }
                }
            }
        }
        System.out.println("After Capitalize : "+a);
    }
}

//My name is johnson. i'm studying b. tech 3 year.
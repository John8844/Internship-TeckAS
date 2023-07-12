import java.util.Scanner;

//Method with Varargs in Java
public class VarArgs {
    public static void getNames(String... names){
        for (String name:names){
            System.out.println(name);
        }
    }
    public static void main(String args[]){
        getNames("Thomas","John");
    }
    /*public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String[] names = new String[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter "+i+" Name:");
            names[i]=in.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
    }*/
}

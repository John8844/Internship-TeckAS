import java.util.Scanner;

class Rectangle{
    int length,width;
    Scanner in=new Scanner(System.in);
    Rectangle(){  //constructor
        System.out.println("Constructor Called...");
        System.out.println("Enter length : ");
        length=in.nextInt();
        System.out.println("Enter width : ");
        width=in.nextInt();
    }
    void area(){
        int a=length*width;
        System.out.println("Area of Rectangle is "+a);
    }
}
public class constructor {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        obj.area();
    }
}
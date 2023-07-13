import java.util.Scanner;

class Square{
    private int A;
    int getA(){
        return A;
    }
    void setA(int a){
        A=a;
    }
    void area(){
        int area=A*A;
        System.out.println("Area of Square is : "+area);
    }
}

public class GetterSetter {
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length: ");
        int l=in.nextInt();
        Square obj=new Square();
        obj.setA(l);
        obj.area();
    }
}

import java.util.Scanner;

class Circle{
    private int radius;
    void getInfo(int r){
        radius=r;
    }
    void area(){
        double a=3.14*radius*radius;
        System.out.println("Area of Circle is "+a);
    }
}

public class Class_Obj {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        int r=in.nextInt();
        Circle obj=new Circle();
        obj.getInfo(r);
        obj.area();
    }
}

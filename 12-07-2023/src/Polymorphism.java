//Method Overloading
class MathOperation{
    public static int multiply(int a,int b){
        return a*b;
    }
    public static double multiply(double x,double y){
        return x*y;
    }
}

public class Polymorphism {
    public static void main(String args[]){
        System.out.println("Integer Multiplication: "+MathOperation.multiply(5,2));
        System.out.println("Double Multiplication: "+MathOperation.multiply(5.5,2.5));
    }
}

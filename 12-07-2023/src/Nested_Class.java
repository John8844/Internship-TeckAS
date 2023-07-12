class outer {
    int a = 5;

    class inner {
        int b = 6;
        int c = a + b;

        void innerdisplay() {
            System.out.println("Inner Display");
            System.out.println("A: " + a);
            System.out.println("B: " + b);
            System.out.println("C: " + c);
        }
    }

    void outerdisplay() {
        System.out.println("Outer Display");
        inner i=new inner();
        i.innerdisplay();
    }
}
public class Nested_Class {
    public static void main(String[] args) {
        outer o=new outer();
        o.outerdisplay();
    }
}

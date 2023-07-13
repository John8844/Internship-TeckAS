import java.util.Scanner;

class StudentList {
    public int roll_no;
    public String name;

    StudentList(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    void print() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + roll_no);
        System.out.println("-----------------------------");
    }
}

public class ArrayObject {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter No. of Students: ");
        int n = in.nextInt();

        StudentList[] arr = new StudentList[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Name " + (i + 1) + ": ");
            String name = in.next();
            System.out.println("Enter Roll No for " + name + ": ");
            int roll = in.nextInt();
            arr[i] = new StudentList(roll, name);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
        }
    }
}

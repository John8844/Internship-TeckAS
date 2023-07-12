class GrandFather{
    void house(){
        System.out.println("Have own 2BHK house....");
    }
}
class Father extends GrandFather{ //single inheritance..
    void land(){
        System.out.println("Have oen 2Acres Land...");
    }
}
class Son extends Father{  //multilevel inheritance
    void car(){
        System.out.println("Have own Audi car..");
    }
}

public class Inheritance_Class {
    public static void main(String args[]){
        Son obj=new Son();
        obj.house();
        obj.land();
        obj.car();
    }
}

abstract class Phone{
    void voiceCall(){
        System.out.println("Have Voice call..");
    }
    abstract void camera();
    abstract void display();
}
class Samsung extends Phone{
    void name(){
        System.out.println("Samsung M31");
    }
    @Override
    void camera() {
        System.out.println("Have 13MP Camera..");
    }
    @Override
    void display() {
        System.out.println("Have LCD Display");
        System.out.println("-----------------------------------");
    }
}
class Redmi extends Phone{
    void name(){
        System.out.println("Redmi 9 Power");
    }
    @Override
    void camera() {
        System.out.println("Have 48MP Camera..");
    }
    @Override
    void display() {
        System.out.println("Have Amoled Display..");
    }
    void Security(){
        System.out.println("Have finger print Sensor..");
        System.out.println("-----------------------------------");
    }
}

public class Abstract {
    public static void main(String args[]){
        Samsung M31=new Samsung();
        M31.name();
        M31.voiceCall();
        M31.camera();
        M31.display();
        Redmi pow9=new Redmi();
        pow9.name();
        pow9.voiceCall();
        pow9.camera();
        pow9.display();
        pow9.Security();
    }
}

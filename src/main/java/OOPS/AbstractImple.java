package OOPS;

public class AbstractImple {
    public static void main(String[] args) {
        //Car objr = new Car();s
       // AA obj = new Audi();
        AA obj = new AA();
        obj.start();
        obj.combiCR();
        obj.startRobot();
        obj.display11();
        //obj.stop();
    }
}

 interface  Car{
     default void start(){
         System.out.println("Welcome to start in Car class");
     }
}

interface Robot{
    default void startRobot(){
        System.out.println("Robot welcomes you");
    }
}

class Audi implements Car,Robot {
    void combiCR(){
        System.out.println("This is combiCR");
    }


}

class AA extends Audi{
    void display11(){
        System.out.println("This is the display 111");
    }
}
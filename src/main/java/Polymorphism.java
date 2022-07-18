class Automobile{
    int serial_no;
    String namePlate_Type;
    Automobile()
    {
        //initializing the data members with default values;
        serial_no=11;
        namePlate_Type="Private";
        System.out.println("The Constructor has been called");
        System.out.println("Default values has been initialized");
    }

    void Display(){
        System.out.println("Welcome to Automobile Class");
    }

    void Display(int a, int b){
        System.out.println("You have passed 2 arguments");
    }

    void Display(int a,int b, int c){
        System.out.println("You have passed 3 arguments");
    }
}

class Car extends Automobile{
    void Intro(){
        System.out.println("Welcome to the Car Class");
    }

    @Override
    void Display(){
        System.out.println("Welcome to the Display of Car");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Automobile a1 = new Automobile();
        System.out.println("Printing the Serial Number "+a1.serial_no);
        System.out.println("Printing the type of the vehicle "+a1.namePlate_Type);


        Car c1 = new Car();
        c1.Intro();
        a1.Display();
        c1.Display();

        a1.Display(1,2);
        a1.Display(1,2,5);
    }
}

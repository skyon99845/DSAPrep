import java.util.Scanner;

public class TryHandle {
    public static void main(String[] args) {
        System.out.println("Welcome to Try Catch Final");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int Num = sc.nextInt();
        System.out.println("The number entered is "+Num);

        try{
            System.out.println("Now we are going to Divide the Number by 0. We are using Try and Catch Block to Handle the Exception");
            int result = Num/0;
        }catch(Exception e){
            System.out.println("The Number cannot be divided by zero. It is run time error and logical error.");
        }
        finally{
            System.out.println("We came out of the try and catch block.");
        }
    }
}

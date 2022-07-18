import java.util.Scanner;

public class Code4 {
    //exception handling
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1=sc.nextInt();
        System.out.println("Enter the number2");
        int num2=sc.nextInt();

        try{
            int result=num1/num2;
            System.out.println("The result is "+result);
        }
        catch(ArithmeticException e){
            System.out.println("An Error has been detected"+e);
        }
        finally {
            System.out.println("We are out of the try catch block");
        }

    }
}

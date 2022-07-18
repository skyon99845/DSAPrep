import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println("Program for Factorial");
        /*
        * For Fibonaci series
        * 0! = 1
        * 1! = 1
        * 2! = 1*2 = 2
        * 3! = 1*2*3 = 6
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose Fibonacci Series to be find :");
        int num = sc.nextInt();
        int result=1;
        System.out.println("The number entered is :"+num);
        if(num==0 | num ==1)
        {
            System.out.println("The Factorial is :"+1);
        }
        else {
            System.out.println("Using iterative method to find the Factorial ");
            for (int i = 1; i < num; i++)
            {
                result=result*i;
                System.out.print(i+"*");
            }
            result=result*num;
            System.out.print(num);
            System.out.print(" :"+result);
        }
    }
}

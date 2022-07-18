import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        System.out.println("The Number Entered by the User is:"+num);
        int i=1,num1=0,num2=1;
        int temp=0,SumofNum1Num2=0;
        if(num==0){
            System.out.print(num1);
        }


        while(i<=num)
        {
            System.out.print(num1+" ");

            SumofNum1Num2=num1+num2;
            num1=num2;
            num2=SumofNum1Num2;
            //System.out.println("SumofNum1Num2"+SumofNum1Num2);

            i++;
        }
    }
}

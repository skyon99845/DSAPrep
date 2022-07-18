public class Problem4 {
    public static void main(String[] args) {
        System.out.println("Swapping two numbers without using the third number");
        int a=1,b=3;
        System.out.println("The value of a:"+a+" the value of b:"+b+" before swapping the value");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The value of a:"+a+" the value of b is :"+b+" after swapping ");

    }
}

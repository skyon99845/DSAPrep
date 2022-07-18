public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Program to print reverse String without using String function reverse \n\n");
        String name="I am proud of my Country";
        System.out.println("The String is :"+name);
        System.out.println("Reversing the String using for loop");
        for(int i=name.length()-1;i>=0;i--)
        {
            System.out.print(name.charAt(i));
        }
    }
}

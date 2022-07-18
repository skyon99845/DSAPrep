import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        Integer numbers[]={10,3,4,6,3,8,11,34,2,44,9};
        System.out.println("Printing the sorted array :");
        Arrays.sort(numbers);

        for( int i:numbers)
        {
            System.out.println(i);
        }

        System.out.println("Filling the array with 0 number");
        Arrays.fill(numbers,0);
        System.out.println("Printing the array");
        for(int i:numbers)
        {
            System.out.print(i);
        }

    }
}

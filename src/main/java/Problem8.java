import java.util.Arrays;

public class Problem8 {
    public static void main(String[] args) {
        int[] arrayList = {23,44,1,9,11,43,56,76,37,87,3,6,7,8,91};
        int size=arrayList.length;
        System.out.println("The array is ");

        for(int i=0;i<size;i++) {
            System.out.print(arrayList[i]+" ");
        }
        System.out.println("\nSorted the array");
        Arrays.sort(arrayList);
        for(int i=0;i<size;i++) {
            System.out.print(arrayList[i]+" ");
        }

        System.out.println("\nThe Second Largest Element in the Int Array is :"+arrayList[arrayList.length-2]);




    }
}

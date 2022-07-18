import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem7 {
    public static void main(String[] args) {
        List<Integer> arrayList= new ArrayList<>();
        arrayList.add(19);
        arrayList.add(91);
        arrayList.add(59);
        arrayList.add(69);
        arrayList.add(89);
        arrayList.add(1);
        arrayList.add(17);
        System.out.println("The Array is :"+arrayList);
        Collections.sort(arrayList);
        System.out.println("The sorted array is :"+arrayList);
        System.out.print("The Second largest number is :");
        System.out.print(arrayList.get(arrayList.size()-2));

    }
}

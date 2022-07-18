import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollecionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(13);
        list.add(2);


        System.out.println("Printing the min element :"+ Collections.min(list));
        System.out.println("Printing the max element :"+ Collections.max(list));
        System.out.println("Printing the frequency of the element :"+ Collections.frequency(list,13));

        System.out.println("Sorting the list");
        Collections.sort(list);
        for(int i:list)
        {
            System.out.println(i);
        }
        System.out.println("Sorting the List in reverse order");
        Collections.sort(list, Comparator.reverseOrder());
        for(int i:list)
        {
            System.out.println(i);
        }
    }

}

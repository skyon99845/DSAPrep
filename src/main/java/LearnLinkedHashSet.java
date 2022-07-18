import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
                set.add(1);
                set.add(2);
                set.add(3);
                set.add(4);
                set.add(5);

                System.out.println("The Set is :"+set);


                System.out.println("Removing element 4 :"+set.remove(4));
                System.out.println("Checking the set contains is 9 :"+set.contains(9));
                System.out.println("Checking  set is empty :"+set.isEmpty());
                System.out.println("Checking the size of set :"+set.size());
                System.out.println("Removing all the elements in the set :");
                set.clear();
            }
        }




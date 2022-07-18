import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);

        System.out.println("Printing the Lsit :"+list);



        //using iterator
        System.out.println("Using the iterator");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator "+it.next());
        }


        //using the for loop
        System.out.println("Using the For Loop");
        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}

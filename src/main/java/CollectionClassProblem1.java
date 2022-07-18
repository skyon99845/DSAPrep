import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionClassProblem1 {
    public static void main(String[] args) {
        List<String>al=new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");

        System.out.println("The List is :"+al);

        Iterator it = al.iterator();

        if(it.hasNext())
        {
            System.out.println("The element is :"+it.next());
            //System.out.println("Removing the element "+it.remove(););
            if(it.next()=="B"){
                it.remove();
            }
        }
        System.out.println("Remove :");
        //it.remove();
        System.out.println(al);
    }
}

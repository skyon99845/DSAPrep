import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args) {
        Map<String,Integer> mp = new TreeMap<>();
        mp.put("add",12);
        mp.put("sub",15);
        mp.put("mul",20);
        mp.put("div",30);
        mp.put("elephant",40);

        System.out.println("The TreeMap is :"+mp);
        System.out.println("Printing the entry set ");
        for(Map.Entry<String,Integer> e:mp.entrySet())
        {

            System.out.println(e);

        }
        System.out.println("Printing the key of the TreeMap");
        for(Map.Entry<String,Integer> e:mp.entrySet())
        {
            System.out.println(e.getKey());
        }

        System.out.println("Printing the Value of the TreeMap");
        for(Map.Entry<String,Integer> e:mp.entrySet())
        {
            System.out.println(e.getValue());
        }
    }
}
